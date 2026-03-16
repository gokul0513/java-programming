import java.util.Scanner;
class bankacc{
  int accno;
  String name;
  int balance;
  int deposit;
  int withdraw;
  bankacc(int a,String n,int b,int d,int w){
    accno=a;
    name=n;
    balance=b;
    deposit=d;
    withdraw=w;
  }
  void deposit(){
 balance=balance+deposit;
  }
  void withdraw(){
    balance=balance-withdraw;
  }
  void disp(){
    System.out.println("account number:"+accno);
    System.out.println("name:"+name);
    System.out.println("balance:"+balance);
  }
}
public class bankaccount{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int accno=sc.nextInt();
      String name=sc.next();
      int balance=sc.nextInt();
      int deposit=sc.nextInt();
      int withdraw=sc.nextInt();
      bankacc bc=new bankacc(accno,name,balance,deposit,withdraw);
      bc.deposit();
    bc.withdraw();
    bc.disp();
  }}
    