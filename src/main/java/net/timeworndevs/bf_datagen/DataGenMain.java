package net.timeworndevs.bf_datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.timeworndevs.biomefest.world.BFBiomes;

public class DataGenMain implements DataGeneratorEntrypoint {


    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator){
        FabricDataGenerator.Pack pack = dataGenerator.createPack();
        pack.addProvider(BFWorldGenProvider::new);

    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.BIOME, BFBiomes::bootstrap);
    }
}
