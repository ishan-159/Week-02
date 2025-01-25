package singlelevelinheritance.smarthomedevices;

//super class
class Device{
    int deviceId;
    String status;
    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    public void displayDetails() {
        System.out.println("Device id of the product : " + deviceId);
        System.out.println("Current status of the product : " + status);
    }
}

