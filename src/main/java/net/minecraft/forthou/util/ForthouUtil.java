package net.minecraft.forthou.util;
import org.spongepowered.asm.util.Bytecode;
import net.minecraft.world.entity.player.Player;
import com.mojang.authlib.GameProfile;
import net.minecraft.world.entity.player.Abilities;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.level.Level;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.forthou.Forthou;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.stats.StatsCounter;
import net.minecraft.client.ClientRecipeBook;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 09:55
 */
public class ForthouUtil {
    
    public static void playerDef(LocalPlayer p) {
		GameProfile pr = p.gameProfile;
		Abilities ab = p.abilities;
		SynchedEntityData d = p.entityData;
		Level w = p.level;
		p.absorptionAmount = 1000;
		p.hurtMarked = false;
		p.canUpdate = true;
		p.remainingFireTicks = 0;
		p.invulnerableTime = Integer.MAX_VALUE;
		ab.flying = true;
		ab.instabuild = true;
		ab.invulnerable = true;
		ab.mayBuild = true;
		ab.mayfly = true;
		ab.setWalkingSpeed(0.2f);
		ab.setFlyingSpeed(0.3f);
		p.onGround = true;
		p.isAddedToWorld = true;
		p.invulnerable = true;
		p.displayname = Component.nullToEmpty("GOD");
		p.hurtTime = 0;
		p.setHealth(1000.0f);
		d.set(LivingEntity.DATA_HEALTH_ID, 1000.0f);
		p.dead = false;
		p.deathTime = 0;
		p.DEATH_DURATION = Integer.MAX_VALUE;
		p.hurtDir = 0;
		p.canUpdate(true);
		p.handleEntityEvent((byte)0);
		p.handleDamageEvent(p.damageSources().fellOutOfWorld);
		p.showDeathScreen = false;
		w.setSkyFlashTime(100);
	}
    
}
