package org.charcoalwhite.candywrapper.mixin;

import net.minecraft.scoreboard.ScoreHolder;
import net.minecraft.server.network.ServerPlayerEntity;
import org.charcoalwhite.candywrapper.api.ServerPlayerEntityApi;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ServerPlayerEntity.class)
public abstract class ServerPlayerEntityMixin implements ServerPlayerEntityApi {
    @Override
	public ScoreHolder getScoreHolder() {
		return ScoreHolder.fromProfile(((ServerPlayerEntity)(Object)this).getGameProfile());
	}
}
