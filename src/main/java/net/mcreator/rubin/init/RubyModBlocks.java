
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubin.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.rubin.block.Rubin_gem8OreBlock;
import net.mcreator.rubin.block.Rubin_gem4OreBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RubyModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block RUBIN_GEM = register(new Rubin_gem8OreBlock());
	public static final Block RUBIN_GEM_4_ORE_BLOCK = register(new Rubin_gem4OreBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
