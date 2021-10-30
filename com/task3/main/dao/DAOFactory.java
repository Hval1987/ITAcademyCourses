package com.task3.main.dao;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final ApplianceDAO ovenDAO = new OvenDAO(/*сюда надо передать лист листов */);
	private final ApplianceDAO laptopDAO = new LaptopDAO();
	private final ApplianceDAO refrigeratorDAO = new RefrigeratorDAO();
	private final ApplianceDAO vacuumCleanerDAO = new VacuumCleanerDAO();
	private final ApplianceDAO tabletPCDAO = new TabletPcDAO();
	private final ApplianceDAO speakersDAO = new SpeakersDAO();
	
	private DAOFactory() {}

	public ApplianceDAO getOvenDAO() {return ovenDAO;}
	public ApplianceDAO getLaptopDao() {return laptopDAO;}
	public ApplianceDAO getRefrigeratorDAO() {return refrigeratorDAO;}
	public ApplianceDAO getVacuumCleanerDAO() {return vacuumCleanerDAO;}
	public ApplianceDAO getTabletPCDAO() {return tabletPCDAO;}
	public ApplianceDAO getSpeakersDAODao() {return speakersDAO;}


	public static DAOFactory getInstance() {
		return instance;
	}
}
