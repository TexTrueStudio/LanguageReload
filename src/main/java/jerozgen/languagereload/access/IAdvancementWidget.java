package jerozgen.languagereload.access;

import net.minecraft.advancement.AdvancementProgress;
import net.minecraft.client.gui.screen.advancement.AdvancementTab;
import net.minecraft.client.gui.screen.advancement.AdvancementWidget;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

@OnlyIn(Dist.CLIENT)
public interface IAdvancementWidget {
    AdvancementTab getTab();

    AdvancementProgress getProgress();

    AdvancementWidget getParent();

    void setParent(AdvancementWidget parent);

    List<AdvancementWidget> getChildren();

    void setChildren(List<AdvancementWidget> children);
}
