
package net.mcreator.rubin.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rubin.itemgroup.RubintabItemGroup;
import net.mcreator.rubin.RubyModElements;

@RubyModElements.ModElement.Tag
public class Rubin_armorSwordItem extends RubyModElements.ModElement {
	@ObjectHolder("ruby:rubin_armor_sword")
	public static final Item block = null;

	public Rubin_armorSwordItem(RubyModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -2.4000000000000001f, new Item.Properties().group(RubintabItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("rubin_armor_sword"));
	}
}
