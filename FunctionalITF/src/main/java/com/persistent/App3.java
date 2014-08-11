package com.persistent;

import com.persistent.interfaces.MyFunctionalInterfaces1;

public class App3 {

	public static void main(String[] args) {
		MyFunctionalInterfaces1 intf = (n1,n2) -> {System.out.println("n1::"+n1+"  n2::"+n2);
		System.out.println("this is a second line");};
		greet(intf,5,6);

	}
	public static void greet(MyFunctionalInterfaces1 intf, int n1, int n2)
	{
		intf.print(n1,n2);
	}

}
