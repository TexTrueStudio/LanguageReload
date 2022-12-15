package jerozgen.languagereload.access;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

@OnlyIn(Dist.CLIENT)
public interface ITranslationStorage {
    @Nullable String getTargetLanguage();

    void setTargetLanguage(@Nullable String value);
}
