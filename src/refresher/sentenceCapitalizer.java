package refresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sentencecapitalizer 
{
	String sentence;
	
	public sentencecapitalizer (String sentence)
	{
		this.sentence = sentence;
	}

	
	public void sentencecapitalizer()
	{
	  ArrayList <Character> arraylist = new ArrayList <Character>();
	  for(int i=0; i<=sentence.length()-1;i++)
	  {
		  arraylist.add(sentence.charAt(i));
      }
	  for(int i=0; i<=arraylist.size()-1;i++)
	  {
		  arraylist.set(0, Character.toUpperCase(arraylist.get(0)));
		  if(arraylist.get(i)=='.' && Character.isLowerCase(arraylist.get(i+2)))
		  {
			  arraylist.set(i+2, Character.toUpperCase(arraylist.get(i+2)));
		  }
	  }
	  System.out.println(arraylist);
	}
	
	public static void main (String [] args) 
	{
		String sentence = "hello. my name is Joe. what is your name ?";
		sentencecapitalizer myformatter = new sentencecapitalizer (sentence);
		myformatter.sentencecapitalizer();
		
	}
}
