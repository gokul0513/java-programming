import java.util.Scanner;
public class grade{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int marks=sc.nextInt();
    if (marks>=90){
      System.out.println("grade a");
    }
    else if (marks>=75){
       System.out.println("grade b");
    }
    else if(marks>=60){
       System.out.println("grade c");
    }
    else{
      System.out.println("fail");
    }
  }
}
