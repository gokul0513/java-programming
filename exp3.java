import java.util.Scanner;
class exp3{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]= new int[5];
    try{
      for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println(arr[7]);
    }
     catch(ArrayIndexOutOfBoundsException e){
      System.out.println("array index is not valid");
    }
  }
}
    