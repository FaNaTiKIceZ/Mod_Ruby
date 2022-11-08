
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.rubin.world.features.ZhilarudyFeature;
import net.mcreator.rubin.RubyMod;

@Mod.EventBusSubscriber
public class RubyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RubyMod.MODID);
	public static final RegistryObject<Feature<?>> ZHILARUDY = REGISTRY.register("zhilarudy", ZhilarudyFeature::feature);
}
