package Strings;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "Welcome to Core Java";
	int count = 0;
	System.out.println("Entered the String is :"+str);
	for(int i=0; i < str.length(); i++)
	{
		if (str.charAt(i) !=' ')
			count++;
		System.out.println("Total Number of Characters "+count);
	} 
	System.out.println("Total Number of Characters in the String without space"+count);
}
}
