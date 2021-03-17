package yt.titou.newores.procedures;

import yt.titou.newores.NeworesModElements;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@NeworesModElements.ModElement.Tag
public class ModinfoCommandExecutedProcedure extends NeworesModElements.ModElement {
	public ModinfoCommandExecutedProcedure(NeworesModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ModinfoCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You Are Using The 1.0 BETA Version of NewOres"), (true));
		}
	}
}
