package com.xworkz.demo;

import java.util.*;


public class TreeSetStarter {

public static void main(String[] args) {
	TreeSet<String> t1 = new TreeSet<String>();
	
	t1.add("d");
	t1.add("b");
	t1.add("a");
	t1.add("b");
	t1.add("c");
	t1.add("b");
	t1.add("c");
	
	System.out.println(t1);
	
	TreeSet<Integer> t2 = new TreeSet<Integer>();

	t2.add(6);
	t2.add(4);
	t2.add(8);
	t2.add(1);
	t2.add(8);
	t2.add(6);
	System.out.println(t2);

	
}
	
	
}
