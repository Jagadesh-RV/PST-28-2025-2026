public class Polymorphism
{
    public static int sum(){
        int a=10;
        int b=20;
        return a+b;
    }
    public static int average(){
        int a=125;
        int b=175;
        return (a+b)/2;
    }
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(average());
	}
}