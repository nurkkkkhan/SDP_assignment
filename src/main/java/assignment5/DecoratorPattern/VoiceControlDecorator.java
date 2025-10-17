package assignment5.DecoratorPattern;

import assignment5.Devices.Device;

abstract class VoiceControlDecorator extends DeviceDecorator {
    private boolean voiceEnabled = true;
    public VoiceControlDecorator(Device device){
        super(device);
    }
    @Override
    public void operate(){
        enableVoiceControl();
        wrappedDevice.operate();
        }
        private void enableVoiceControl(){
            System.out.println("Voice control listening for you");
        }
    public void voiceCommand(String command){
        System.out.println("Received command:" + command);
        System.out.println("Processing the info...");
    wrappedDevice.operate();
    }
    public void setVoiceLanguage(String language){
        System.out.println("Language has set to:    " + language);
    }
    @Override
    public String getDescription(){
        return wrappedDevice.getDescription() + " + Voice Control";
    }

    }

