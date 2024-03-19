import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("````````````````````");
        Phone phone = null;
        PhoneFactory phoneFactory = new PhoneFactory();
        Scanner in = new Scanner(System.in);
        String phoneOS = in.nextLine();
        phone = phoneFactory.buyThisPhone(phoneOS);
        phone.buyPhone();
    }
}