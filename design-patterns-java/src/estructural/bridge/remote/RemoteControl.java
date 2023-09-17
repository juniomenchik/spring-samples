package estructural.bridge.remote;

import estructural.bridge.device.DeviceImpl;

public class RemoteControl {
    private DeviceImpl device;

    public RemoteControl(DeviceImpl device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.getEnabled()) {
            device.setEnabled(false);
            System.out.println("Desligando " + device.getName());
        } else {
            device.setEnabled(true);
            System.out.println("Ligando " + device.getName());
        }
    }

    public void volumeDown() {
        if (device.getVolume() > 0) {
            device.setVolume(device.getVolume() - 1);
            System.out.println("Volume de " + device.getName() + " diminuido para " + device.getVolume());
        }
    }

    public void volumeUp() {
        if (device.getVolume() < 100) {
            device.setVolume(device.getVolume() + 1);
            System.out.println("Volume de " + device.getName() + " aumentado para " + device.getVolume());
        }
    }

    public void setDevice(DeviceImpl device) {
        this.device = device;
    }
}
