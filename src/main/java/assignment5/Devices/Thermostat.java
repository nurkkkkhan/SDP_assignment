package assignment5.Devices;

public class Thermostat implements Device{
    private int temperature = 10;
    private boolean isOn = true;
    private String mode = "auto";

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
