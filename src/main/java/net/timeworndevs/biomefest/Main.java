package net.timeworndevs.biomefest;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.biomefest.registry.BiomeRegistry;
import net.timeworndevs.biomefest.registry.BlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MODID = "biomefest";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Biome Fest...");

		LOGGER.info("ItemRegistry Starting");
		LOGGER.info("Items Registered");

		LOGGER.info("BlockRegistry Starting");
		BlockRegistry.blockRegistry();
		LOGGER.info("Blocks Registered");

		LOGGER.info("BiomeRegistry Staring");
		BiomeRegistry.biomeRegistry();
		LOGGER.info("Biomes Registered");
	}
}
