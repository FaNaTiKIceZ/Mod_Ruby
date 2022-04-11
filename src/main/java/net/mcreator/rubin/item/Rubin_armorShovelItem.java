
package net.mcreator.rubin.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.rubin.init.RubyModTabs;
import net.mcreator.rubin.init.RubyModItems;

public class Rubin_armorShovelItem extends ShovelItem {
	public Rubin_armorShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RubyModItems.RUBIN));
			}
		}, 1, -3f, new Item.Properties().tab(RubyModTabs.TAB_RUBINTAB).fireResistant());
		setRegistryName("rubin_armor_shovel");
	}
}
