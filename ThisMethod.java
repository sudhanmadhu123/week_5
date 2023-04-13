public class ThisMethod {
    int a,b;
    
    public void m1(int a,int b) {
        this.a=a;
        this.b=b;
    }
    
    public void m2() {
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args) {
    
        Example1 obj=new Example1();
        obj.m1(10, 20);
        obj.m2();
    }
               
}
 