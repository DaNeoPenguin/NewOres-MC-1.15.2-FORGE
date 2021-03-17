package yt.titou.newores.procedures;

import yt.titou.newores.NeworesModElements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@NeworesModElements.ModElement.Tag
public class MineraiDeBitcoinOnBlockRightClickedProcedure extends NeworesModElements.ModElement {
	public MineraiDeBitcoinOnBlockRightClickedProcedure(NeworesModElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure MineraiDeBitcoinOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).giveExperiencePoints((int) 5);
	}
}
