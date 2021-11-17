package com.xworkz.demo;

public class Stadium {

	
	private String name;
	private String city;
	private int areaInMeters;
	
	public Stadium()
	{
		System.out.println("invokedno-arg constructor of stadium ");
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			System.out.println("the parameter passed is not null");
			if(obj instanceof Stadium)
			{
				System.out.println("It is an instance of Stadium");
				Stadium s1 = (Stadium)obj;
				String name1 = s1.getName();
				if(this.name.equals(name1))
				{
					System.out.println("the name of Stadium is matching");
					return true;
				}
				else
				{
					System.out.println("the name of Stadium is not matching");
				}
				
			}
			else
			{
				System.out.println("It is not an instance of Stadium");
			}
		}
		else
		{
			System.out.println("the parameter passed is null");
	
		}
		return false;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAreaInMeters() {
		return areaInMeters;
	}

	public void setAreaInMeters(int areaInMeters) {
		this.areaInMeters = areaInMeters;
	}
	
	
}
