package net.timeworndevs.biomefest.registry;

import com.terraformersmc.biolith.api.biome.BiomePlacement;
import com.terraformersmc.biolith.impl.Biolith;
import com.terraformersmc.biolith.impl.biome.OverworldBiomePlacement;
import net.minecraft.world.biome.BiomeKeys;
import net.timeworndevs.biomefest.biome.BFBiomes;

public class BiomeRegistry {

    public static void biomeRegistry(){
        BiomePlacement.replaceOverworld(BiomeKeys.BIRCH_FOREST, BFBiomes.SUB_BOREAL_FOREST, 0.2D);
    }

}
