import java.util.ArrayList;

abstract class mobile {
    public abstract void addcontact(String number);
}

class contact extends mobile {
    ArrayList<String> arr = new ArrayList<String>();

    public void addcontact(String number) {
        arr.add(number);
        System.out.println(number + "is added");
    }
}

class abstraction {
    public static void main(String[] args) {
        contact c = new contact();
        c.addcontact("666677798");
    }
}