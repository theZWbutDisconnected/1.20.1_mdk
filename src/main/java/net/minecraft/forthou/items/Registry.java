package net.minecraft.forthou.items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 06:59
 */
public class Registry {
    
    private static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "forthou");
	
    public static RegistryObject<Item> forthouSword = ITEMS.register("forthou_sword", ForthouSword::new);
}
