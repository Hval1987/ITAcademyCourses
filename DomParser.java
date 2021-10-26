package task3.dom_parse;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import task3.model.Laptop;
import task3.model.Oven;
import task3.model.Refrigerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DomParser {

        public static void main(String[] args) throws SAXException, IOException {

            Oven fillOven;
            Laptop fillLaptop;
            Refrigerator fillRefrigerator;

            DOMParser parser = new DOMParser();
            parser.parse("src/task3/resources/applianced_db.xsd.xml");
            Document document = parser.getDocument();

            Element root = document.getDocumentElement();
//            NodeList outerNode =root.getChildNodes();


                NodeList ovensNodes = root.getElementsByTagName("app:oven");

                ArrayList<Oven> ovenList = new ArrayList<>();

                createOvenList(ovenList, ovensNodes);

                System.out.println();

                NodeList laptopsNode = root.getElementsByTagName("app:laptop");

                ArrayList<Laptop> laptopList = new ArrayList<>();

                createLaptopList(laptopList, laptopsNode);

                NodeList refrigeratorNode = root.getElementsByTagName("app:refrigerator");

                ArrayList<Refrigerator> RefrigeratorList=new ArrayList<>();

                createRefrigeratorList(RefrigeratorList, laptopsNode);

        }

        private static void createOvenList(ArrayList<Oven> ovenList, NodeList ovens) {
            Oven fillOven;
            for (int i = 0; i < ovens.getLength(); i++) {

                fillOven = new Oven();
                Element oven_element =(Element)  ovens.item(i);
                fillOven.setId(oven_element.getAttribute("id"));
                fillOven.setPowerConsumption(Integer.parseInt(getSingleChild(oven_element,"power-consumption").getTextContent().trim()));
                fillOven.setWeight(Integer.parseInt(getSingleChild(oven_element,"weight").getTextContent().trim()));
                fillOven.setCapacity(Integer.parseInt(getSingleChild(oven_element,"capacity").getTextContent().trim()));
                fillOven.setDepts(Integer.parseInt(getSingleChild(oven_element,"dept").getTextContent().trim()));
                fillOven.setHeight(Double.parseDouble(getSingleChild(oven_element,"height").getTextContent().trim()));
                fillOven.setDepts(Double.parseDouble(getSingleChild(oven_element,"width").getTextContent().trim()));
                System.out.println(fillOven);

                ovenList.add(fillOven);
                fillOven = null;


            }
        }


        private static void createLaptopList(ArrayList<Laptop> laptopList, NodeList laptops) {
            Laptop fillLaptop;
            for (int i = 0; i < laptops.getLength(); i++) {
                fillLaptop=new Laptop();

                Element laptop_element=(Element)laptops.item(i);
                String  x=laptop_element.getAttribute("id");
                fillLaptop.setId(laptop_element.getAttribute("id"));

                fillLaptop.setBattery_capacity(Double.parseDouble(getSingleChild(laptop_element,"battery-capacity").getTextContent().trim()));
                fillLaptop.setOs(getSingleChild(laptop_element,"os").getTextContent().trim());
                fillLaptop.setMemory_rom(Integer.parseInt(getSingleChild(laptop_element,"memory-rom").getTextContent().trim()));
                fillLaptop.setSystem_memory(Integer.parseInt(getSingleChild(laptop_element,"system-memory").getTextContent().trim()));
                fillLaptop.setCpu(Double.parseDouble(getSingleChild(laptop_element,"cpu").getTextContent().trim()));
                fillLaptop.setDisplay_inch(Double.parseDouble(getSingleChild(laptop_element,"display-inch").getTextContent().trim()));

                System.out.println(fillLaptop);
                laptopList.add(fillLaptop);
                fillLaptop=null;

            }

        }

        private static void createRefrigeratorList(ArrayList<Refrigerator> laptopList, NodeList RefrigeratorNode) {



        }

        private static Element getSingleChild(Element element, String childName) {
            NodeList nlist = element.getElementsByTagName(childName);
            Element child = (Element) nlist.item(0);
            return child;
        }

    }


