package com.persistent;

import java.util.ArrayList;
import java.util.List;

import com.persistent.util.MathCmp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        List<Double> doubles = new ArrayList<Double>();
        doubles.add(1.0);
        doubles.add(2d);
        doubles.add(5.0);
        List<Double> newDoubles = new ArrayList<Double>();
        newDoubles.add(1.0);
        newDoubles.add(2d);
        newDoubles.add(5.0);
        
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(5);
        MathCmp<Double> cmp = new MathCmp<Double>(doubles);
        MathCmp<Double> cmp1 = new MathCmp<Double>(newDoubles);
        MathCmp<Integer> cmp2 = new MathCmp<Integer>(ints);
        System.out.println(cmp.compare(cmp1));
        System.out.println(cmp.compare(cmp2));
        System.out.println(cmp.compare(cmp));
    }
}
