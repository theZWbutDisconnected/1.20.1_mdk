package net.minecraft.forthou.items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Rarity;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 07:46
 */
public class ForthouSword extends SwordItem {
    
    public ForthouSword(Tier tier, int i, float f, Properties property) {
		super(tier, i, f, property.rarity(Rarity.EPIC));
	}
    
}
