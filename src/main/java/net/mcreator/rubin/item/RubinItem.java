
package net.mcreator.rubin.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.rubin.init.RubyModTabs;

public class RubinItem extends Item {
	public RubinItem() {
		super(new Item.Properties().tab(RubyModTabs.TAB_RUBINTAB).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("rubin");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
