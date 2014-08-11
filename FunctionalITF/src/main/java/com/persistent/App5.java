package com.persistent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

import com.persistent.interfaces.GenericInterface;

public class App5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi world");
		int[] intArr = new int[]{1,2,3};
		String[] strArr = new String[]{"1","2","3"};
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		List<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("1");
		strList.add("1");
		GenericInterface<Integer> intGen = (List<Integer>list) -> {
			int  sum=0;
			for(Integer i:list)
			{
				sum = sum+i; 
			}
			return sum;
		};
		GenericInterface<String> stringGen = (list) -> {
			String  sum="";
			for(String  str:list)
			{
				sum = sum+str; 
			}
			return sum;
		};
		System.out.println(intGen.func(intList));
		System.out.println(stringGen.func(strList));
	}
	

}
