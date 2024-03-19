public class AndroidPhoneFactory extends Factory {
    @Override
    Phone buyPhone(String phoneName) {
        if (phoneName.equals("Samsung")) {
            return new Samsung();
        } else if (phoneName.equals("Google")) {
            return new Google();
        } else {
            return null;
        }
    }
}
