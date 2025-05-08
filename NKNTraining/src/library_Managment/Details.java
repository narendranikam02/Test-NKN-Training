package library_Managment;

public class Details {

	public static void main(String[] args) 
	{
		//Book Details
		String Titleofthebook = "Software Testing Principles and Practice";
		String Authorname = "Shrinivasan Desikan";
		int Yearofpublication = 2006;
		float Priceofthebook = 500.10F;
		boolean bookavailablity = true;
		//Member Details
		String MemberName = "Narendra Nikam";
		int MemberId = 1001;
		char MembershipType = 'A'; //A=Adult, C=Child, S=Senior
		//Borrowing Status
		int NoOfDaysBookBorrowed =6;
		int noofextradays = NoOfDaysBookBorrowed-3;
		int noofextradays1= 0;
		float FinePerDay = 10.00F;
		
		int finalextradays = (noofextradays>=1)? noofextradays :noofextradays1;  
		
		float TotalFine = (finalextradays*FinePerDay);
		
		  
		
		
	System.out.println("Library Managemnet System");
	System.out.println("");
	System.out.println("Book Details:");
	System.out.println("Title of The Book   : "+ Titleofthebook);
	System.out.println("Author's Name       : "+ Authorname);
	System.out.println("Year of Publication : "+ Yearofpublication);
	System.out.println("Price of the Book   : "+ Priceofthebook);
	System.out.println("Book is available   : "+ bookavailablity);
	System.out.println("");
	System.out.println("Member Details:");
	System.out.println("Name of the member   : "+ MemberName);
	System.out.println("Member ID number     : "+ MemberId);
	System.out.println("Type of membership   : "+ MembershipType);
	System.out.println("");
	System.out.println("Borrowing Status:");
	System.out.println("Number of days book borrowed         : "+ NoOfDaysBookBorrowed);
	
	if(noofextradays>=1)
	System.out.println("Extra Number of days book borrowed   : "+ noofextradays);
	
	System.out.println("Fine per extra day                   : Rupees "+ FinePerDay);
	System.out.println("Total fine to be Paid                : Rupees "+ TotalFine);
	}

}
