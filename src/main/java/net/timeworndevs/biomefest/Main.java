package net.timeworndevs.biomefest;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.biomefest.registry.BlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MODID = "biomefest";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Loading Biome Fest...");
		BlockRegistry.blockRegistry();
	}
}
