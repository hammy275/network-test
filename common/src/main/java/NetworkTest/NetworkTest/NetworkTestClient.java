package NetworkTest.NetworkTest;

import dev.architectury.event.events.client.ClientTickEvent;

public class NetworkTestClient {

    public static void init() {
        ClientTickEvent.CLIENT_POST.register(minecraft -> {
            if (minecraft.level != null) {
                NetworkTest.INSTANCE.sendToServer(new ExamplePacket());
            }
        });

    }
}
