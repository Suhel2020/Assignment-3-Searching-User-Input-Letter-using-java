import java.util.Scanner;

public class String {

	public static void main(java.lang.String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		java.lang.String str ;
		java.lang.String str2 = "" ;
		char letter ;
		
	    System.out.println("Enter any sentence = ");
	    str = scan.nextLine();
		System.out.println("Enter Letter = ");
		letter = scan.next().charAt(0);
		
		int length = str.length();
		
		for(int i = 0 ; i<length ; i ++)
		{
			char letter2 = str.charAt(i);
			if(letter == letter2)
			{
			   str2 = str.substring(i+1);
			   System.out.println(str2);
			   break;
			}
			
		}
		if(str2.length() == 0 )
		{
			System.out.println("letter doesnot exist");
		}
		
		
	}

}
