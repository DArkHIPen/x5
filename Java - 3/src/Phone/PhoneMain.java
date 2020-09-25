package Phone;

public class PhoneMain {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone("79032459844", "DP", 55);
        Phone phone3 = new Phone("79032459844", "DP");

        phone1.getInfoPhone();
        phone2.getInfoPhone();
        phone3.getInfoPhone();

        phone1.getNumber();
        phone1.receiveCall("Василий");
        phone2.getNumber();
        phone2.receiveCall("Петя");
        phone3.getNumber();
        phone3.receiveCall("Жаннета");

        phone1.receiveCall("МЧС", "112");
        phone1.sendMessage("123", "12331");

    }
}
