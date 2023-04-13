
import java.util.Scanner;
class Adding{
  public static void main(String args[]){
Scanner s = new Scanner(System.in);
 int arr[]={20,30,80,35,45,90,50,40};
  int n,count=0,indexi=-1,indexj=-1;
   System.out.println("Enter the number to find the index of the sum of the entered number");
  n=s.nextInt();
for(int i=0;i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
    if(arr[i]+arr[j]==n){
      indexi=i;
      indexj=j;
      count=count+1;
    }
  }
  if(count==1){
    System.out.println(indexi+" ");
     System.out.println(indexj+" ");
     System.out.println();
  }
  else{
    System.out.println("There is no index for the entered value");
    break;
  }
    count=0;
  }
  }
}

  