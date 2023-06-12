package net.timeworndevs.biomefest.biome;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
import net.timeworndevs.biomefest.features.BFBiomeFeatures;

import static net.timeworndevs.biomefest.biome.BFBiomes.addBasicFeatures;

public class SubBorealForestBiome {

    public static Biome create(FabricDynamicRegistryProvider.Entries entries){
        return new Biome.Builder().generationSettings(createGenerationSettings(entries)).precipitation(true).spawnSettings(createSpawnSettings()).temperature(0.7f).downfall(0.6f).effects(BFBiomes.createDefaultBiomeEffects().build()).build();

    }

    private static GenerationSettings createGenerationSettings(FabricDynamicRegistryProvider.Entries entries){
        GenerationSettings.LookupBackedBuilder builder = new GenerationSettings.LookupBackedBuilder(entries.placedFeatures(), entries.configuredCarvers());
        addBasicFeatures(builder);
        DefaultBiomeFeatures.addDefaultOres(builder);
        DefaultBiomeFeatures.addDefaultDisks(builder);
        //builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TreePlacedFeatures.BIRCH_CHECKED);
        //builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, TreePlacedFeatures.SPRUCE_CHECKED);
        BFBiomeFeatures.addSpruceTreesBF(builder);
        BFBiomeFeatures.addBirchTreesBF(builder);
        DefaultBiomeFeatures.addForestFlowers(builder);
        DefaultBiomeFeatures.addDefaultFlowers(builder);
        DefaultBiomeFeatures.addForestGrass(builder);
        DefaultBiomeFeatures.addDefaultMushrooms(builder);
        DefaultBiomeFeatures.addDefaultVegetation(builder);

        return builder.build();
    }

    private static SpawnSettings createSpawnSettings(){
        SpawnSettings.Builder builder = BFBiomes.createDefaultSpawnSettings();
        builder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 4, 4));
        return builder.build();
    }
}
