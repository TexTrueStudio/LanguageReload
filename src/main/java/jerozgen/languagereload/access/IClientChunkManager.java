package jerozgen.languagereload.access;

import net.minecraft.client.world.ClientChunkManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public interface IClientChunkManager {
    ClientChunkManager.ClientChunkMap getChunks();
}
