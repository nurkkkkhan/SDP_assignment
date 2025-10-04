package BridgePattern.Abstraction;
import BridgePattern.Implementor.BookingPlatform;

public class SingleRoom extends Room {
    public SingleRoom(BookingPlatform platform) {
        super(platform);
    }

    @Override
    public void reserveRoom() {
        platform.book("Single Room");
    }
}

