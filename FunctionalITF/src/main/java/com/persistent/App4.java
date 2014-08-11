package com.persistent;

import java.util.ArrayList;
import java.util.List;

import com.persistent.interfaces.MyFunctionalInterfaces2;

public class App4 {
 public static void main(String[] args)
 {
	 System.out.println("head of integer");
	 List<Integer> intList = new ArrayList<Integer>();
	 intList.add(1);
	 intList.add(2);
	 intList.add(3);
	 MyFunctionalInterfaces2 intf = list -> {
		 int sum =0;
		 double avg;
		 for(int  i: list)
		 {
		 	sum = sum + i;
		 }
		 avg = (double)sum/list.size();
		 return avg;
		 };
		 average(intf,intList);
		 
 }
 public static void average(MyFunctionalInterfaces2 intf, List<Integer> list)
 {
	 System.out.println(intf.average(list));
 }
}
