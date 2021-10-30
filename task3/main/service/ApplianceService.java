package com.task3.main.service;

import com.task3.main.model.Applianced;
import com.task3.main.model.criteria.Criteria;

public interface ApplianceService {	
	
	Applianced find(Criteria criteria);
	
}
