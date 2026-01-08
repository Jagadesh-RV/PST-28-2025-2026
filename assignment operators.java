public class Main { 
    public static void main(String[] args) { 
        int a = 18; 
        System.out.println("a+=1:Value increment by 1 :"+(a+=1)+"  Current value of a is :"+a);
        System.out.println("a-=1:Value decrement by 1 :"+(a-=1)+"   Current value of a is :"+a);
        System.out.println("a*=2:Value multipled by 2 times :"+(a*=a)+"   Current value of a is :"+a);
        System.out.println("a/=2:Value divided by 2 :"+(a/=2)+"    Current value of a is :"+a);
        System.out.println("a%=2:Remainder of the value divided by 2"+(a%=2)+"   Current value of a is :"+a);
    }
}