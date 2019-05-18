package refresher;

public class vowel_consonant_counter
{
	String argument;
	char [] char_array;
    int vowel_count=0;
    int consonant_count=0;
	final char [] vowel_array = {'a','e','i','o','u'};
	final char[] consonant_array = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	
	public vowel_consonant_counter (String argument)
	{
		this.argument = argument;
		char_array = new char [argument.length()];
	}
	
	
	
	public void vowel_counter()
	{
		for (int i=0;i<=argument.length()-1;i++)
		{
			 char_array[i] = argument.charAt(i);
		}
		for (int i=0;i<=char_array.length-1;i++)
		{
			 for (int j=0; j<=vowel_array.length-1;j++)
			 {
				 if(Character.toLowerCase(char_array[i])==vowel_array[j])
				 {
					 vowel_count=vowel_count+1;
				 }
				 
			 }
		
		}
		
		System.out.println(vowel_count);
	}

	public void consonant_counter ()
	{
		for(int i=0; i<=char_array.length-1;i++)
		{
			for(int j=0;j<=consonant_array.length-1;j++)
			{
				if(Character.toLowerCase(char_array[i])==consonant_array[j])
				{
					consonant_count = consonant_count+1;
				}
			}
		}
	
		System.out.println(consonant_count);
	}
	

	
	
	public static void main (String [] args)
	{
		String argument = "MalikYoba";
		vowel_consonant_counter vc = new vowel_consonant_counter(argument);
		vc.vowel_counter();
		vc.consonant_counter();
		
	}
}
