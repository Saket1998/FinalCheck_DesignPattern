package com.cognizant.obs;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NotificationService implements INotificationService {

	static final Logger LOGGER = LogManager.getLogger(NotificationService.class);
	
	List<INotificationObserver> list = null;

	public NotificationService() {
		super();
		list = new ArrayList<INotificationObserver>();
	}

	@Override
	public void addObserver(INotificationObserver ob) {
		LOGGER.info("Adding Observer");
		list.add(ob);
	}

	@Override
	public void removeObserver(INotificationObserver ob) {
		LOGGER.info("Removing Observer");
		list.remove(ob);
	}

	@Override
	public void notifyObserver() {
		for (INotificationObserver observer : list) {
			if (observer.getNoOfTickets() > 100) {
				observer.nofication();
			}
		}
	}

}
