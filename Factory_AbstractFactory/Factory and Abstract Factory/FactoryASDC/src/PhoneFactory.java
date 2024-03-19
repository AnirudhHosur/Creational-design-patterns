public class PhoneFactory {
    public Phone buyThisPhone(String phonsOS) {
        Phone phone = null;
        if(phonsOS.equals("Android")) {
            phone = new AndroidPhone();
        } else if(phonsOS.equals("IOS")) {
            phone = new IOSPhone();
        } else {
            System.out.println("Other OS don't matter");
        }
        return phone;
    }
}
