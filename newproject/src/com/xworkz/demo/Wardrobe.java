package com.xworkz.demo;

public class Wardrobe {
	private String[] wardrobe = new String[6];
	private int cloth = 0;
	
	public boolean add(String newDress) 
	{
		if(newDress!=null && cloth<this.wardrobe.length)
		{
			this.wardrobe[cloth]=newDress;
			System.out.println("added ".concat(newDress));
			this.cloth++;
			return true;
		}
		else
		{
			System.out.println("New Dress cannot be null or Wardrobe is full");
		}
		return false;
	}
	
	public boolean update(int index,String updateDress)
	{
		if(index>=0 && index<this.wardrobe.length && updateDress!=null)
		{
			this.wardrobe[index] = updateDress;
			System.out.println("updated dress ".concat(updateDress));
			return true;
		}
		else
		{
			System.out.println("update Dress cannot be null or index should be less than "+wardrobe.length);
		}
		return false;
	}
	
	public boolean delete(int index) 
	{
		if(index>=0 && index<this.wardrobe.length)
		{
			String test = this.wardrobe[index];
			this.wardrobe[index]=null;
			System.out.println("deleted ".concat(test));
			this.cloth--;
			return true;
		}
		else
		{
			System.out.println("index value should be less than "+wardrobe.length);
		}
		return false;
	}
	
	public boolean match(String dress)
	{
		for(int index=0;index<this.wardrobe.length;index++)
		{
			if(this.wardrobe[index]!=null)
			{
				if(this.wardrobe.equals(dress))
				{
					System.out.println("match found "+dress);
					return true;
				}	
			}
		}
		return false;
	}
	
	public boolean firstletter(String ch)
	{
		for(int index=0;index<this.wardrobe.length;index++)
		{
			String test = this.wardrobe[index];
			if(test!=null)
			{
				boolean res = test.startsWith(ch);
				if(res)
				{
				System.out.println("found dress whose name starts with "+ch+" "+test);
				return true;
				}
			}
		}
		System.out.println("No dress starts with "+ch);
		return false;
	}

	public boolean lastletter(String ch)
	{
		for(int index=0;index<this.wardrobe.length;index++)
		{
			String test = this.wardrobe[index];
			if(test!=null)
			{
				boolean res = test.endsWith(ch);
				if(res) {
				System.out.println("found dress whose name ends with "+ch+" "+test);
				return true;
				}
			}
		}
		System.out.println("No dress ends with "+ch);
		return false;
	}
	
	public void displayDetails()
	{
		System.out.println("Display invoked ");
		for(int i=0;i<this.wardrobe.length;i++)
		{
			System.out.println(this.wardrobe[i]);
		}
	}
	
}
