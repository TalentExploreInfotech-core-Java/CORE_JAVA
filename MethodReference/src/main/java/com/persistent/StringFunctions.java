package com.persistent;

public class StringFunctions {
	private String string;
	public StringFunctions() {
		super();
	}
	public static void add(String str1, String str2)
	{
		System.out.println(str1+str2);
	}
	public void addReverse(String str1, String str2)
	{
		System.out.println(str2+str1);
	}
	public boolean same(String str)
	{
		return string==str;
	}
	public StringFunctions(String string) {
		super();
		this.string = string;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	@Override
	public String toString() {
		return "StringFunctions [string=" + string + "]";
	}

}
