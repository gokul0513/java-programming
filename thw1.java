class thw1{
  
    static void checkage(int age){
      if(age>18){
      throw new ArithmeticException (" eligible");
    }
    else{
      System.out.println(" not eligible");
    }
    }
    
  public static void main(String args[]){
    checkage(16);
  }
}


                                      