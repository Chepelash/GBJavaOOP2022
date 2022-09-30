package basic;

import enums.WifiBandWidth;
import ru.chepelash.gb2022.javaoop.homework2.abstractClasses.AbstractWifiModule;

public class BasicWifiModule extends AbstractWifiModule {

    public BasicWifiModule(WifiBandWidth bandWidth, int topSpeed) {
        super(bandWidth, topSpeed);
    }

    public BasicWifiModule() {
        super();
    }

    @Override
    public void connectToNetwork(String networkName) {
        if(isConnected()){
            if(getNetworkName().equals(networkName)){
                System.out.println("Already connected");
                return;
            }
            disconnect();
        }
        setNetworkName(networkName);
        setConnected(true);
        System.out.println("Connected");
    }

    @Override
    public void disconnect() {
        if(!isConnected()){
            System.out.println("Already disconnected");
            return;
        }
        setConnected(false);

        System.out.print("Disconnected from ");
        System.out.println(getNetworkName());
        setNetworkName("");
    }

    @Override
    public WifiBandWidth getBandWidth() {
        return super.getBandWidth();
    }

    @Override
    public int getTopSpeed() {
        return super.getTopSpeed();
    }

    @Override
    public String getNetworkName() {
        return super.getNetworkName();
    }

    @Override
    public boolean isConnected() {
        return super.isConnected();
    }
}
