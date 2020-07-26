package com.epam.LAMBDAS_AND_STREAMS;
import java.util.*;
import java.util.stream.IntStream;

public class PalindromeStrings {
	public static void main(String args[]) {
		List<String> li = new ArrayList<String>();
		System.out.println("Enter number of words:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the words");
		for(int i=0;i<n;i++)
		{
			String s;
			s=sc.next();
			li.add(s);
		}
		li=isPalindrome(li);
		System.out.println("The Palindromic strings in the given list of strings are:");
		for(String i:li)
            System.out.println(i);
		sc.close();
	}
	static List<String> isPalindrome(List<String> l1)
    {
        List<String> l2=new ArrayList<String>();
           for(String i:l1)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                l2.add(i);}
            return l2;
    }
}
