/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class StringReverse {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String nstr="";
		int length=s.length();
		for(int i=0;i<length;i++)
		{
		char a=s.charAt(i);
		nstr=a+nstr;
		System.out.println(nstr);
		
	}
	System.out.println(nstr);
}}