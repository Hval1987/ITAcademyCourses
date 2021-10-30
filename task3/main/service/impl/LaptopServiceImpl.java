package com.task3.main.service.impl;

import com.task3.main.dao.ApplianceDAO;
import com.task3.main.dao.DAOFactory;
import com.task3.main.model.Applianced;
import com.task3.main.model.Laptop;
import com.task3.main.model.criteria.Criteria;
import com.task3.main.service.ApplianceService;

public class LaptopServiceImpl implements ApplianceService {

        @Override
        public Applianced find(Criteria criteria) {
//		if (!Validator.criteriaValidator(criteria)) {
//			return null;  нужно сделать скорее всего проверку на нулл
//		}
            // идем в слой дао и там производим поиск
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getLaptopDao();

            Laptop finededOven = (Laptop) applianceDAO.find(criteria);

            // you may add your own code here

            return finededOven;
        }

    }




