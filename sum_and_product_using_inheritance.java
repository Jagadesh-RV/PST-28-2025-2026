public class sum_and_product_using_inheritance {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        s1.Sum(5, 3);
        Solution2 s2 = new Solution2();
        s2.product(5, 3);
    }
}
class Solution1 {
    void Sum(int n1,int n2) {
        System.out.println("Sum of "+"n1:"+n1+" n2:"+n2+" is : "+(n1+n2));
    }
}
class Solution2 extends Solution1{
    void product(int n1,int n2) {
        System.out.println("Product of "+"n1:"+n1+" n2:"+n2+" is : "+(n1*n2));
    }
}