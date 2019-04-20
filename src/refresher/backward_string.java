package refresher;
import java.util.ArrayList;

public class backward_string
{
   public static void main (String [] args)
   {
	   
	   String str1= "Daniel Marinho";
	   System.out.println("This is your string backwards");
	   backward_string.backword_string(str1);
	   System.out.println(" ");
	   System.out.println("The amount of characters in your string is"+ " " +backward_string.String_counter(str1));
	   
   } 
   
   public static void backword_string(String str)
   {
	   char [] char_array = new char [str.length()];
	   for(int i=0; i<=str.length()-1;i++)
	   {
		  char_array[i]= str.charAt(i);
	   }
	   
	   for(int i= str.length()-1; i>=0;i--)
	   {
		  System.out.print(char_array[i]);
	   }
   }

   
   public static int String_counter(String str)
   {
	   int count=0;
	   char [] char_array = new char [str.length()];
	   for(int i=0; i<=str.length()-1;i++)
	   {
		  char_array[i]= str.charAt(i);
		 
	   }
	   
	   for (int i=0;i<=char_array.length-1;i++)
	   { 
		   if(char_array[i]==' ')
		   {
			   count= count+1;
			   
		   }
		   
	   }
	   
	   return count+1;
	   
	   
   	}
}
