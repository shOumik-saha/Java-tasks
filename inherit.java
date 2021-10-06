class Person{
	private String name;
	private String email;
   Person()
   {
	   System.out.println("This is default constructor");
   }
  public void setPerson(String a, String b)
   {
	  this.name = a;
   this.email = b; 
   }
   public String getName()
   {
	   return name;
   }
   public String getEmail()
   {
	   return email;
   }
   public void showPerson()
   {
	   System.out.println("Printing Person------ ");
	   System.out.println("Name: "+getName());
	   System.out.println("Email: "+getEmail());
	   System.out.println("----------------------");
   }
}
class Student extends Person 
   {
	private String studentId;
	private String admissionDate;
	private String nameS;
	private String emailS;
   Student()
   {
	   System.out.println("This is default constructor");
   }
  public void setStudent(String A, String B,String C,String D)
   {
	  this.studentId = A;
   this.admissionDate = B;
   this. nameS= C;
   this. emailS=D;
   }
   public String getStudentId()
   {
	   return studentId;
   }
   public String getSadmissionDate()
   {
	   return admissionDate;
   }
   public String getSname()
   {
	   return nameS;
   }
   public String getSemail()
   {
	   return emailS;
   }
   public void showStudent()
   {
	   System.out.println("Printing Student--------");
	   System.out.println("ID : "+getStudentId());
	   System.out.println("Admission Date: "+getSadmissionDate());
	   System.out.println("Name: "+getSname());
	   System.out.println("Email: "+getSemail());
	   System.out.println("-----------------------");
   }
}
class Teacher
{
	private String employeeId;
	private String joiningDate;
	private String nameT;
	private String emailT;
   Teacher()
   {
	   System.out.println("This is default constructor");
   }
  public void setTeacher(String E, String F,String G,String H)
   {
   this.employeeId = E;
   this.joiningDate = F;
   this. nameT= G;
   this. emailT=H;   
   }
   public String getEmployeeId()
   {
	   return employeeId;
   }
   public String getJoiningDate()
   {
	   return joiningDate;
   }
   public String getTname()
   {
	   return nameT;
   }
   public String getTemail()
   {
	   return emailT;
   }
   public void showTeacher()
   {  System.out.println("\n");
	  System.out.println("Printing Teacher-------- ");
	  System.out.println("ID: "+getEmployeeId());
	  System.out.println("Joining Date: "+getJoiningDate());
	  System.out.println("Name: "+getTname());
	  System.out.println("Email: "+getTemail());
	  System.out.println("-----------------------");
   }
}
public class inherit {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setPerson("James Bond", "bond@aiub.edu");
		s1.setStudent("19-39348-1", "13/01/2015","James Bond","bond@aiub.edu");
		s1.showStudent();
        Teacher t1 = new Teacher();
		t1.setTeacher("1-00000-1", "13/01/2015 ", "Karl Ei","karl@aiub.edu");
		t1.showTeacher();
	}
}