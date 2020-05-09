package com.cognizant;

public class ECommerce {
	public Order get(ProductType productType) {
		if (productType == ProductType.ELECTRONIC) {
			return new ElectronicOrder(ChannelType.ECOMMERCE, productType);
		} else if (productType == ProductType.FURNITURE) {
			return new FurnitureOrder(ChannelType.ECOMMERCE, productType);
		}
		return new ToysOrder(ChannelType.ECOMMERCE, productType);
	}
}


