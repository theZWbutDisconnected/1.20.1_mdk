package net.minecraft.forthou;
import net.minecraft.forthou.util.ForthouUtil;
import net.minecraft.client.Minecraft;

/**
 * @Author ZerWhit
 * @Date 2025/04/07 09:54
 */
public class ForthouThread implements Runnable {

	@Override
	public void run() {
		Minecraft mc = Minecraft.getInstance();
		try {
			if (mc.player != null)
				ForthouUtil.playerDef(mc.player);
		} finally {}
	}
    
}
