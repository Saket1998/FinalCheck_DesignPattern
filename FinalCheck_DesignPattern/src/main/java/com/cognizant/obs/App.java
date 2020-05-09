package com.cognizant.obs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {

		LOGGER.info("Start");
		INotificationService s = new NotificationService();
		INotificationObserver a1 = new Admin(s, "Saket", 103);
		INotificationObserver a2 = new Admin(s, "Ram", 110);
		INotificationObserver a3 = new Admin(s, "Shyam", 99);
		s.addObserver(a1);
		s.addObserver(a2);
		s.addObserver(a3);
		s.notifyObserver();
		s.removeObserver(a2);
		s.notifyObserver();
		LOGGER.info("End");
	}

}
