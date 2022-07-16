public class Application {
    public static void main(String[] args) {
        Phone phone = new Phone("ios");
        phone.setRam(3);
        phone.setProcessor("A12");
        phone.setScreenSize(6);
        phone.setBatterySize(3000);

        System.out.println(phone);


        PhoneBuilder.Builder builder = new PhoneBuilder.Builder();
        PhoneBuilder phoneBuilder = builder.OS("Android").ram(4).processor("Snapdrago").screenSize(7).batterySize(5000).build();
        System.out.println(phoneBuilder);
    }
}
