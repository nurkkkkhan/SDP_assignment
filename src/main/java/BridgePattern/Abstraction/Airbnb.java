package BridgePattern.Abstraction;

import BridgePattern.Implementor.BookingPlatform;

public class Airbnb extends BookingPlatform {
    @Override
    public void book(String roomType) {
        System.out.println("Booking " + roomType + " via Airbnb");
    }
}
