package net.mephilis.devocs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mephilis.devocs.block.ModBlocks;
import net.mephilis.devocs.item.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.EMPTY_GLASS);
        addDrop(ModBlocks.FLOOR_TILE);
        addDrop(ModBlocks.DEEPSLATE_WALL_DESIGN);
        addDrop(ModBlocks.BROKEN_PORTAL_FRAME);
        addDrop(ModBlocks.GRIMSTONE);
        addDrop(ModBlocks.POLY_WOOD);
        addDrop(ModBlocks.POLY_LOG);
        addDrop(ModBlocks.STRIPPED_POLY_LOG);
        addDrop(ModBlocks.STRIPPED_POLY_WOOD);
        addDrop(ModBlocks.POLY_PLANKS);
        addDrop(ModBlocks.POLY_SAPLING);
        addDrop(ModBlocks.GLOWING_OBSIDIAN);

        addDrop(ModBlocks.POLY_LEAVES, leavesDrops(ModBlocks.POLY_LEAVES,ModBlocks.POLY_SAPLING,0.005f));

        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.COBALT_ORE, oreDrops(ModBlocks.COBALT_ORE, ModItems.COBALT_DUST));
        addDrop(ModBlocks.DEEPSLATE_COBALT_ORE, oreDrops(ModBlocks.DEEPSLATE_COBALT_ORE, ModItems.COBALT_DUST));

        addDrop(ModBlocks.POLY_STAIRS);
        addDrop(ModBlocks.POLY_TRAPDOOR);
        addDrop(ModBlocks.POLY_FENCE);
        addDrop(ModBlocks.POLY_FENCE_GATE);
        addDrop(ModBlocks.POLY_BUTTON);
        addDrop(ModBlocks.POLY_PRESSURE_PLATE);

        addDrop(ModBlocks.POLY_DOOR, doorDrops(ModBlocks.POLY_DOOR));
        addDrop(ModBlocks.POLY_SLAB, slabDrops(ModBlocks.POLY_SLAB));

        addDrop(ModBlocks.GRIMSTONE_STAIRS);
        addDrop(ModBlocks.GRIMSTONE_SLAB, slabDrops(ModBlocks.GRIMSTONE_SLAB));


    }
}
