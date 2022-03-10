
package net.mcreator.rubin.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.rubin.itemgroup.RubintabItemGroup;
import net.mcreator.rubin.RubinModElements;

@RubinModElements.ModElement.Tag
public class Rubin_armorAxeItem extends RubinModElements.ModElement {
	@ObjectHolder("rubin:rubin_armor_axe")
	public static final Item block = null;

	public Rubin_armorAxeItem(RubinModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 9f;
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
		}, 1, -2.75f, new Item.Properties().group(RubintabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("rubin_armor_axe"));
	}
}
