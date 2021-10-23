package task3.dom_parse;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import task3.class_library.Laptop;
import task3.class_library.Oven;

import java.io.IOException;
import java.util.ArrayList;

public class DomParser {

    public static void main(String[] args) throws SAXException, IOException {
        ArrayList<Oven> ovenList = new ArrayList<>();
        ArrayList<Laptop> laptopList = new ArrayList<>();
        Oven fill_oven;

        DOMParser parser = new DOMParser();
        parser.parse("src/task3/resources/applianced_db.xsd.xml");
        Document document = parser.getDocument();

        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        NodeList ovens = root.getElementsByTagName("app:ovens");


        for (int i = 0; i < ovens.getLength(); i++) {
//
//            //;
//
//            System.out.println((ovens.item(i).getAttributes()));
//            NodeList nl=ovens.item(i).getChildNodes();
////
////               for(int j=0; j<nl.getLength();i++) {
////
////                  // Element ourElement = (Element) nl.item(i);
////                  System.out.println( nl.item(i).getTextContent().trim());
//////                   System.out.println(nodechild.getNodeName());
//////                   System.out.println(oven_element.getNodeName());
            fill_oven = new Oven();
            System.out.println(ovens.item(i).getNodeName());
            Element oven_element = (Element) ovens.item(i);
            fill_oven.setId(oven_element.getAttribute("id"));
            //fill_oven.setCapacity(Integer.parseInt(getSingleChild(oven_element,"capacity").getTextContent().trim()));

            String tmp=getSingleChild(oven_element,"capacity").getTextContent().trim();
            //System.out.println(tmp);

            String tmp2=getSingleChild(oven_element,"capacity").getNodeName();
            System.out.println(tmp2);

            System.out.println(fill_oven.getId());
            System.out.println(fill_oven.getCapacity());
            ovenList.add(fill_oven);
            fill_oven=null;



        }
        NodeList laptops = root.getElementsByTagName("ovn:laptop");
        for (int i = 0; i < ovens.getLength(); i++) {
        }
    }


    private static Element getSingleChild(Element element, String childName){
        NodeList nlist = element.getElementsByTagName(childName);
        Element child = (Element) nlist.item(0);
        return child;
    }
}
