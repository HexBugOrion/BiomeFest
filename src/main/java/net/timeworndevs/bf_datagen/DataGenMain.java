package net.timeworndevs.bf_datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DataGenMain implements DataGeneratorEntrypoint {


    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGenerator){
        FabricDataGenerator.Pack pack = dataGenerator.createPack();

        pack.addProvider(BFBiomeTagProvider::new);
    }
}
