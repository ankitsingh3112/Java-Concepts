package customException;

public class InvalidAge {
	
	static void validate(int age) throws AgeInvalidException{
		if(age<18) throw new AgeInvalidException("Person is Underage");
		
		else {
			System.out.println("Welcome you are eligible for registration");
		}
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		try {
			validate(22);
			validate(25);
			validate(15);
		}
		catch(AgeInvalidException e) {
			System.out.println("Exception: -> "+e.getMessage());
		}

	}

}
