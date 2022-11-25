package NetworkTest.NetworkTest;

import dev.architectury.networking.NetworkManager;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;

public class ExamplePacket {

    private final int num;

    public ExamplePacket() {
        this(32);
    }

    public ExamplePacket(int num) {
        this.num = num;
    }

    public static void encode(ExamplePacket packet, FriendlyByteBuf buffer) {
        buffer.writeInt(packet.num);
    }

    public static ExamplePacket decode(FriendlyByteBuf buffer) {
        return new ExamplePacket(buffer.readInt());
    }

    public static void handle(final ExamplePacket message, Supplier<NetworkManager.PacketContext> ctx) {
        ctx.get().queue(() -> {
            if (ctx.get().getPlayer() instanceof ServerPlayer sPlayer) {
                sPlayer.sendSystemMessage(Component.literal("Num: " + message.num));
            }
        });
    }
}
