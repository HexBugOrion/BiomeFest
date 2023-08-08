package net.timeworndevs.biomefest.features;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.lang.module.Configuration;
import java.util.List;

public class BFVegetationConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?,?>> TREES_ONLY_OAKS = ConfiguredFeatures.of("only_oaks");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?,?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        RegistryEntryLookup<PlacedFeature> registryEntryLookup2 = featureRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);

        RegistryEntry<PlacedFeature> registryEntry = registryEntryLookup2.getOrThrow(TreePlacedFeatures.OAK_CHECKED);

        ConfiguredFeatures.register(featureRegisterable,TREES_ONLY_OAKS, Feature.RANDOM_SELECTOR, new RandomFeatureConfig(List.of(new RandomFeatureEntry(registryEntry, 0.2F)), registryEntry));
    }
}
