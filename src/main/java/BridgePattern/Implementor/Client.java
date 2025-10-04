package BridgePattern.Implementor;
import BridgePattern.Abstraction.BookingCom;
import BridgePattern.Abstraction.Airbnb;
import BridgePattern.Abstraction.Room;
import BridgePattern.Abstraction.SingleRoom;
import BridgePattern.Abstraction.SuiteRoom;


public class Client {

    public static void main(String[] args) {
        BookingPlatform bookingCom = new BookingCom();
        BookingPlatform airbnb = new Airbnb();

        Room single = new SingleRoom(bookingCom);
        Room suite = new SuiteRoom(airbnb);

        System.out.println("Single Room using Booking.com:");
        single.reserveRoom();

        System.out.println("\nSuite Room using Airbnb:");
        suite.reserveRoom();
    }

    public void run() {
    }
}
