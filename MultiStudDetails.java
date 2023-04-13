import java.util.Scanner;
 
public class MultiStudDetails{
       Scanner s=new Scanner(System.in);
    Object students[]=new Object[2];    // student info , s1,s2
    
    public void setStudentDetails() {
    
        
        
        for(int i=0;i<students.length;i++) {
            
            Student student=new Student();
            
            System.out.println("Enter Sid");
                 student.setStudent_id(s.nextInt());
                 System.out.println("Enter name");
                 student.setSname(s.next());
                 System.out.println("Enter Email");
                 student.setEmail(s.next());
                 
                students[i]=student; 
        }
        
    }
    
    public void getStudentDetails() {
        
        for(int i=0;i<students.length;i++) {
            Student std=(Student)students[i];   // Nagul
            
            System.out.println("Student "+(i+1)+" details");
            System.out.println("Student Name: "+std.getSname());
            System.out.println("Student Email: "+std.getEmail());
            System.out.println("Student ID: "+std.getStudent_id());
            
        }
        
    }
     
    
    public static void main(String args[]) {
        
        MultiStudDetails obj=new MultiStudDetails();
        obj.setStudentDetails();
        obj.getStudentDetails();
        
    }
               
}