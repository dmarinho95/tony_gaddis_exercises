/**
 * 
 */
package refresher;

import java.util.ArrayList;

/**
 * @author Daniel Marinho
 *
 */
public class WordSeparator 
{
	String sentence;
	
	public WordSeparator(String sentence)
	{
		this.sentence=sentence;
	}

	public void WordSeparator()
	{
		ArrayList <Character> sentencearray = new ArrayList <Character>();
		StringBuilder string = new StringBuilder ();
		for(int i=0;i<=sentence.length()-1;i++)
		{
			sentencearray.add(sentence.charAt(i));
		}
	
		for(int i=0;i<=sentencearray.size()-1;i++)
		{
			if(Character.isUpperCase(sentencearray.get(i)))
			{
				string.append(' ');
			}
			
			string.append(sentencearray.get(i));
		}
		
		System.out.println(string);
	}
	
	public static void main (String[]args)
	{
		String string = "StopAndSmellTheRoses";
		WordSeparator myWordSeparator = new WordSeparator(string);
		myWordSeparator.WordSeparator();
	}
}
