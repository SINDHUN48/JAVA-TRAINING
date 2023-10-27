package com.tnsif.day2;

import java.util.*;

public class StringTask {

		static boolean is_vow(char c)
		{
			return (c =='a') || (c == 'e') ||
				   (c == 'i') || (c =='o') ||
				   (c == 'u');
		}
		static void removeVowels(String str)
		{
			System.out.println(str.charAt(0));  //c
			  for (int i = 1;i < str.length(); i++)
			  if ((!is_vow(str.charAt(i - 1)))  ||	
				 (!is_vow(str.charAt(i))))
			      System.out.println(str.charAt(i));
		}
		public static void main(String args[])
		{
			String str;
			Scanner in = new Scanner(System.in);
			str= in.nextLine(); //cool
			removeVowels(str);
			in.close();

	}

}
