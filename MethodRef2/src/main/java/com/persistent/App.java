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
        HighTemp high= new HighTemp(10);
        HighTemp[] temps ={new HighTemp(10),new HighTemp(9),new HighTemp(11),new HighTemp(10),new HighTemp(10),new HighTemp(10)};
        System.out.println(temperatureCheckCounter(HighTemp::sameTemp,temps,high));
    }
    
    public static <T> int  temperatureCheckCounter(FunctionalInf2<T> intf2,T[] highTemps, T high)
    {
    	int count = 0;
    	for (T highTemp:highTemps)
    	{
    		if(intf2.func(high, highTemp))
    			count++;
    	}
    	return count;
    }
}
