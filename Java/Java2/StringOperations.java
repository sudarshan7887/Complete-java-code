
/*
 String operations
 length : use to find the length of String.
 Concat : use to concat two Strings
 spilt : use to split a string
 Replace : replace a String
 SubString : you select a part of string
 toUpper : convert a string into upper case
 toLower : convert a string into Lower case
 
 */

import java.util.Scanner;
public class StringOperations 
{

	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings:  ");
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		//String Concatenation
//		String s3 = s1.concat(s2);      //or
		String s3 = s1 + s2;
		System.out.println("The concatenation of 2 strings is: " + s3);
		System.out.println();
		
		//length
		int l1 = s1.length();
		System.out.println("The length of first String is : " +l1);
		
		int l2 = s2.length();
		System.out.println("The length of Second String is : " +l2);
		System.out.println();
		
		//upperCase
		s1 = s1.toUpperCase();
		System.out.println("String in uppercase : "+s1);
		
		//lowercase
		s2 = s2.toLowerCase();
		System.out.println("String in Lower case: "+s2);
		System.out.println();
		
		//replace
		s2 = s2.replace(s2, s1);
		System.out.println("The replace String is : "+s2);
		System.out.println();
		
		
	}

}
