package net.minecraft.forthou.items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.forthou.util.ForthouUtil;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 07:46
 */
public class ForthouSword extends SwordItem {
    
    public ForthouSword() {
		super(Tiers.NETHERITE, Integer.MAX_VALUE, Float.MAX_VALUE, new Properties().rarity(Rarity.EPIC));
	}

	@Override
	public void inventoryTick(ItemStack p_41404_, Level p_41405_, Entity p_41406_, int p_41407_, boolean p_41408_) {
		ForthouUtil.holding = true;
		super.inventoryTick(p_41404_, p_41405_, p_41406_, p_41407_, p_41408_);
	}
}
