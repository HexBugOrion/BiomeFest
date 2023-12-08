package net.timeworndevs.biomefest.common;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.timeworndevs.biomefest.Main;

public class CommonBiomeRegistry {

    public static final RegistryKey<Biome> SUB_BOREAL_FOREST = RegistryKey.of(RegistryKeys.BIOME, new Identifier(Main.MODID, "sub_boreal_forest"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(SUB_BOREAL_FOREST, subBorealForest(context));
    }
    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }
    public static Biome subBorealForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder biomeBuilder = new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE), context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        DefaultBiomeFeatures.addTaigaTrees(biomeBuilder);
        return new Biome.Builder()
                .temperature(0.6f)
                .downfall(0.6f)
                .precipitation(true)
                .effects((new BiomeEffects.Builder()
                        .skyColor(8037887)
                        .fogColor(12638463)
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build()
                ))
                .build();
    }
}
