package Strings;

import java.util.Scanner;

public class StringPalendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
        
		String name;
		name = sc.nextLine();
		
		System.out.println("You have entered the string as :"+ name);
		
		int length = name.length();
		String rev="";
		System.out.println("Length of the String is :"+length);
		
		for(int i=length-1;i>=0;i--) 
		{
			rev = rev+name.charAt(i);;
		}
		System.out.println("Reverse of the String is :"+rev);
		
		if (rev.equals(name))
		{
			
			System.out.println("String is Palendrome   : " + rev);
		}
		else
		{
			System.out.println("String is not a palendrome   : "+name);
		}

	}

}
