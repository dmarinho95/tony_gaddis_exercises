package refresher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class sentenceCapitalizer
{
	public static char [] sentenceCapitalizer(String str)
	{
		
		ArrayList <Character> char_array = new ArrayList<Character>();
		ArrayList <Character> char_array2 = new ArrayList<Character>();
		for(int i=0; i<=str.length()-1;i++)
		{
		char_array.add(str.charAt(i));
    	}
	
		for(int i=0 ; i<str.length()-1;i++)
		{
		   if(char_array.get(i)=='.')
		   {
			 char_array2.add(Character.toUpperCase(char_array.get(i+2)));
		   }
		   
		}
		for(int j=0; j<char_array2.size();j++)
		{
			for(int i=0 ; i<str.length()-1;i++)
			{
			if(Character.toLowerCase(char_array.get(i))==(Character.toLowerCase(char_array2.get(j)))&&char_array.get(i-2)=='.')
						{
			                  char_array.set(i, char_array2.get(j));
		
						}
			
			}
		
		}
		
	    char [] char_array_formatted = new char [char_array.size()];
	    char_array_formatted = char_array.toString().replace(",", " ").replace("[", " ").replace("]", " ").toCharArray(); 
		
		return char_array_formatted;
		
	}
	
	public static void main (String [] args)
	{
		String str = "Aye yo. whats up my name is Marinho.";
		System.out.println(sentenceCapitalizer.sentenceCapitalizer(str));
	
	}
	
	
}
			
	

	

