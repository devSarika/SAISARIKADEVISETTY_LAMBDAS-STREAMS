package com.epam.LAMBDAS_AND_STREAMS;

import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class AverageOfIntegerList {
	    public static void main(String[] args) {
	        IntStream stream = IntStream.of(10, 20, 30, 30, 50, 60, 70, 80, 90);
	        OptionalDouble obj = stream.average();
	        if (obj.isPresent()) {
	            System.out.println(obj.getAsDouble());
	        } else {
	            System.out.println(-1);
	        }
	    }
	
}
