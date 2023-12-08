package net.timeworndevs.biomefest;

import net.minecraft.util.Identifier;
import net.timeworndevs.biomefest.world.BFOverworldRegion;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class TerraBlender implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new BFOverworldRegion(new Identifier(Main.MODID, "overworld"), 4));
    }
}
