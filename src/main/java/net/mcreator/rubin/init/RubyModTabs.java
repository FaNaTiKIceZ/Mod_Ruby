
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubin.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RubyModTabs {
	public static CreativeModeTab TAB_RUBINTAB;

	public static void load() {
		TAB_RUBINTAB = new CreativeModeTab("tabrubintab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RubyModItems.RUBIN);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
