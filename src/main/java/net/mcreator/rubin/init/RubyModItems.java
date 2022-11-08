
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubin.item.Rubin_armorSwordItem;
import net.mcreator.rubin.item.Rubin_armorShovelItem;
import net.mcreator.rubin.item.Rubin_armorPickaxeItem;
import net.mcreator.rubin.item.Rubin_armorHoeItem;
import net.mcreator.rubin.item.Rubin_armorAxeItem;
import net.mcreator.rubin.item.Rubin_armor2ArmorItem;
import net.mcreator.rubin.item.RubinItem;
import net.mcreator.rubin.RubyMod;

public class RubyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RubyMod.MODID);
	public static final RegistryObject<Item> RUBIN = REGISTRY.register("rubin", () -> new RubinItem());
	public static final RegistryObject<Item> RUBIN_ARMOR_SWORD = REGISTRY.register("rubin_armor_sword", () -> new Rubin_armorSwordItem());
	public static final RegistryObject<Item> RUBIN_ARMOR_PICKAXE = REGISTRY.register("rubin_armor_pickaxe", () -> new Rubin_armorPickaxeItem());
	public static final RegistryObject<Item> RUBIN_ARMOR_AXE = REGISTRY.register("rubin_armor_axe", () -> new Rubin_armorAxeItem());
	public static final RegistryObject<Item> RUBIN_ARMOR_SHOVEL = REGISTRY.register("rubin_armor_shovel", () -> new Rubin_armorShovelItem());
	public static final RegistryObject<Item> RUBIN_ARMOR_HOE = REGISTRY.register("rubin_armor_hoe", () -> new Rubin_armorHoeItem());
	public static final RegistryObject<Item> RUBIN_ARMOR_2_ARMOR_HELMET = REGISTRY.register("rubin_armor_2_armor_helmet",
			() -> new Rubin_armor2ArmorItem.Helmet());
	public static final RegistryObject<Item> RUBIN_ARMOR_2_ARMOR_CHESTPLATE = REGISTRY.register("rubin_armor_2_armor_chestplate",
			() -> new Rubin_armor2ArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBIN_ARMOR_2_ARMOR_LEGGINGS = REGISTRY.register("rubin_armor_2_armor_leggings",
			() -> new Rubin_armor2ArmorItem.Leggings());
	public static final RegistryObject<Item> RUBIN_ARMOR_2_ARMOR_BOOTS = REGISTRY.register("rubin_armor_2_armor_boots",
			() -> new Rubin_armor2ArmorItem.Boots());
	public static final RegistryObject<Item> RUBIN_GEM = block(RubyModBlocks.RUBIN_GEM, RubyModTabs.TAB_RUBINTAB);
	public static final RegistryObject<Item> RUBIN_GEM_4_ORE_BLOCK = block(RubyModBlocks.RUBIN_GEM_4_ORE_BLOCK, RubyModTabs.TAB_RUBINTAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
