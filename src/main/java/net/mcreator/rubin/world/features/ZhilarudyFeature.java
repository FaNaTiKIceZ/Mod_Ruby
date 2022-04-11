
package net.mcreator.rubin.world.features;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.BlockPos;

import java.util.Set;

public class ZhilarudyFeature extends Feature<NoneFeatureConfiguration> {
	public static final ZhilarudyFeature FEATURE = (ZhilarudyFeature) new ZhilarudyFeature().setRegistryName("ruby:zhilarudy");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE.configured(FeatureConfiguration.NONE);
	public static final Set<ResourceLocation> GENERATE_BIOMES = Set.of(new ResourceLocation("bamboo_jungle"),
			new ResourceLocation("bamboo_jungle_hills"), new ResourceLocation("jungle_hills"), new ResourceLocation("jungle_edge"),
			new ResourceLocation("modified_jungle"), new ResourceLocation("modified_jungle_edge"), new ResourceLocation("jungle"));
	private StructureTemplate template = null;

	public ZhilarudyFeature() {
		super(NoneFeatureConfiguration.CODEC);
	}

	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
		boolean dimensionCriteria = false;
		ResourceKey<Level> dimensionType = context.level().getLevel().dimension();
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		if (template == null)
			template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation("ruby", "zhila"));
		if (template == null)
			return false;
		if ((context.random().nextInt(1000000) + 1) <= 30000) {
			boolean anyPlaced = false;
			int count = context.random().nextInt(1) + 1;
			for (int a = 0; a < count; a++) {
				int i = context.origin().getX() + context.random().nextInt(16);
				int k = context.origin().getZ() + context.random().nextInt(16);
				int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k);
				j = Math.abs(context.random().nextInt(Math.max(1, j)) - 24);
				BlockPos spawnTo = new BlockPos(i + 10, j + 20, k + 10);
				if (template.placeInWorld(context.level(), spawnTo, spawnTo,
						new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)])
								.setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random())
								.addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR).setIgnoreEntities(false),
						context.random(), 2)) {
					anyPlaced = true;
				}
			}
			return anyPlaced;
		}
		return false;
	}
}
