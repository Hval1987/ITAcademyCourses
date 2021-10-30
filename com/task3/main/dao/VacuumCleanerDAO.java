package com.task3.main.dao;

import com.task3.main.model.Applianced;
import com.task3.main.model.criteria.Criteria;

public class VacuumCleanerDAO implements ApplianceDAO {

        @Override
        public Applianced find(Criteria criteria) {
            //заглушка. тут мы должны искать по критериям и вернуть объект vacuum-cln
            return null;
        }
    }

