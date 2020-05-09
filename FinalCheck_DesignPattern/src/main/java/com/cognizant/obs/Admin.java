package com.cognizant.obs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin extends INotificationObserver {

	private static final Logger LOGGER = LogManager.getLogger(Admin.class);
	
	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() {
		LOGGER.info("Start Notification");
		LOGGER.debug("Hello " + name + " .");
		LOGGER.info("Your Event will start soon...");
		LOGGER.info("Notification will be send through Email/SMS/Whatsapp");
		LOGGER.info("End Notification");
	}

}

