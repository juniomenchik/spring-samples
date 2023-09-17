package estructural.bridge;

import estructural.bridge.device.Tv;
import estructural.bridge.remote.RemoteControl;

public class BridgeApplication {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(new Tv());
        remoteControl.togglePower();
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.volumeUp();
        remoteControl.togglePower();

    }
}
