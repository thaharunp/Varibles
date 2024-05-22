class Test{
    int a;
    int b;
    static int c=30;
    public static void main(String[] args){
        Test t1 = new Test();
        t1.a=10;
        t1.b=20;
        System.out.println(t1.a+t1.b+c); //60
        Test t2 = new Test();
        t2.a=15;
        t2.b=25;
        System.out.println(t2.a+t2.b+c);//70
        System.out.println(t1.a+t2.b+c); // 65
        Test.c=40;
        System.out.println(t2.a+t2.b + c); //80
        System.out.println(t1.b+t2.a+c); // 75
 
 
        
    }
}