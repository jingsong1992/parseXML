package com.main.commons;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class XMLManager {
	public static  Document getXmlDoc(String fileName){
		Document xmlDoc = null;
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();;
			xmlDoc = builder.parse(fileName);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmlDoc;
	}
	
	public static String getChildValue(Element aParent,String childName){
		String childValue = null;
		if(aParent == null){
			return null;
		}else{
			Node aNode= findChildNode(childName,aParent);
			if(aNode.getFirstChild() == null){
				return null;
			}else{
				childValue = aNode.getFirstChild().getNodeValue();
			}
		}
		return childValue;	
	}
	
	public static Node findChildNode(String childName,Element aParent){
		if(aParent == null){
			return null;
		}else{
			Node child = aParent.getFirstChild();
			while (child != null)
			{
				if (childName.equals(child.getNodeName())) {
					return child;					
				}
				child = child.getNextSibling();
			}
		}
		return null;	
	}
	public static String getNodeValue(Element element) {
		if (element==null) return null;
		if (element.getNodeType()==Element.ELEMENT_NODE)
		{
			return element.getNodeValue();
		}
		return null;
	}
	public static String getNodeAttribute(Element element,String strNodeAttributeName)
	{
		if (element==null) return null;

			if (element.getNodeType()==Element.ELEMENT_NODE)
			{
				return element.getAttribute(strNodeAttributeName);
			}
			return null;

	}
}
