package jerozgen.languagereload.access;

import net.minecraft.world.chunk.WorldChunk;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.concurrent.atomic.AtomicReferenceArray;

@OnlyIn(Dist.CLIENT)
public interface IClientChunkMap {
    AtomicReferenceArray<WorldChunk> getChunks();
}
