import java.util.Scanner;
class Append {
  public static void main(String[] args) {

    int arr[]={12,34,5,6,7,8,9};
      Scanner s = new Scanner(System.in);
    System.out.println("enter the index number");
    int num = s.nextInt();
    for(int i=0;i<num;i++){
      int temp=arr[0];
      for(int j=0;j<arr.length-1;j++){
        arr[j]=arr[j+1];
         }
      arr[arr.length-1]=temp;
      }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
   }
}