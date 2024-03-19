import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("````````````````````");
        // Lets inialize our factories i.e. Android and IOS factories
        PhoneFactoryProducer phoneFactoryProducer = new PhoneFactoryProducer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your OS choice");
        String userInput = sc.nextLine();
        Factory factory = phoneFactoryProducer.buyPhone(userInput);
        System.out.println(factory);
        System.out.println("Enter Samsung or Google for Android || Apple for IOS");
        String userBrandChoice = sc.nextLine();
        Phone action = factory.buyPhone(userBrandChoice);
        action.buyPhone();
    }
}