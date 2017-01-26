package com.main.parse;


import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.main.bean.Component;
import com.main.bean.Funcattr;
import com.main.commons.XMLManager;
import com.main.getclass.ClassNames;


public class ParseFattrXML {
	public static Funcattr getFuncattrInfo(String functionId){
		Funcattr funcattr = new Funcattr();
		String fattrName = "fattr_"+functionId+"P.xml";
		String fileName = ParseFattrXML.class.getClassLoader().getResource(fattrName).getPath();
		Document xmlDoc = XMLManager.getXmlDoc(fileName);
		Element rootElement = xmlDoc.getDocumentElement();
		String rootDBAttribute =  XMLManager.getNodeAttribute(rootElement, "DATABASE");
		funcattr.setDatabase(rootDBAttribute);
		String rootSCHAttribute =  XMLManager.getNodeAttribute(rootElement, "SCHEMA");
		funcattr.setCemeta(rootSCHAttribute);
		String rootTABAttribute =  XMLManager.getNodeAttribute(rootElement, "TABLENAME");
		funcattr.setTablename(rootTABAttribute);
		NodeList componentNodes = xmlDoc.getElementsByTagName("COMPONENT");
		for(int i=0;i<componentNodes.getLength();i++){
			Component component = new Component();
			Element aParent = (Element) componentNodes.item(i);
			String componenet = XMLManager.getNodeAttribute(aParent, "TRANSACTION");
			component.setTransaction(componenet);
			String name = XMLManager.getChildValue(aParent, "NAME");
			component.setName(name);
			String immEF = XMLManager.getChildValue(aParent, "IMM_EDIT_FLAG");
			component.setImm_edit_flag(immEF);
			String module = XMLManager.getChildValue(aParent, "MODULE");
			component.setModule(module);
			String event = XMLManager.getChildValue(aParent, "EVENT");
			component.setEvent(event);
			String table_name = XMLManager.getChildValue(aParent, "TABLE_NAME");
			component.setTable_name(table_name);
			String table_desc = XMLManager.getChildValue(aParent, "TABLE_DESC");
			component.setTable_desc(table_desc);
			String mainref = XMLManager.getChildValue(aParent, "MAINREF");
			component.setMainref(mainref);
			String trxref = XMLManager.getChildValue(aParent, "TRXREF");
			component.setTrxref(trxref);
			String mappingrule = XMLManager.getChildValue(aParent, "MAPPINGRULE");
			component.setMappingrule(mappingrule);
			String post = XMLManager.getChildValue(aParent, "POST");
			component.setPost(post);
			String bctype = XMLManager.getChildValue(aParent, "BCTYPE");
			component.setBctype(bctype);
			String o2mrule = XMLManager.getChildValue(aParent, "O2MRULE");
			component.setO2mrule(o2mrule);
			funcattr.addComponent(component);
			
		}
		return funcattr;
	}
	public static void test(String funcId) throws Exception{
		Funcattr funAttr = getFuncattrInfo(funcId);
		List<Component> componentList = funAttr.getList();
		for(int i=0;i<componentList.size();i++){
			System.out.println(componentList.get(i).getName());
			String table = componentList.get(i).getTable_name();
			ClassNames dofun = (ClassNames) Class.forName("com.main.getclass."+componentList.get(i).getName()).newInstance();
			dofun.say();
			dofun.getDate(table);
		}
	}
    
}
