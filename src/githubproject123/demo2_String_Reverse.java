package githubproject123;

import java.util.Scanner;

public class demo2_String_Reverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter Name: ");
		String name = sc.next();
		
		String reverse_String = "";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			reverse_String=reverse_String + name.charAt(i);
		}
		
		System.out.println("Reverse name: "+ reverse_String);	
	}
	
}
