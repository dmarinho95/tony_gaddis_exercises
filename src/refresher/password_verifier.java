package refresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class password_verifier {
	
	String password;
	boolean length = false;
	boolean case_requirement = false;;
	boolean digit = false;
	
	
	public password_verifier (String password) {
		
		this.password = password;
	}

	
	public void length_verifier ()
	{
		if(password.length()>6)
		{
			length=true;
		}
	
		else
		{
			length=false;
		}
	}
	
	public void case_requirement() {
		ArrayList <Character> charArray = new ArrayList <Character> ();
		for (int i=0; i<= password.length()-1;i++)
		{
			charArray.add(password.charAt(i));
		}
		
		for (int i=0;i<=charArray.size()-1;i++)
		{
			if (Character.isUpperCase(charArray.get(i)))
			{
				case_requirement = true;
				break;
			}
		}
		
	}
	
	public void digit_requirement() {
		ArrayList <Character> charArray = new ArrayList <Character> ();
		ArrayList <Character> numArray = new ArrayList <> (Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
		for (int i=0; i<= password.length()-1;i++)
		{
			charArray.add(password.charAt(i));
		}
		for(int i=0; i<=charArray.size()-1;i++)
		{
			for(int j=0; j<=numArray.size()-1;j++)
			{
				if(charArray.get(i)==numArray.get(j))
				{
					digit = true;
				}
			}
		}
	   
	}
	
	public void verificaton() {
		if(length==true && case_requirement == true && digit ==true)
		{
			System.out.println("Your password meets all the requirments");
		}
		
		else
		{
			System.out.println("Please check your password again");
		}
	}

	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		String user_input;
		System.out.println("Please enter password");
		user_input = keyboard.nextLine();
		password_verifier mypassword_verifier = new password_verifier (user_input);
		mypassword_verifier.length_verifier();
		mypassword_verifier.case_requirement();
		mypassword_verifier.digit_requirement();
		mypassword_verifier.verificaton();

	}

}
