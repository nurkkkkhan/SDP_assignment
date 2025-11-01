package assignment5.Devices;

public class Thermostat implements Device{
    private int temperature = 10;
    private static boolean isOn = true;
    private String mode = "auto";

    public static void turnOn(){
        isOn = true;
        System.out.println("Thermostat has turned on");
    }
    public static void turnOff(){
        isOn = false;
        System.out.println("Thermostat has turned off");
    }


    public void setTemperature(int temp){
        temperature=temp;
        System.out.println("Thermostat temperature is: "+ temperature +"C");
    }
    public void increaseTemperature(){
        temperature++;
        System.out.println("Temperature increased to : "+ temperature +"C");
    }
    public void decreaseTemperature(){
        temperature--;
        System.out.println("Temperature decreased to : "+temperature+"C");
    }

    public void setMode(String newMode){
        mode = newMode;
        System.out.println("Mode has set to: " + mode);
    }
    public int getTemperature(){
        return temperature;
    }

@Override
    public void operate(){
        if(!isOn){
            turnOn();
        }else{
            turnOff();
        }

    System.out.println("The temperature now is:" + temperature +"C,Mode: "+mode);
    increaseTemperature();
}
@Override
    public String getDescription(){
        return "Basic Thermostat";
}
@Override
    public String getDeviceType() {
    return "Thermostat";
}
}
