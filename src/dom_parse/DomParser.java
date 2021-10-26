package task3.src.dom_parse;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import task3.src.model.*;

import java.io.IOException;
import java.util.ArrayList;


public class DomParser {

        public static void main(String[] args) throws SAXException, IOException {


            ArrayList<Oven> ovenList = new ArrayList<>();
            ArrayList<Laptop> laptopList = new ArrayList<>();
            ArrayList<Refrigerator> refrigeratorList=new ArrayList<>();
            ArrayList<VacuumCleaner> vcCleanerList=new ArrayList<>();
            ArrayList<TabletPC> tabletPCList=new ArrayList<>();
            ArrayList<Speakers> speakersList=new ArrayList<>();

            DOMParser parser = new DOMParser();
            parser.parse("src/task3/src/resources/applianced_db.xsd.xml");
            Document document = parser.getDocument();

            Element root = document.getDocumentElement();
//            NodeList outerNode =root.getChildNodes();


                NodeList ovensNodes = root.getElementsByTagName("app:oven");
                createOvenList(ovenList, ovensNodes);
                System.out.println();

                NodeList laptopsNode = root.getElementsByTagName("app:laptop");
                createLaptopList(laptopList, laptopsNode);
                System.out.println();

                NodeList refrigeratorNode = root.getElementsByTagName("app:refrigerator");
                createRefrigeratorList(refrigeratorList,refrigeratorNode);
                System.out.println();

                NodeList vcCleanerNode=root.getElementsByTagName("app:vacuum-cleaner");
                createVcCleanerList(vcCleanerList,vcCleanerNode);
                System.out.println();

                NodeList tabletPCNode=root.getElementsByTagName("app:tabletPC");
                createTabletPCList(tabletPCList,tabletPCNode);
                System.out.println();

                NodeList speakersNode=root.getElementsByTagName("app:speaker");
                createSpeakerList(speakersList,speakersNode);
                System.out.println();

        }

    private static void createSpeakerList(ArrayList<Speakers> speakersList, NodeList speakersNode) {
            Speakers fillSpeakers;
            for(int i=0; i<speakersNode.getLength();i++){

                fillSpeakers=new Speakers();
                Element speakersElement=(Element)speakersNode.item(i);

                fillSpeakers.setId(speakersElement.getAttribute("id"));
                fillSpeakers.setPowerConsumption(Integer.parseInt(getSingleChild(speakersElement,"power-consumtion").getTextContent().trim()));
                fillSpeakers.setNumberOfSpeakers(Integer.parseInt(getSingleChild(speakersElement,"number-of-speakers").getTextContent().trim()));
                fillSpeakers.setFrequanseRange(getSingleChild(speakersElement,"frequence-range").getTextContent().trim());

                System.out.println(fillSpeakers);
                speakersList.add(fillSpeakers);
                fillSpeakers=null;
            }

    }

    private static void createTabletPCList(ArrayList<TabletPC> vcCleanerList, NodeList tabletPCNode) {
            TabletPC fillTabletPC;
            for(int i=0;i< tabletPCNode.getLength();i++){

                fillTabletPC=new TabletPC();
                Element tabletPCElement=(Element)tabletPCNode.item(i);

                fillTabletPC.setId(tabletPCElement.getAttribute("id"));
                fillTabletPC.setBatteryCapacity(Double.parseDouble(getSingleChild(tabletPCElement,"battery-capacity").getTextContent().trim()));
                fillTabletPC.setDisplayInch(Double.parseDouble(getSingleChild(tabletPCElement,"display-inch").getTextContent().trim()));
                fillTabletPC.setMemoryRom(Integer.parseInt(getSingleChild(tabletPCElement,"memory-rom").getTextContent().trim()));
                fillTabletPC.setMemoryCapacity(Integer.parseInt(getSingleChild(tabletPCElement,"memory-rom").getTextContent().trim()));
                fillTabletPC.setColor(getSingleChild(tabletPCElement,"memory-rom").getTextContent().trim());
                System.out.println(fillTabletPC);

            }
    }

    private static void createVcCleanerList(ArrayList<VacuumCleaner> vcCleanerList, NodeList vcCleanerNode) {
            VacuumCleaner fillVcCleaner;
            for(int i=0; i<vcCleanerNode.getLength();i++){

                fillVcCleaner=new VacuumCleaner();

                Element vcCleanElement=(Element)vcCleanerNode.item(i);

                fillVcCleaner.setId(vcCleanElement.getAttribute("id"));
                fillVcCleaner.setPowerConsumption(Integer.parseInt(getSingleChild(vcCleanElement,"power-consumption").getTextContent().trim()));
                fillVcCleaner.setFilterType(getSingleChild(vcCleanElement,"filter-type").getTextContent().trim());
                fillVcCleaner.setBagType(getSingleChild(vcCleanElement,"bag-type").getTextContent().trim());
                fillVcCleaner.setWandType(getSingleChild(vcCleanElement,"wand-type").getTextContent().trim());
                fillVcCleaner.setMotorSpeedRegulation(Integer.parseInt(getSingleChild(vcCleanElement,"motor-speed-regulation").getTextContent().trim()));
                fillVcCleaner.setCleaningWidth(Integer.parseInt(getSingleChild(vcCleanElement,"cleaning-width").getTextContent().trim()));

                System.out.println(fillVcCleaner);
                vcCleanerList.add(fillVcCleaner);
                fillVcCleaner=null;
             }

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

        private static void createRefrigeratorList(ArrayList<Refrigerator> refrigeratorList, NodeList RefrigeratorNode) {
            Refrigerator fillRefrigerator;
            for(int i=0;i<RefrigeratorNode.getLength();i++){
                fillRefrigerator=new Refrigerator();
                Element refrElement=(Element)RefrigeratorNode.item(i);
                fillRefrigerator.setId(refrElement.getAttribute("id"));
                fillRefrigerator.setPowerConsumption(Integer.parseInt(getSingleChild(refrElement,"power-consumption").getTextContent().trim()));
                fillRefrigerator.setWeight(Integer.parseInt(getSingleChild(refrElement,"weight").getTextContent().trim()));
                fillRefrigerator.setFreezerCapacity(Integer.parseInt(getSingleChild(refrElement,"freezer-capasity").getTextContent().trim()));
                fillRefrigerator.setOveralCapacity(Double.parseDouble(getSingleChild(refrElement,"overal-capacity").getTextContent().trim()));
                fillRefrigerator.setHeight(Double.parseDouble(getSingleChild(refrElement,"height").getTextContent().trim()));
                fillRefrigerator.setWidth(Double.parseDouble(getSingleChild(refrElement,"height").getTextContent().trim()));

                System.out.println(fillRefrigerator);
                refrigeratorList.add(fillRefrigerator);
                fillRefrigerator=null;

            }
     }

        private static Element getSingleChild(Element element, String childName) {
            NodeList nlist = element.getElementsByTagName(childName);
            Element child = (Element) nlist.item(0);
            return child;
        }

    }


