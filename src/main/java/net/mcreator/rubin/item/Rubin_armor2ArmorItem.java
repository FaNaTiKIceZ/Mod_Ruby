
package net.mcreator.rubin.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.rubin.init.RubyModTabs;
import net.mcreator.rubin.init.RubyModItems;

public abstract class Rubin_armor2ArmorItem extends ArmorItem {
	public Rubin_armor2ArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 39;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 7, 9, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 25;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(RubyModItems.RUBIN));
			}

			@Override
			public String getName() {
				return "rubin_armor_2_armor";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.3f;
			}
		}, slot, properties);
	}

	public static class Helmet extends Rubin_armor2ArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(RubyModTabs.TAB_RUBINTAB).fireResistant());
			setRegistryName("rubin_armor_2_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ruby:textures/models/armor/rubinovaiabronia_layer_1.png";
		}
	}

	public static class Chestplate extends Rubin_armor2ArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(RubyModTabs.TAB_RUBINTAB).fireResistant());
			setRegistryName("rubin_armor_2_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ruby:textures/models/armor/rubinovaiabronia_layer_1.png";
		}
	}

	public static class Leggings extends Rubin_armor2ArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(RubyModTabs.TAB_RUBINTAB).fireResistant());
			setRegistryName("rubin_armor_2_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ruby:textures/models/armor/rubinovaiabronia_layer_2.png";
		}
	}

	public static class Boots extends Rubin_armor2ArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(RubyModTabs.TAB_RUBINTAB).fireResistant());
			setRegistryName("rubin_armor_2_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "ruby:textures/models/armor/rubinovaiabronia_layer_1.png";
		}
	}
}
