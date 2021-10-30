package com.task3.main.dao;

import com.task3.main.model.Applianced;
import com.task3.main.model.criteria.Criteria;

public interface ApplianceDAO {
	Applianced find(Criteria criteria);
}
