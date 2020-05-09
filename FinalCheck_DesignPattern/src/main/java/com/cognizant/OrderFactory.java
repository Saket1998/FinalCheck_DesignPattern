package com.cognizant;

public class OrderFactory {
	
	public static Order get(ChannelType channel, ProductType productType) {
		if (channel == ChannelType.ECOMMERCE) {
			return new ECommerce().get(productType);
		}
		return new TeleCaller().get(productType);
	}
}
