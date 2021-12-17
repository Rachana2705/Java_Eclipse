package com.xworkz.demo.collect;

public interface Asset {

	public void addAsset(Object obj);
	
	public boolean searchAsset(Object obj);
	
	public boolean updateAsset(Object obj, String newName);
	
	public void deleteAsset(Object obj);
	
	public void displayAsset();
}
