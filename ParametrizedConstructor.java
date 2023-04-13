public class parameterizedConstructor {
   
    public void m1() {
        System.out.println("this is instance method");
    }
    
    public static void m2() {
        System.out.println("this is static method");
    }
    
    
    
    public Example1(int a,int b,int c) {
        System.out.println("parametarized constructor");
    }
    public static void main(String[] args) {
    
    Example1 obj=new Example1(10,20,30);
        
        
        
    }
               
}