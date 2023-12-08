package net.timeworndevs.biomefest;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.biomefest.common.CommonBlockRegistry;
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
		CommonBlockRegistry.blockRegistry();
		LOGGER.info("Blocks Registered");

		LOGGER.info("FeatureRegistry Starting");
		LOGGER.info("Features Registered");

		LOGGER.info("BiomeRegistry Staring");
		LOGGER.info("Biomes Registered");
	}
}
