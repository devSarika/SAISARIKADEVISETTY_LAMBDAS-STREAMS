package com.epam.LAMBDAS_AND_STREAMS;
import java.util.*;
import java.util.stream.Collectors;

public class StringsStartingWithCharA {
	public static void main(String args[]) {
		List<String> li = new ArrayList<String>();
		System.out.println("Enter number of words:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String s;
			s=sc.next();
			li.add(s);
		}
		li=li.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
		for(String listItem:li)
		{
			System.out.println(listItem);
		}
		sc.close();
	}
}
