package assignment5.Devices;

public abstract class MusicSystem implements Device {
    private boolean isPlaying = false;
    private int volume = 50;
    private String currentSong = "Default music";

    public void play() {
        isPlaying = true;
        currentSong = "Default music";
        System.out.println("Music system plays now" + currentSong + volume);
    }

    public void stop() {
        isPlaying = false;
        System.out.println("Music system stopped ");
    }

    public void setVolume(int vol){
        volume = vol;
        System.out.println("Volume: " + volume);
    }
    public void setPlaying(String song){
        currentSong = song;
        isPlaying = true;
        System.out.println("Now is playing: " + song);
    }

    @Override
    public void operate(){
        if (!isPlaying){
            play();
        }
        else {
            stop();
        }
    }
    @Override
    public String getDescription(){
        return "Basic Music System";
    }
    @Override
    public String getDeviceType(){
        return "Music System";
    }
}
