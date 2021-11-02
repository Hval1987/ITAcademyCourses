package model.criteria;

import java.util.*;
import java.util.Map;

public class Criteria {

	private Map<String, String> params=new HashMap<String, String>();

	public Map<String, String> getParams() {
		return params;
	}

	private ArrayList<String> valuesArrayString=new ArrayList<>(); //сюда будем закидывать строки с критериями
	private static final String FIND_IN_APPLIANCE_TYPE = "type";


	public Criteria() {}

	public Criteria(String applianceType) {
		params.put(FIND_IN_APPLIANCE_TYPE, applianceType);
	}

	public ArrayList<String> getValuesArrayString() {
		return valuesArrayString;
	}

	for(Map.Entry entry:params.entrySet()){   //почему-то не видит params  0_o
		valuesArrayString.add(entry.toString());
	}




//	Set<String> keys=params.keySet();
//	ArrayList<String> values= new ArrayList<>(params.values());

}





	
	

