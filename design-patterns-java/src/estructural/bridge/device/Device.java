package estructural.bridge.device;

public class Device implements DeviceImpl {

    private String nome;
    private Integer volume;
    private Boolean enabled;

    public Device(String tv) {
        this.nome = tv;
        this.volume = 0;
        this.enabled = false;
    }

    @Override
    public String getName() {
        return this.nome;
    }

    @Override
    public Integer getVolume() {
        return this.volume;
    }

    @Override
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setName(String name){
        this.nome = name;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
