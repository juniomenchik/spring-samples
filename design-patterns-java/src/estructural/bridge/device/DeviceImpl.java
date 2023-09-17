package estructural.bridge.device;

public interface DeviceImpl {
    String getName();
    void setName(String name);
    Integer getVolume();
    void setVolume(Integer volume);
    Boolean getEnabled();
    void setEnabled(Boolean enabled);
}
