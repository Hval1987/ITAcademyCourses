package com.task3.main.mainRun;


import com.task3.main.dom_parse.DomParser;
import com.task3.main.model.Applianced;
import com.task3.main.model.*;
import com.task3.main.model.criteria.Criteria;
import com.task3.main.service.ApplianceService;
import com.task3.main.service.ServiceFactory;
import com.task3.main.model.criteria.SearchCriteria;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException, SAXException {
		Applianced appliance;
		ArrayList<ArrayList<Applianced>> targetList;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service ;

		//создам лист с листами,в которых хранятся объекты по категориям
		DomParser parsDocument=new DomParser();
		parsDocument.parse();
		targetList=parsDocument.getAppliancedList();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);

		//создаю через фабрику подходящий под объект сервис
		service=factory.getOvenService();

		appliance = service.find(criteriaOven);

		//вывожу данные о найденом объекте..
		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

		service=factory.getOvenService();
		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

		service=factory.getTabletPcService();
		appliance = service.find(criteriaOven);// find(Object...obj)

		PrintApplianceInfo.print(appliance);

	}

}
