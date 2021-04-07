package au.com.arrisar.mc.helloworld;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion.Mode;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("helloworld")
public class HelloWorld
{
    public HelloWorld() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void bang(BlockEvent.BreakEvent event) {
        BlockPos pos = event.getPos();
        World world = (World) event.getWorld();

        world.createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 4.0F, Mode.NONE);
    }
}
