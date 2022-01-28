class Subject {
    Science s = new Science();

    public Subject() {
        s.read();
    }
}

class Science {
    public void read() {
        System.out.println("reading science");
    }
}

class tightlycoupled {
    public static void main(String[] args) {
        Subject s = new Subject();
    }
}