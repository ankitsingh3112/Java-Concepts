package Builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //Builder builder = new Builder();

//      Builder builder = Student.getBuilder();
//      builder.setName("Himanshu");
//      builder.setAge(25);
//      builder.setBatch("MWF Morning");
//      builder.setGradYear(2024);
//
//      //Student student = new Student(builder);
//      Student student = builder.build();
//      System.out.println("DEBUG");

//      Student student1 = new Student(builder)

      Target object = Target.getBuilder()
              .setGrad_year(2022)
              .setName("Himanshu")
              .setAge(25)
              .setBatch("MWF Morning")
              .setInstructor("Ayush Giri")
              .setPsp(89.99)
              .build();

      System.out.println(object);
      
      

	}

}
