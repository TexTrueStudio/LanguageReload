package jerozgen.languagereload.access;

import net.minecraft.client.search.SearchManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public interface IMinecraftClient {
    SearchManager getSearchManager();
}
