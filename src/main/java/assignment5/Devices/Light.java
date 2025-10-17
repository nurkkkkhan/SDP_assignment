package assignment5.Devices;

public abstract class Light implements Device {
    private static boolean isOn = false;

    public static void turnOn (){
        isOn = true;
        System.out.println("Light has turned on");
    }

    public static void turnOff(){
        isOn = false;
        System.out.println("Light has turned off");
    }
     public boolean isOn(){
        return isOn;
     }

@Override
    public void operate(){
        if (!isOn) {
            turnOn();
        }
        else {
            turnOff();
        }
}
@Override
    public String getDescription(){
        return "Basic Light";
}
@Override
    public String getDeviceType(){
        return "Light";
}
}
