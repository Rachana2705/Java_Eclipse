package com.xworkz.demo.exception;

import javax.swing.text.html.HTMLDocument.RunElement;

public class HouseFullRunTimeException extends RuntimeException{

	public HouseFullRunTimeException() {

	}
	public HouseFullRunTimeException(String message)
	{
		System.out.println(message);
	}
}
