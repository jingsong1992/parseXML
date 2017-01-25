package com.main.parse;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.main.commons.XMLManager;

public class ParseFunRootXML {
	public static void getFuncIdByName(String funcName) throws Exception{
		String fileName = ParseFunRootXML.class.getClassLoader().getResource("function_root.xml").getPath();
		Document xmlDoc = XMLManager.getXmlDoc(fileName);
		NodeList funcList = xmlDoc.getElementsByTagName("func");
		for(int i=0;i<funcList.getLength();i++){
			Element aParent = (Element) funcList.item(i);
			String funcDesc = XMLManager.getNodeAttribute(aParent, "desc");
			String funcId = XMLManager.getNodeAttribute(aParent, "id");
			if(funcName.equals(funcDesc)){
				ParseFattrXML.test(funcId);
				break;
			}
		}
	}
}
