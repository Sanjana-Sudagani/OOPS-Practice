interface A {
    public static int a = 4;

    public void m1();

    default void m2() {
        System.out.println("method m2");
    }

    static void m3() {
        System.out.println("method m3");
    }

    default void m4() {
        System.out.println("method m4");
    }
}

class B implements A {
    public void m1() {
        System.out.println("method m1");
    }
}

class interfaces {
    public static void main(String[] args) {
        B b = new B();
        b.m1();
        System.out.println(A.a);
    }
}