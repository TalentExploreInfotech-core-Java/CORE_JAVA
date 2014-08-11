package com.persistent;

import com.persistent.interfaces.MyFunctionalInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        function(new FunctionalImpl());
        function(new MyFunctionalInterface(){

			public void doSomeThing() {
				System.out.println("executing inner method");
				
			}
        	
        });
       // MyFunctionalInterface intf = ( )  -> System.out.println("executing lambda method");
        function( () -> {System.out.println("executing lambda method");} );
        
    }
    public static void function(MyFunctionalInterface intf)
    {
    	intf.doSomeThing();
    }
}
