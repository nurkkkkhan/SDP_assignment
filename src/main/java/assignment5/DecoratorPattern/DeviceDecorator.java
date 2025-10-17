package assignment5.DecoratorPattern;

import assignment5.Devices.Device;

public abstract class DeviceDecorator implements Device {
    protected Device wrappedDevice;

    public DeviceDecorator(Device device){
        this.wrappedDevice = device;
    }
    @Override
    public void operate(){
        wrappedDevice.operate();
        }
        @Override
    public String getDescription(){
        return wrappedDevice.getDescription();
    }
    @Override
    public String getDeviceType(){
        return wrappedDevice.getDeviceType();
    }
}
