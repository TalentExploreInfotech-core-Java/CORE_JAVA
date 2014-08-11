package com.persistent;

import com.persistent.interfaces.ArrayEmptyException;
import com.persistent.interfaces.CheckedExceptionInterface;

public class App6 {

	public static void main(String[] args)  {
		int number=6;
		CheckedExceptionInterface<Integer> intf = (arr) -> {
			if(arr.length==0)
				throw new ArrayEmptyException();
			for(int i:arr)
			System.out.println("Array->"+i);
			System.out.println("Outside number is ->"+number);
		//number =9; is not allowed 
		};
		Integer[] intArr= {1,2,3};
		try
		{
			intf.func(intArr);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
