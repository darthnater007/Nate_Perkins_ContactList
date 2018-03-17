public class Contact {
	
	private String FirstName;
	private String LastName;
	private String Phone;
	private String Email;

	public Contact() 
	{
		FirstName = "";
		LastName = "";
		Phone = "";
		Email = "";
		
	}
	
	public Contact(String FirstName, String LastName, String Phone, String Email) 
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Phone = Phone;
		this.Email = Email;
	}
	
	//getters and setters for Contact()

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	//other methods
	
	public static void printContact(String firstName, String lastName, String phone, String email)
	{
		
		String ContactMessage="--------------------------------------\n"
							+ "----Current Contact-------------------\n"
							+ "--------------------------------------\n"
							+ "Name:           " + firstName + " " + lastName + "\n"
							+ "Email Address:  " + email + "\n"
							+ "Phone Number:   " + phone + "\n"
							+ "--------------------------------------\n"
							+ "--------------------------------------\n";
		System.out.println(ContactMessage);
		
	}
	
	
}
