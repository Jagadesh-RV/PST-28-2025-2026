public class Polymorphism_by_method
{
    public static int sum(){
        int a=10;
        int b=20;
        System.out.println("Average of "+a + " and "+ b +" is :"+average());
        return a+b;
    }
    public static int average(){
        int a=125;
        int b=175;
        return (a+b)/2;
    }
	public static void main(String[] args) {
		System.out.println("Sum of 10 and 20 is :"+sum());
	}
}