class methodoverloading{
  int add( int a,int b){
    return a+b;
  }
  double add(double a,double b){
    return a+b;
  }
  int add(int a,int b,int c){
    return a+b+c;
  }
}
public static void main(String args[]){
  methodoverloading m1=new methodoverloading();
  System.out.println(m1.add(1,2));
  System.out.println(m1.add(333,444));
  System.out.println(m1.add(32,3,4));
}
  