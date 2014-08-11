package com.persistent.interfaces;

public class ArrayEmptyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayEmptyException()
	{
		super("Array is empty");
	}
	public ArrayEmptyException(String message)
	{
		super(message);
	}
}
