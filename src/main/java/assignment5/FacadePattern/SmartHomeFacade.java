package assignment5.FacadePattern;
import assignment5.Devices.*;
public class SmartHomeFacade {

    private Light light;
    private MusicSystem musicSystem;
    private SecurityCamera camera;
    private Thermostat thermostat;

    public SmartHomeFacade() {

        light = new Light() {};
        musicSystem = new MusicSystem() {};
        camera = new SecurityCamera();
        thermostat = new Thermostat();
    }

    public void controlLight(int command) {
        if (command == 1) {
            Light.turnOn();
        } else if (command == 0) {
            Light.turnOff();
        } else {
            System.out.println(" Invalid command for Light.");
        }
    }

    public void searchAndControlMusic(String song, int command) {
        System.out.println("\n Opening Music Search Panel...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        System.out.println("Searching for your favorite song...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }

        System.out.println(" Found: " + song);

        if (command == 1) {
            musicSystem.setPlaying(song);
        } else if (command == 0) {
            musicSystem.stop();
        } else {
            System.out.println(" Invalid command for Music System.");
        }
    }

    public void controlCamera(int command) {
        if (command == 1) {
            camera.startRecording();
        } else if (command == 0) {
            camera.stopRecording();
        } else {
            System.out.println(" Invalid command for Security Camera.");
        }
    }

    public void adjustThermostat(int temp) {
        if(temp == 1){
            thermostat.increaseTemperature();
        }else if (temp == 0) {
            System.out.println("Make proper decision ");
        }
        else
        thermostat.setTemperature(temp);
    }
}
