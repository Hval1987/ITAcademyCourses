package com.task3.main.service.impl;


import com.task3.main.dao.ApplianceDAO;
import com.task3.main.dao.DAOFactory;
import com.task3.main.model.Applianced;
import com.task3.main.model.Oven;
import com.task3.main.service.ApplianceService;
import com.task3.main.model.criteria.*;


public class OvenServiceImpl implements ApplianceService{

	@Override
	public Applianced find(Criteria criteria) {
//		if (!Validator.criteriaValidator(criteria)) {
//			return null;  нужно сделать скорее всего проверку на нулл
//		}
		// идем в слой дао и там производим поиск
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getOvenDAO();



		Oven finededOven = (Oven) applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return finededOven;
	}

}

//you may add your own new classes
