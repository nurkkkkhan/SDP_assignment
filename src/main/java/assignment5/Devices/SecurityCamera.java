package assignment5.Devices;

public class SecurityCamera implements Device{
    private boolean isRecording = true;
    private boolean nightVision = true;
    private String recordQuality = "1440p";


    public void setQuality(String quality){
        recordQuality=quality;
        System.out.println("The record quality is: " + quality);
    }
    public void startRecording(){
        isRecording = true;
        System.out.println("Security camera is recording" + recordQuality);
    }
    public void stopRecording(){
        isRecording = false;
        System.out.println("The Security camera is not recording");
    }
    public void setNightVision(){
        nightVision = true;
        System.out.println("Night vision is working" + recordQuality);
    }
    @Override
    public void operate(){
        if (!isRecording){
            startRecording();
        }
        else{
            stopRecording();
        }
    }
    @Override
    public String getDescription( ) {
        return "Hikvision";
    }
    @Override
    public String getDeviceType(){
        return "Security Camera";
    }
}
