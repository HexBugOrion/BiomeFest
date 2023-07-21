package net.timeworndevs.bf_datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.Biome;
import net.timeworndevs.biomefest.biome.BFBiomes;

import java.util.concurrent.CompletableFuture;

public class BFBiomeTagProvider extends FabricTagProvider<Biome> {

    protected BFBiomeTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BIOME, registriesFuture);
    }


    @Override
    public void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, BiomeTags.IS_FOREST.id())).addOptional(BFBiomes.SUB_BOREAL_FOREST);
        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BIOME, BiomeTags.IS_FOREST.id())).addOptional(BFBiomes.WOODLANDS);
    }
}
