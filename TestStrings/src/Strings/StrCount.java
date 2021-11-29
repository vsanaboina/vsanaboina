package Strings;

import java.util.*;

public class StrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int count =0;
		int i = 0;
		System.out.println("Enter the String, To count of characters ");
		String str = sc.nextLine();
		
		System.out.println("Before do while loop");
		
	
		do
		{
			if (str.charAt(i) != ' ')  // this condition is used to avoid the space 
			{
				count++;
				
			}
			i++;
		}
		while (i<str.length());
		System.out.println("Total Number of Characters in String "+ count);
	}

}
