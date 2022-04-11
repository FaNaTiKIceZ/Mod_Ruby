
package net.mcreator.rubin.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.rubin.init.RubyModTabs;
import net.mcreator.rubin.init.RubyModItems;

public class Rubin_armorPickaxeItem extends PickaxeItem {
	public Rubin_armorPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 4.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RubyModItems.RUBIN));
			}
		}, 1, -2.5f, new Item.Properties().tab(RubyModTabs.TAB_RUBINTAB).fireResistant());
		setRegistryName("rubin_armor_pickaxe");
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}
