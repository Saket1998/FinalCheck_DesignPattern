package com.cognizant;

public class TeleCaller {
	public Order get(ProductType productType) {
		if (productType == ProductType.ELECTRONIC) {
			return new ElectronicOrder(ChannelType.TELECOMM, productType);
		} else if (productType == ProductType.FURNITURE) {
			return new FurnitureOrder(ChannelType.TELECOMM, productType);
		}
		return new ToysOrder(ChannelType.TELECOMM, productType);
	}
}


