package com.cognizant.obs;

public interface INotificationService {

	public void addObserver(INotificationObserver ob);
	public void removeObserver(INotificationObserver ob);
	public void notifyObserver();

}