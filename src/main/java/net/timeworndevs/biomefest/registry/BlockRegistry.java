package net.timeworndevs.biomefest.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.timeworndevs.biomefest.Main;

public class BlockRegistry {
    //blocks and blockItems

    //Pine set
    public static final PillarBlock PINE_LOG = new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.OAK_TAN).strength(2.0F).sounds(BlockSoundGroup.WOOD));

    //Fir set

    //TBD

    public static void blockRegistry(){
        /*
        Order:
        Block
        Item
        ItemGroup
         */
        //Pine set
        Registry.register(Registries.BLOCK, new Identifier(Main.MODID, "pine_log"), PINE_LOG);
        Registry.register(Registries.ITEM, new Identifier(Main.MODID, "pine_log"), new BlockItem(PINE_LOG, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((content)-> content.add(PINE_LOG));

        //Fir set

        //TBD

    }
}
