package jerozgen.languagereload.config;

import jerozgen.languagereload.LanguageReload;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.SimpleOptionsScreen;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.text.Text;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ConfigScreen extends SimpleOptionsScreen {
    private static final SimpleOption<Boolean> MULTILINGUAL_SEARCH = SimpleOption.ofBoolean(
            "options.languagereload.multilingualItemSearch",
            SimpleOption.constantTooltip(Text.translatable("options.languagereload.multilingualItemSearch.tooltip")),
            true,
            value -> {
                Config.getInstance().multilingualItemSearch = value;
                Config.save();
                LanguageReload.reloadSearch();
            });

    public ConfigScreen(Screen parent) {
        super(
                parent,
                MinecraftClient.getInstance().options,
                Text.translatable("options.languagereload.title"),
                new SimpleOption[]{MULTILINGUAL_SEARCH});
        MULTILINGUAL_SEARCH.setValue(Config.getInstance().multilingualItemSearch);
    }
}
