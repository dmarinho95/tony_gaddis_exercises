package refresher;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberRetrieval {
	public static List <String> contactInfoDatabase = new ArrayList <>();
	
	
	
	
	public void SetContactInfo (String surname ,String firstname, String phonenumber)
	{
		contactInfoDatabase.add(surname);
		contactInfoDatabase.add(firstname);
		contactInfoDatabase.add(phonenumber);
	}
		 
	public void getContactInfo(String name)
	{
		for(int i=0;i<=contactInfoDatabase.size()-1;i++)
		{
			if(contactInfoDatabase.get(i).equalsIgnoreCase(name))
			{
				System.out.println(contactInfoDatabase.get(i)+" "+contactInfoDatabase.get(i+1)+" "+contactInfoDatabase.get(i+2));
			 
			}
		}
	
   }
	
	public int getDatabaseSize()
	{
		return contactInfoDatabase.size();
	}
			 
		 
	public static void main (String [] args)
	{
		PhoneNumberRetrieval myContactInfo = new PhoneNumberRetrieval();
		myContactInfo.SetContactInfo("Marinho","Daniel","2676088663");
		myContactInfo.SetContactInfo("Lewis", "Martin", "4123456890");
		myContactInfo.SetContactInfo("Marinho","Reuben", "2679083890");
		PhoneNumberRetrieval otherContactInfo = new PhoneNumberRetrieval();
		otherContactInfo.SetContactInfo("Smith","Rogers","67378390");
		otherContactInfo.SetContactInfo("Smith", "Banks", "3903909390");
		myContactInfo.getContactInfo("Marinho");
		myContactInfo.getContactInfo("Lewis");
		otherContactInfo.getContactInfo("Smith");
		System.out.println(otherContactInfo.getDatabaseSize());
		
	}

	


}