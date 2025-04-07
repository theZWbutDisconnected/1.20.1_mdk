package net.minecraft.forthou.items;
import net.minecraft.core.registries.Registries;
import net.minecraft.forthou.items.ForthouSword;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 06:59
 */
public class Registry {
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "forthou");
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "forthou");
	
    public static final RegistryObject<Item> forthouSword = ITEMS.register("forthou_sword", ForthouSword::new);
	public static final RegistryObject<CreativeModeTab> tab = 
		TABS.register("forthou_tab", () -> {
			return CreativeModeTab.builder()
			.title(Component.nullToEmpty("Forthou Tab"))
			.displayItems(new CreativeModeTab.DisplayItemsGenerator() {
				@Override
				public void accept(CreativeModeTab.ItemDisplayParameters itemDisplayParameters, CreativeModeTab.Output output) {
					output.accept(Registry.forthouSword.get());
				}
			})
			.build();});
	
}
