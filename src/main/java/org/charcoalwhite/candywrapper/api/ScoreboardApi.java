package org.charcoalwhite.candywrapper.api;

import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.scoreboard.ScoreboardObjective;
import net.minecraft.scoreboard.number.NumberFormat;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public interface ScoreboardApi {
    default ScoreboardObjective getOrAddObjective(String name, ScoreboardCriterion criterion, Text displayName, ScoreboardCriterion.RenderType renderType, boolean displayAutoUpdate, @Nullable NumberFormat numberFormat) {
        return new ScoreboardObjective(null, null, null, null, null, false, null);
    }
}