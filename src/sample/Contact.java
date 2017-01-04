package sample;

public class Contact {
    String name;
    String phone;
    String eMail;

    public Contact(String name, String phone, String eMail) {
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s\n", name, phone, eMail);
    }
}
