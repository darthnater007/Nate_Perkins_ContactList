import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to your contact list. ");
		
		String choice = "Y";
		
		while (choice.equalsIgnoreCase("Y"))
		{
			System.out.print("Enter Contact First Name:      ");
			String FirstName = sc.nextLine();
			
			System.out.print("Enter Contact Last Name:       ");
			String LastName = sc.nextLine();
			
			System.out.print("Enter Contact Phone Numnber:   ");
			String Phone = sc.nextLine();
			
			System.out.print("Enter Contact Email Address:   ");
			String Email = sc.nextLine();
			
			Contact newContact = new Contact(FirstName, LastName, Phone, Email);
			
			Contact.printContact(FirstName, LastName, Phone, Email);
			
			while (!choice.equalsIgnoreCase("N")) 
			{
				System.out.print("\nContinue ?  y/n:  ");
				choice = sc.next();
				
				if (choice.equalsIgnoreCase("Y")) {
					sc.nextLine();
					break;
				}else if (choice.equalsIgnoreCase("N")) {
					sc.nextLine();
					continue;
				}else{
					System.out.println("Please enter y or n.");
					sc.nextLine();
					continue;	
				}
			}
			
		}
		sc.close();
		System.out.println("Bye!");

	}

}
