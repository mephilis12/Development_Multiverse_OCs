package net.mephilis.devocs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
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

		StrippableBlockRegistry.register(ModBlocks.POLY_LOG, ModBlocks.STRIPPED_POLY_LOG);
		StrippableBlockRegistry.register(ModBlocks.POLY_WOOD, ModBlocks.STRIPPED_POLY_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POLY_LOG, 5 , 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POLY_WOOD, 5 , 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_POLY_LOG, 5 , 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_POLY_WOOD, 5 , 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POLY_PLANKS, 5 , 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.POLY_LEAVES, 30 , 60);

		LOGGER.info("Hello Fabric world!");
	}
}