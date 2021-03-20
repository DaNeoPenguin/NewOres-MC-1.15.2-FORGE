
package yt.titou.newores.item;

import yt.titou.newores.NeworesModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@NeworesModElements.ModElement.Tag
public class OrthanaSwordItem extends NeworesModElements.ModElement {
	@ObjectHolder("newores:orthana_sword")
	public static final Item block = null;
	public OrthanaSwordItem(NeworesModElements instance) {
		super(instance, 34);
	}

	@Override public void initElements() {
		elements.items.add(() ->
			new SwordItem(new IItemTier() {
				public int getMaxUses() {
					return 250;
				}
   				public float getEfficiency() {
					return 6f;
				}
   				public float getAttackDamage() {
					return 0f;
				}
   				public int getHarvestLevel() {
					return 2;
				}
   				public int getEnchantability() {
					return 14;
				}
   				public Ingredient getRepairMaterial() {
					return Ingredient.fromStacks(
							new ItemStack(, (int)(1))
							);
				}
			}, 					3
										,-3f
				, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("orthana_sword"));
	}
}
