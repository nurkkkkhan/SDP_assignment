package assignment5.DecoratorPattern;

import assignment5.Devices.Device;

public class EnergySavingDecorator extends DeviceDecorator {
    private int powerSaved = 0;
    private String savingMode = "Eco";


    public EnergySavingDecorator(Device device){
        super(device);
    }
    @Override
    public void operate(){
        optimizePower();
        wrappedDevice.operate();
        reportSavingPower();
    }
    private void optimizePower(){
        System.out.println("power consumption analysis...");
        System.out.println("applying" + savingMode +"mode");
    }
    private void reportSavingPower(){
        powerSaved +=30;
        System.out.println("power saving optimization saved -" + powerSaved +"% energy");
    }

    public void setSavingMode(String mode){
        savingMode = mode;
        System.out.println("Mode changed to: "+ mode);
    }
    public int getPowerSaved(){
        return powerSaved;
    }

    public String getDescription(){
        return wrappedDevice.getDescription()+ "+ Energy Saved";
    }
}
