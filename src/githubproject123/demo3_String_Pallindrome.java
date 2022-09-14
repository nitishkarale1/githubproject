package githubproject123;

public class demo3_String_Pallindrome 
{
	public static void main(String[] args) 
	{
		String S1="'level'";
		
		String S2="";
		
		for(int i=S1.length()-1; i>=0; i--)
		{
			S2=S2+S1.charAt(i);
		}
		
		if(S1.equals(S2))
		{
			System.out.println("given String " + S1 +" is a pallindrome String.");
		}
		else
		{
			System.out.println("given String " + S1 + " is not a pallindrome String.");
		}
		
	}
}
