class BankAccount {
    private int bal = 10;
    private String name = "sudheshna";

    public int givebal(String name) {
        if (name.equals(this.name)) {
            return bal;
        } else {
            return 0;
        }
    }
}

class datahiding {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println(b.givebal("sudheshna"));
    }
}