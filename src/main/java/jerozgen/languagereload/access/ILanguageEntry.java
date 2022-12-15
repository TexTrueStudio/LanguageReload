package jerozgen.languagereload.access;

import net.minecraft.client.resource.language.LanguageDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public interface ILanguageEntry {
    LanguageDefinition getLanguageDefinition();
}
