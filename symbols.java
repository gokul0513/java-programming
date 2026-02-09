import java.util.Scanner;
class symbols{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c;
    String sym=sc.next();
    switch(sym){
      case "add":
      c=a+b;
      System.out.println("add"+c);
      break;
      case "sub":
        c=a-b;
      System.out.println("sub"+c);
      break;
      case "mul":
        c=a*b;
      System.out.println("mul"+c);
      break;
      case "div":
        c=a/b;
      System.out.println("div"+c);
      break;
      default:
      System.out.println("invalid symbol");
    }}}