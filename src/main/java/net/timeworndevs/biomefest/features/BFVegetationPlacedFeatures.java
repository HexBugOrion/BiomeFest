package net.timeworndevs.biomefest.features;


import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.timeworndevs.biomefest.Main;

import java.util.ArrayList;
import java.util.List;

public class BFVegetationPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TREES_ONLY_OAK = createRegistryKey("trees_only_oak");

    public static RegistryKey<PlacedFeature> createRegistryKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Main.MODID, name));
    }

    public static PlacedFeature placeTreeFeature(FabricDynamicRegistryProvider.Entries entries, int count, int maxWaterDepth, BlockPredicate predicate, RegistryKey<ConfiguredFeature<?,?>> feature) {
        return placeFeature(entries, feature, PlacedFeatures.createCountExtraModifier(count, 0.1f, 1), SquarePlacementModifier.of(), PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, SurfaceWaterDepthFilterPlacementModifier.of(maxWaterDepth), BlockFilterPlacementModifier.of(predicate));
    }

    private static PlacedFeature placeFeature(FabricDynamicRegistryProvider.Entries entries, RegistryKey<ConfiguredFeature<?,?>> feature, PlacementModifier... placementModifiers) {
        List<PlacementModifier> list = new ArrayList<>(List.of(placementModifiers));
        list.add(BiomePlacementModifier.of());
        return placeFeature(entries, feature, list);
    }

    private static PlacedFeature placeFeature(FabricDynamicRegistryProvider.Entries entries, RegistryKey<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> list) {
        return new PlacedFeature(entries.ref(feature), list);
    }

    public static void populate(FabricDynamicRegistryProvider.Entries entries) {
        final BlockPredicate ON_DIRT = BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.DIRT);
        final BlockPredicate ON_SAND = BlockPredicate.matchingBlockTag(Direction.DOWN.getVector(), BlockTags.SAND);
        final BlockPredicate ON_DIRT_OR_SAND = BlockPredicate.anyOf(ON_DIRT, ON_SAND);

        entries.add(TREES_ONLY_OAK, )
    }
}
