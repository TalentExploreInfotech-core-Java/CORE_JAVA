package com.persistent;


public class App2 {
	interface HelloWorld {
		String hello(String name);
	}

	public static void main(String[] args) {	      
		 HelloWorld helloWorld =( (String name) -> { return "Hello " + name; });
		 System.out.println(helloWorld.hello("Joe"));
	}
}

