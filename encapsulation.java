class Bank {
    private int bal = 1000;

    public int getbalance() {
        return bal;
    }

    public void setbalance(int bal) {
        this.bal = bal;
    }
}

class encapsulation {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setbalance(2000);
        System.out.println(b.getbalance());
    }
}