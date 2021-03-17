package yt.titou.newores.procedures;

import yt.titou.newores.item.LingotDeBitcoinItem;
import yt.titou.newores.NeworesModElements;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@NeworesModElements.ModElement.Tag
public class BtcgetProcedure extends NeworesModElements.ModElement {
	public BtcgetProcedure(NeworesModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Btcget!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(LingotDeBitcoinItem.block, (int) (1));
			_setstack.setCount((int) 999);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
