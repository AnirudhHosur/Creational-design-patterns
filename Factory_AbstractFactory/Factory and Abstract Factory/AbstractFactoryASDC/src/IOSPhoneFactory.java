public class IOSPhoneFactory extends Factory{
    @Override
    Phone buyPhone(String phoneName) {
        if(phoneName.equals("Apple")) {
            return new Apple();
        } else {
            return null;
        }
    }
}
