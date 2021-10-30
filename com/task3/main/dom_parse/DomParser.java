package com.task3.main.dom_parse;

import com.task3.main.model.*;
import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


import java.io.IOException;
import java.util.ArrayList;


public class DomParser {
           private ArrayList<ArrayList<Applianced>> appliancedList;

           //конструктор
           public DomParser( /*в теории можно вставить путь к файлу xml */) {



           }

           //самый основной метод
           public ArrayList<ArrayList<Applianced>> parse() throws IOException, SAXException {



            ArrayList<ArrayList<Applianced>> appliancedList=new ArrayList<>();

            DOMParser parser = new DOMParser();
            parser.parse("D:\\epamCours\\src\\com\\task3\\resources\\applianced_db.xsd.xml");
            Document document = parser.getDocument();

            Element root = document.getDocumentElement();



                NodeList ovensNodes = root.getElementsByTagName("app:oven");
                createOvenList(appliancedList, ovensNodes);
                System.out.println();
                System.out.println(appliancedList.size());

                NodeList laptopsNode = root.getElementsByTagName("app:laptop");
                createLaptopList(appliancedList, laptopsNode);
                System.out.println();
                System.out.println(appliancedList.size());

                NodeList refrigeratorNode = root.getElementsByTagName("app:refrigerator");
                createRefrigeratorList(appliancedList,refrigeratorNode);
                System.out.println();

                NodeList vcCleanerNode=root.getElementsByTagName("app:vacuum-cleaner");
                createVcCleanerList(appliancedList,vcCleanerNode);
                System.out.println();

                NodeList tabletPCNode=root.getElementsByTagName("app:tabletPC");
                createTabletPCList(appliancedList,tabletPCNode);
                System.out.println();

                NodeList speakersNode=root.getElementsByTagName("app:speaker");
                appliancedList=createSpeakerList(appliancedList,speakersNode);
                System.out.println();
                System.out.println("кол-во элементов в списке- "+appliancedList.size());
                return appliancedList;

           }

           //getter
           public ArrayList<ArrayList<Applianced>> getAppliancedList(){
           return appliancedList;
           }


           private  ArrayList<ArrayList<Applianced>> createOvenList(ArrayList<ArrayList<Applianced>> appliancedList, NodeList ovens) {
        Oven fillOven =new Oven();
        ArrayList<Applianced> ovenList = new ArrayList<>();
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
        appliancedList.add(ovenList);
        return  appliancedList;
    }

           private  ArrayList<ArrayList<Applianced>> createLaptopList(ArrayList<ArrayList<Applianced>> appliancedList, NodeList laptops) {
        Laptop fillLaptop=new Laptop();
        ArrayList<Applianced> laptopList = new ArrayList<>();
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
        appliancedList.add(laptopList);
        return appliancedList;

    }

           private  ArrayList<ArrayList<Applianced>> createRefrigeratorList(ArrayList<ArrayList<Applianced>> appliancedList, NodeList RefrigeratorNode) {
        Refrigerator fillRefrigerator =new Refrigerator();
        ArrayList<Applianced> refrigeratorList = new ArrayList<>();

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
        appliancedList.add(refrigeratorList);
        return  appliancedList;
    }

           private  ArrayList<ArrayList<Applianced>> createVcCleanerList(ArrayList<ArrayList<Applianced>> appliancedList, NodeList vcCleanerNode) {
        VacuumCleaner fillVcCleaner=new VacuumCleaner();
        ArrayList<Applianced> vacuumCleanerList = new ArrayList<>();
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
            vacuumCleanerList.add(fillVcCleaner);
            fillVcCleaner=null;
        }
        appliancedList.add(vacuumCleanerList);
        return appliancedList;

    }

           private  ArrayList<ArrayList<Applianced>>createTabletPCList(ArrayList<ArrayList<Applianced>> appliancedList, NodeList tabletPCNode) {
        TabletPC fillTabletPC=new TabletPC();
        ArrayList<Applianced> tabletPcList=new ArrayList<>();
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
            tabletPcList.add(fillTabletPC);
            fillTabletPC=null;

        }
        appliancedList.add(tabletPcList);
        return appliancedList;
    }

           private  ArrayList<ArrayList<Applianced>> createSpeakerList(ArrayList<ArrayList<Applianced>> appliancedList, NodeList speakersNode) {
            Speakers fillSpeakers=new Speakers();
            ArrayList<Applianced> speakersList = new ArrayList<>();

            for(int i=0; i<speakersNode.getLength();i++){

                fillSpeakers=new Speakers();
                ArrayList<Applianced> vacuumClList = new ArrayList<>();

                Element speakersElement=(Element)speakersNode.item(i);

                fillSpeakers.setId(speakersElement.getAttribute("id"));
                fillSpeakers.setPowerConsumption(Integer.parseInt(getSingleChild(speakersElement,"power-consumtion").getTextContent().trim()));
                fillSpeakers.setNumberOfSpeakers(Integer.parseInt(getSingleChild(speakersElement,"number-of-speakers").getTextContent().trim()));
                fillSpeakers.setFrequanseRange(getSingleChild(speakersElement,"frequence-range").getTextContent().trim());

                System.out.println(fillSpeakers);
                speakersList.add(fillSpeakers);
                fillSpeakers=null;
            }
            appliancedList.add(speakersList);
            return appliancedList;

    }

           private static Element getSingleChild(Element element, String childName) {
            NodeList nlist = element.getElementsByTagName(childName);
            Element child = (Element) nlist.item(0);
            return child;
        }


    }


