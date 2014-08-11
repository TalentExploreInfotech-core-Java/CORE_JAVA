package com.persistent.util;

import java.util.ArrayList;
import java.util.List;

public class MathCmp <T extends Number>{
	private List<T> numbers;
	public List<T> getNumbers() {
		return numbers;
	}
	public void setNumbers(List<T> numbers) {
		this.numbers = numbers;
	}
	public MathCmp(List<T>  numbers)
	{
		this.numbers = numbers;		
	}
	
	public boolean compare (MathCmp<?> second)
	{
		int size = numbers.size();
		int secondSize = second.getNumbers().size();
		int number, secondNumber;
		int no = (size>secondSize)?size:secondSize;
		for(int i=0 ; i<no ; i++)
		{
			number = numbers.get(i).intValue();
			secondNumber = second.getNumbers().get(i).intValue();
		
			if(!(numbers.get(i).equals(second.getNumbers().get(i))))
				return false;
		}
		return true;
	}
}
