package net.timeworndevs.biomefest.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.timeworndevs.biomefest.Main;

public class ItemGroupRegistry {
    public static final ItemGroup BIOMEFEST_GROUP = FabricItemGroup.builder(new Identifier(Main.MODID, "itemgroup")).icon(()-> new ItemStack(BlockRegistry.PINE_LOG)).build();
}
