//overloading
class Sum {
    int x;

    public void sum(int a, int b) {
        System.out.println("int method");
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public void sum(double a, double b) {
        System.out.println("double method");
    }
}

// over riding
class Base extends Sum {
    public void sum(int a, int b) {
        // super.sum(a,b); to get Base class implementation
        System.out.println("Base method");

    }
}

class polymorphism {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum(1, 2);
        System.out.println(s.sum(1, 2, 3));
        s.sum(1.0, 2.0);
        Sum b = new Base();
        b.sum(3, 4);
    }
}
