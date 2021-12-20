package com.xworkz.demo.collect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AssetContainer implements Asset {

	Collection<Object> collect = new ArrayList();

	
	@Override
	public void addAsset(Object obj) {
		System.out.println("Invoked addAsset()");
		collect.add(obj);
	}

	@Override
	public boolean searchAsset(Object obj) {
		System.out.println("Invoked getAsset()");
		return collect.contains(obj);
		
	}

	@Override
	public boolean updateAsset(Object obj, String newName) {
		System.out.println("Invoked updateAsset()");

		ArrayList container=(ArrayList)collect;
		int index=container.indexOf(obj);
		Object asset=container.get(index);
		if(obj instanceof Mobile) {
			System.out.println("yes instance of mobile");
			Mobile mobile=(Mobile)asset;
			mobile.setName(newName);
		}
		else if(obj instanceof Book)
		{
			System.out.println("yes instance of Book");
			Book book=(Book)asset;
			book.setName(newName);
		}
		return true;
	}

	@Override
	public void deleteAsset(Object obj) {
		System.out.println("Invoked deleteAsset()");
		collect.remove(obj);
	}

	@Override
	public void displayAsset() {
		System.out.println("Invoked displayAsset()");
		 System.out.println(collect);
		
	}

}
