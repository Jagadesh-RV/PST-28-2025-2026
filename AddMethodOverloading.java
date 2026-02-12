class AddMethodOverloading {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        AddMethodOverloading obj = new AddMethodOverloading();

        System.out.println(obj.sum(5, 10));
        System.out.println(obj.sum(2.5, 3.5));
        System.out.println(obj.sum(1, 2, 3));
    }
}
