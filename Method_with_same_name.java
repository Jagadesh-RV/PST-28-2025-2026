public class Method_with_same_name
{
    public static int sum(int c,int d){
        return c+d;
    }
    public static int sum(int l,int m,int n){
        return l+m+n;
    }
	public static void main(String[] args) {
		int a=40;
		int b=30;
		int c=50;
		System.out.println("Sum of "+ a +" and "+ b+" is :"+ sum(a,b));
		System.out.println("Sum of "+ a +" and "+ b+" is :"+ sum(a,b,c));
	}
}