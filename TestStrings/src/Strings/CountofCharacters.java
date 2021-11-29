package Strings;

import java.util.Scanner;

public class CountofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String name;
		name =sc.nextLine();
		System.out.println("You have entered the string  : "+name);
		int strchar = name.length();
		System.out.println("Total of Number Characters in the string is : "+strchar);
		
		int spaceCount=0;
		for (int i =0;i < name.length();i++) {
			if (name.charAt(i)== ' ')
			{
				spaceCount++;
				
			}
		}
		System.out.println("Total Number of spaces is "+spaceCount);
		int totstr = strchar- spaceCount;
		
		System.out.println("Total Number of String is "+totstr);
				

	}

}
