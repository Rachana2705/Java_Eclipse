package com.xworkz.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Alphabet {

	public static void main(String[] args) {
		
	ArrayList<Character> array = new ArrayList<Character>();
	ArrayList<Character> array1 = new ArrayList<Character>();
	Set<Character> set = new HashSet<Character>(); 

	String s = "Aakkdjiief";
	String s1 = s.toLowerCase();
    char[] ch = s1.toCharArray();
    for (int i = 0; i < ch.length; i++) {
    	array.add(ch[i]);
    	set.add(ch[i]);
    }
    for(Character i:set)
    {
    	array1.add(i);
    }

    int count=0;
    for(int i=0;i<array1.size();i++)
    {
    	for(int j=0;j<array.size();j++)
    	{
    		if(array1.get(i)==array.get(j))
    		{
    			count++;
    		}
    	}
    	System.out.println(array1.get(i)+""+count);
    	count =0;
    }
    
    System.out.println("==============================");
    System.out.println("Using map");
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    for(Character letter : array)
    {
    	if(map.containsKey(letter))
    	{
    		Integer i =map.get(letter);
    		i++;
    		map.put(letter, i);
    	}
    	else
    	{
    		map.put(letter, 1);
    	}
    }
    for(Map.Entry entry : map.entrySet())
    {
    	System.out.println(entry.getKey()+""+entry.getValue());
    }
   
    
}
}

