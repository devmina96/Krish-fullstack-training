public class PhoneBuilder {

    private final String OS;
    private final int ram;
    private final String processor;
    private final int screenSize;
    private  final int batterySize;

    public PhoneBuilder(Builder builder) {
        this.OS = builder.OS;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.batterySize = builder.batterySize;
    }

    static class Builder{
        private String OS;
        private int ram;
        private String processor;
        private int screenSize;
        private  int batterySize;


        public PhoneBuilder build(){
            return new PhoneBuilder(this);
        }

        public Builder(){

        }

        public Builder OS(String OS){
            this.OS = OS;
            return this;
        }
        public Builder ram(int ram){
            this.ram = ram;
            return this;
        }

        public Builder processor(String processor){
            this.processor = processor;
            return this;
        }

        public Builder screenSize(int screenSize){
            this.screenSize = screenSize;
            return this;
        }

        public Builder batterySize(int batterySize){
            this.batterySize = batterySize;
            return this;
        }
    }

    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", batterySize=" + batterySize +
                '}';
    }
}
