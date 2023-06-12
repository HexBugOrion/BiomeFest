package net.timeworndevs.bf_datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;
import net.timeworndevs.biomefest.biome.BFBiomes;

import java.util.concurrent.CompletableFuture;

public class BFDynamicRegistryProvider extends FabricDynamicRegistryProvider {
    public BFDynamicRegistryProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        BFBiomes.populate(entries);
    }

    @Override
    public String getName() {
        return "Biome Fest";
    }
}
