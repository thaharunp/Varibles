class Test{
     int a;
     int b;
     static int c=30;
     public static void main(String args[]){
     Test t1=new Test();
     System.out.println(c);
     System.out.println(t1.c);
     System.out.println(Test.c);
     Test t2=new Test();
     }
}