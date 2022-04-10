
package net.mcreator.rubin.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.rubin.itemgroup.RubintabItemGroup;
import net.mcreator.rubin.item.RubinItem;
import net.mcreator.rubin.RubyModElements;

import java.util.List;
import java.util.Collections;

@RubyModElements.ModElement.Tag
public class Rubin_gem8OreBlock extends RubyModElements.ModElement {
	@ObjectHolder("ruby:rubin_gem")
	public static final Block block = null;

	public Rubin_gem8OreBlock(RubyModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(RubintabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.NETHER_ORE).hardnessAndResistance(30f, 1200f).setLightLevel(s -> 1)
					.harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("rubin_gem");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.STONE;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(RubinItem.block));
		}
	}
}
