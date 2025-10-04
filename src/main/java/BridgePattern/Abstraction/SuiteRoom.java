package BridgePattern.Abstraction;
import BridgePattern.Implementor.BookingPlatform;

public class SuiteRoom extends Room {
    public SuiteRoom(BookingPlatform platform) {
        super(platform);
    }

    @Override
    public void reserveRoom() {
        platform.book("Suite Room");
    }
}
