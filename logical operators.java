public class Main { 
    public static void main(String[] args) { 
        int a = 18,b=21,c=16; 
        System.out.println("The value of a is greatest among the three :" + (a>b&&a>c));
        System.out.println("The value of b is greatest among the three :"+(b>a&&b>c));
        System.out.println("The value of c is greatest among the three :"+(c>a&&c>b));
        System.out.println("Logical conditions to check a number is positive and even :");
        System.out.println("The number "+a+" is positive and even :"+(a>=0&&a%2==0));
        System.out.println("The number "+b+" is positive and even :"+(b>=0&&b%2==0));
        System.out.println("Condition to check student pass or with the grace mark");
        int mark=48,grace=2;
        System.out.println("Student pass :"+(mark>40&&grace==2));
        int num=25;
        System.out.println("The number "+num+" is between 10 and 50 :"+(num>10&&num<50));
        int n1=2;
        System.out.println("The number "+n1+" is not equal to zero using not operator :"+(!(n1==0)));
        int age=20;
        System.out.println("The person with the age "+age+ " is eligible to vote :"+ (!(age<18)));
    }
}