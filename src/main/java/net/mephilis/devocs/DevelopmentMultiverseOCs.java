package net.mephilis.devocs;

import net.fabricmc.api.ModInitializer;

import net.mephilis.devocs.block.ModBlocks;
import net.mephilis.devocs.item.ModItems;
import net.mephilis.devocs.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DevelopmentMultiverseOCs implements ModInitializer {
	public static final String MOD_ID = "devocs";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		LOGGER.info("Hello Fabric world!");
	}
}