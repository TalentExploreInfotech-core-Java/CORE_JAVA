package com.persistent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StringFunctions strFunc = new StringFunctions();
        methodRefFunc(StringFunctions::add, "Nishant", "Niranjan");
       // methodRefFunc(strFunc::add, "Nishant", "Niranjan");
        methodRefFunc(strFunc::addReverse, "Nishant", "Niranjan");
    }
    
    public static void methodRefFunc(FunctionalIntf fintf,String str1, String str2)
    {
    	fintf.func(str1, str2);
    }
    /*public static void sameMethodRefFunc(FunctionalIntf fintf,String str1, String str2)
    {
    	StringFunctions strObj = new StringFunctions("Nishant");
    	fintf.func(strObj, str2);
    }*/
}
