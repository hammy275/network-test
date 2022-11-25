package NetworkTest.NetworkTest.fabric;

import NetworkTest.NetworkTest.NetworkTest;
import net.fabricmc.api.ModInitializer;

public class NetworkTestFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        NetworkTest.init();
    }
}