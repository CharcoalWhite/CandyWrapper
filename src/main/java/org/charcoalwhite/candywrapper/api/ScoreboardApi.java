package org.charcoalwhite.candywrapper.api;

import org.jetbrains.annotations.Nullable;
import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.text.Text;

public interface ScoreboardApi {
    default ScoreboardObjective getOrAddObjective(String name, ScoreboardCriterion criterion, Text displayName, ScoreboardCriterion.RenderType renderType, boolean displayAutoUpdate, @Nullable NumberFormat numberFormat) {
        return new ScoreboardObjective(null, null, null, null, null, false, null);
    }
}
