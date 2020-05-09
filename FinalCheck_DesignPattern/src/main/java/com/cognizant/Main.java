package com.cognizant;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	public static void main(String[] args) {

		// Orders from E-Commerce Website
		LOGGER.info("Start");
		Order o1 = OrderFactory.get(ChannelType.ECOMMERCE, ProductType.ELECTRONIC);
		o1.processOrder();
		Order o2 = OrderFactory.get(ChannelType.ECOMMERCE, ProductType.FURNITURE);
		o2.processOrder();
		Order o3 = OrderFactory.get(ChannelType.ECOMMERCE, ProductType.TOYS);
		o3.processOrder();
		LOGGER.info("End");
		
		
		// Orders from Tele Caller Agents Application
		LOGGER.info("Start");
		Order o4 = OrderFactory.get(ChannelType.TELECOMM, ProductType.ELECTRONIC);
		o4.processOrder();
		Order o5 = OrderFactory.get(ChannelType.TELECOMM, ProductType.FURNITURE);
		o5.processOrder();
		Order o6 = OrderFactory.get(ChannelType.TELECOMM, ProductType.TOYS);
		o6.processOrder();
		LOGGER.info("End");
	}
}


