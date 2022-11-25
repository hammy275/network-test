package NetworkTest.NetworkTest;

import dev.architectury.networking.NetworkChannel;
import dev.architectury.platform.Platform;
import dev.architectury.utils.Env;
import net.minecraft.resources.ResourceLocation;

public class NetworkTest {
    public static final String MOD_ID = "network_test";

    public static final NetworkChannel INSTANCE = NetworkChannel.create(
            new ResourceLocation("network_test", "network"));
    public static void init() {
        INSTANCE.register(ExamplePacket.class, ExamplePacket::encode, ExamplePacket::decode, ExamplePacket::handle);
        if (Platform.getEnvironment() == Env.CLIENT) {
            NetworkTestClient.init();
        }
    }
}