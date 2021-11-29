package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//sc.useDelimiter(System.getProperty("line.separator"));
		String name;
		System.out.println("Enter the String :");
		name = sc.nextLine();
	    
	    System.out.println("You have entered the string is "+name);
	    
	   
	    int length=name.length();
	    System.out.println("Lenght is "+length);
	    String rev ="";
		
		  for(int i=length-1;i>=0;i--) 
		  
		  { rev = rev+name.charAt(i);
		  System.out.println("Reverse of "+rev);
		  
		  } 
		
		  System.out.println("Reverse of  "+name+ "is  "+rev);
		 
		

	}

}
