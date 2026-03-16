import java.util.Scanner;
class studentdetails{
  int sno;
  String name;
  int mark1;
  int mark2;
  int mark3;
  int m;
  studentdetails(int s,String n,int m1,int m2,int m3){
    sno=s;
    name=n;
    mark1=m1;
    mark2=m2;
    mark3=m3;
  }
  void calculate(){
     m=mark1+mark2+mark3;
  }
  void disp(){
    System.out.println("roll number:"+sno);
    System.out.println("student name:"+name);
    System.out.println(" total marks:"+m);
  }}
  public class gkl{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int sno=sc.nextInt();
      String name=sc.next();
      int mark1=sc.nextInt();
      int mark2=sc.nextInt();
      int mark3=sc.nextInt();
      studentdetails s1=new studentdetails(sno,name,mark1,mark2,mark3);
      s1.calculate();
      s1.disp();
    }}
    
  