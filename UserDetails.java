import java.util.Scanner;
 
public class UserDetails {
       
      Scanner s=new Scanner(System.in);
      Student std=new Student();
  
        public void setStudentDetails() {
            System.out.println("Enter student id");
            std.setStudent_id(s.nextInt());
            System.out.println("Enter Student name");
            std.setSname(s.next());
            System.out.println("Enter email id");
            std.setEmail(s.next());
            System.out.println("Enter city");
            std.setCity(s.next());
            System.out.println("Enter mobile");
            std.setMobile(s.nextLong());
        }
  
        public void getStudentDetails() {
            System.out.println("Student id"+std.getStudent_id());
            System.out.println("Student name: "+std.getSname());
            System.out.println("Student email: "+std.getEmail());
            System.out.println("Student city: "+std.getCity());
            System.out.println("Student mobile:"+std.getMobile());
        }
      
    
    public static void main(String args[]) {
        
        UserDetails obj=new UserDetails();
        obj.setStudentDetails();
        obj.getStudentDetails();
        
        
        
    }
               
}