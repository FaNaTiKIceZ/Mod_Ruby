
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.rubin.block.Rubin_gem8OreBlock;
import net.mcreator.rubin.block.Rubin_gem4OreBlockBlock;
import net.mcreator.rubin.RubyMod;

public class RubyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RubyMod.MODID);
	public static final RegistryObject<Block> RUBIN_GEM = REGISTRY.register("rubin_gem", () -> new Rubin_gem8OreBlock());
	public static final RegistryObject<Block> RUBIN_GEM_4_ORE_BLOCK = REGISTRY.register("rubin_gem_4_ore_block", () -> new Rubin_gem4OreBlockBlock());
}
