
package net.mcreator.rubin.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.rubin.item.RubinItem;
import net.mcreator.rubin.RubinModElements;

@RubinModElements.ModElement.Tag
public class RubintabItemGroup extends RubinModElements.ModElement {
	public RubintabItemGroup(RubinModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrubintab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RubinItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
