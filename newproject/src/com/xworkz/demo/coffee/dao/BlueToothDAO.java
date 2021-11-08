package com.xworkz.demo.coffee.dao;

import com.xworkz.demo.coffee.dto.BlueToothDTO;
public class BlueToothDAO {

	private BlueToothDTO[] blueTooth = new BlueToothDTO[10];
	private int count = 0;
	
	public BlueToothDAO()
	{}
	
	public void add(BlueToothDTO blueT) {
		if(blueT!=null && count<this.blueTooth.length)
		{
			this.blueTooth[count]=blueT;
			System.out.println("added "+blueT.getBrand());
			count++;
		}
		else
		{
			System.out.println("You have passed null or the container is full ");
		}
	}
	
	public void delete(int index)
	{
		if(index>=0 && index<this.blueTooth.length)
		{
			this.blueTooth[index]=null;
			System.out.println("deleted "+index);
		}
		else
		{
			System.out.println("the index should be less than "+this.blueTooth.length);
		}
	}
}
