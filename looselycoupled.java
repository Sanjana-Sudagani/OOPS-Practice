class Subject {
    test t = new Science();
    test m = new Maths();

    public Subject() {
        t.read();
        m.read();
    }
}

class Science implements test {
    public void read() {
        System.out.println("reading science");
    }
}

class Maths implements test {
    public void read() {
        System.out.println("reading Maths");
    }
}

interface test {
    public void read();
}

class looselycoupled {
    public static void main(String[] args) {
        Subject s = new Subject();
    }
}