public class PhoneFactoryProducer {
    public Factory buyPhone(String phoneName) {
        if(phoneName.equals("Android")) {
            return new AndroidPhoneFactory();
        } else if(phoneName.equals("IOS")) {
            return new IOSPhoneFactory();
        } else {
            return null;
        }
    }
}
