package com.xworkz.demo.coffee;

import com.xworkz.demo.coffee.dao.BlueToothDAO;
import com.xworkz.demo.coffee.dto.BlueToothDTO;
public class BlueToothDAOStarter{
	public static void main(String[] args) {
	
	BlueToothDAO dao= new BlueToothDAO();
	BlueToothDTO bluetooth1 = new BlueToothDTO();
	BlueToothDTO bluetooth2 = new BlueToothDTO("Intex", 30, 3.5f, 2, 250);
	BlueToothDTO bluetooth3 = new BlueToothDTO("boat", 40, 5.5f, 2, 250);
	dao.add(bluetooth2);
	dao.delete(2);
}
}
