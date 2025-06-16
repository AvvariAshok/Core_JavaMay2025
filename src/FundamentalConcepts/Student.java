package FundamentalConcepts;

public class Student {
	
     static String CollegeName;
      String sName;
      int rollNo;
    static  String Qualification;
      
    public  Student(String CollegeName,String sName,int rollNo,String Qualification ) { 
    	this.CollegeName=CollegeName;
    	this.sName=sName;
    	this.rollNo=rollNo;
    	this.Qualification=Qualification;
    	
    }
    
     public void DisplayStudentDetails() {
    	 System.out.println("College Name: " + CollegeName);
    	 System.out.println("Student Name: " + sName); 
    	 System.out.println("Roll Number: " + rollNo);
    	 System.out.println("Qualification: " + Qualification);
    	 
    	 
    	
    }
      
    
	public static void main(String[] args) {
		
		
//		this.CollegeName=CollegeName;
//    	this.sName=sName;
//    	this.rollNo=rollNo;
//    	this.Qualification=Qualification;
		Student s1 =new Student("GVR","RAM",21,"B.tech");
		
		s1.DisplayStudentDetails();	
		
		Student s2 =new Student("GVR","krish",31,"B.tech");
		s2.DisplayStudentDetails();
		
		s2.sName="kirsh";
		
		System.out.println("-----------------------------------------------------");
		CollegeName="sri praksh college of eng";
		s1.DisplayStudentDetails();	
		System.out.println("---------------------------------------------------------");
		s2.DisplayStudentDetails();
	}

}
