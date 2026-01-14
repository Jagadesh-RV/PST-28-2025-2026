class Student {
    int marks;
}

public class ParameterPassing {

    static void changePrimitive(int x) {
        x = 100;
        System.out.println("Inside changePrimitive: " + x);
    }

    static void changeObject(Student s) {
        s.marks = 100;
        System.out.println("Inside changeObject: " + s.marks);
    }

    public static void main(String[] args) {
        int a = 50;
        Student st = new Student();
        st.marks = 50;

        changePrimitive(a);
        System.out.println("After method call (primitive): " + a);

        changeObject(st);
        System.out.println("After method call (object): " + st.marks);
    }
}
