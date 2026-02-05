public class Arguments_Parameters_in_arithmetic
{
    public static int sum(int c,int d){
        return c+d;
    }
    public static int average(int c,int d){
        return (c+d)/2;
    }
    public static int difference(int c,int d){
        return c-d;
    }
    public static int product(int c,int d){
        return c*d;
    }
    public static int division(int c,int d){
        return c/d;
    }
    public static int modulus(int c,int d){
        return c%d;
    }
	public static void main(String[] args) {
		int a=40;
		int b=30;
		System.out.println("Sum of "+ a +" and "+ b+" is :"+ sum(a,b));
		System.out.println("Average of "+ a +" and "+ b+" is :"+ average(a,b));
		System.out.println("Dfference of "+ a +" and "+ b+" is :"+ difference(a,b));
		System.out.println("Product of "+ a +" and "+ b+" is :"+ product(a,b));
		System.out.println("Division of "+ a +" and "+ b+" is :"+ division(a,b));
		System.out.println("Modulus of "+ a +" and "+ b+" is :"+ modulus(a,b));
		
	}
}