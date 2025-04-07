package net.minecraft.forthou.items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 07:46
 */
public class ForthouSword extends SwordItem {
    
    public ForthouSword() {
		super(Tiers.NETHERITE, Integer.MAX_VALUE, Float.MAX_VALUE, new Properties().rarity(Rarity.EPIC));
	}
    
}
