package NetworkTest.NetworkTest.forge;

import dev.architectury.platform.forge.EventBuses;
import NetworkTest.NetworkTest.NetworkTest;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NetworkTest.MOD_ID)
public class NetworkTestForge {
    public NetworkTestForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(NetworkTest.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        NetworkTest.init();
    }
}