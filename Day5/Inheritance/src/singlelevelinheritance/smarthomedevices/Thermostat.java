package singlelevelinheritance.smarthomedevices;

//subclass
class Thermostat extends Device{
    double temperatureSetting;
    Thermostat(int deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    public void display() {
        super.displayDetails();
        System.out.println("Temperature Setting : " + temperatureSetting);
    }
}
