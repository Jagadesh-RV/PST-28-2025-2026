public class Constructor_class{
    public static void main(String[] args) {
        Constructor_class myobj = new Constructor_class();
        myobj.test_marks();
    }
    public void test_marks() {
        System.out.println("Marks obtained in three subjects:");
        int a=95,b=96,c=98;
        System.out.println("English: "+a);
        System.out.println("Maths: "+b);
        System.out.println("Science: "+c);
        sum(a,b,c);
        
    }

    public void sum(int a, int b ,int c) {
        System.out.println("Total marks is : " + (a+b+c));
    }
}
