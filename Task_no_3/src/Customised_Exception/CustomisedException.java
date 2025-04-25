package Customised_Exception;

public class CustomisedException {
	
	public static String validateEmail(String email) throws ValidateEmail{
		if (email.contains("@")) {
			return "Valid Email : "+email;
		}
		else {
			throw new ValidateEmail("Invalid Mail");
		}
	}
	
	public static void main(String args[]) {
		String email="Mohan@gmail.com";
		
		try {
			String validEmail=validateEmail(email);
			System.out.println(validEmail);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());	
		}

	}

}
