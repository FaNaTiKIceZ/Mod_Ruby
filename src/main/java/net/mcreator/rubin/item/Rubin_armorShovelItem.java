
package net.mcreator.rubin.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rubin.itemgroup.RubintabItemGroup;
import net.mcreator.rubin.RubinModElements;

@RubinModElements.ModElement.Tag
public class Rubin_armorShovelItem extends RubinModElements.ModElement {
	@ObjectHolder("rubin:rubin_armor_shovel")
	public static final Item block = null;

	public Rubin_armorShovelItem(RubinModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubinItem.block));
			}
		}, 1, -3f, new Item.Properties().group(RubintabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("rubin_armor_shovel"));
	}
}
