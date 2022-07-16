public class Phone {

    private String OS;
    private int ram;
    private String processor;
    private int screenSize;
    private  int batterySize;

    public Phone(String OS) {
        this.OS = OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", batterySize=" + batterySize +
                '}';
    }
}
