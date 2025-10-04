package BridgePattern.Abstraction;

import BridgePattern.Implementor.BookingPlatform;

public abstract class Room {
    protected BookingPlatform platform;

    public Room(BookingPlatform platform) {
        this.platform = platform;
    }

    public abstract void reserveRoom();
}
