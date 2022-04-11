
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubin.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

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

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RubyModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item RUBIN = register(new RubinItem());
	public static final Item RUBIN_ARMOR_SWORD = register(new Rubin_armorSwordItem());
	public static final Item RUBIN_ARMOR_PICKAXE = register(new Rubin_armorPickaxeItem());
	public static final Item RUBIN_ARMOR_AXE = register(new Rubin_armorAxeItem());
	public static final Item RUBIN_ARMOR_SHOVEL = register(new Rubin_armorShovelItem());
	public static final Item RUBIN_ARMOR_HOE = register(new Rubin_armorHoeItem());
	public static final Item RUBIN_ARMOR_2_ARMOR_HELMET = register(new Rubin_armor2ArmorItem.Helmet());
	public static final Item RUBIN_ARMOR_2_ARMOR_CHESTPLATE = register(new Rubin_armor2ArmorItem.Chestplate());
	public static final Item RUBIN_ARMOR_2_ARMOR_LEGGINGS = register(new Rubin_armor2ArmorItem.Leggings());
	public static final Item RUBIN_ARMOR_2_ARMOR_BOOTS = register(new Rubin_armor2ArmorItem.Boots());
	public static final Item RUBIN_GEM = register(RubyModBlocks.RUBIN_GEM, RubyModTabs.TAB_RUBINTAB);
	public static final Item RUBIN_GEM_4_ORE_BLOCK = register(RubyModBlocks.RUBIN_GEM_4_ORE_BLOCK, RubyModTabs.TAB_RUBINTAB);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
