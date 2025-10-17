package assignment5.DecoratorPattern;
import assignment5.DecoratorPattern.DeviceDecorator;
import assignment5.Devices.Device;

public class RemoteAccessDecorator extends DeviceDecorator{
    private String ipAddress = "192.168.0.0";
    private String User = "username";
    private boolean isConnected = false;

    public RemoteAccessDecorator(Device device){
        super(device);
    }

    @Override
    public void operate(){
     connectRemotely();
     wrappedDevice.operate();
        System.out.println("Operation completed in a distance");
    }
    private void connectRemotely(){
        isConnected = true;
        System.out.println("Connect a device to :" + ipAddress+"name:" +User);
    }
    public void operateRemotely(String location){
        System.out.println("Operating device from: " + location);
        wrappedDevice.operate();
    }
    public void Disconnect(){
        isConnected = false;
        System.out.println("Disconnected");
    }
    public String getIpAddress(){
        return ipAddress;
    }
    @Override
    public String getDescription(){
        return wrappedDevice.getDescription() + "+Remote access";
    }
}