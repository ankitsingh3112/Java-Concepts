package customException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new MyException("Custom made Exception Thrown");
		}
		catch(MyException e) {
			System.out.println("Inside catch Block");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Outside catch block");

	}

}
