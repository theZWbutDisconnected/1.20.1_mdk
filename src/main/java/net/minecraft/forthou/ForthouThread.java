package net.minecraft.forthou;
import net.minecraft.client.ClientRecipeBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.forthou.items.Registry;
import net.minecraft.forthou.util.ForthouUtil;
import net.minecraft.stats.StatsCounter;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 09:54
 */
public class ForthouThread implements Runnable {

	@Override
	public void run() {
		while (true) {
			Minecraft mc = Minecraft.getInstance();
			try {
				LocalPlayer p = mc.player;
				if (p != null && p.getMainHandItem().getItem() == Registry.forthouSword.get()) {
					Forthou.LOGGER.debug("ForthouThread", "Player defense ticking.");
					System.out.printf("[ForthouThread] Player defense ticking.");
					StatsCounter s = p.stats;
					ClientRecipeBook b = p.recipeBook;
					p = mc.player = new LocalPlayer(mc, mc.level, mc.getConnection(), s, b, false, false);
					ForthouUtil.playerDef(p);
				}
			} finally {}
		}
	}
    
}
