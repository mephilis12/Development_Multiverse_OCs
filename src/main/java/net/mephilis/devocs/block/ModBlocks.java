package net.mephilis.devocs.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mephilis.devocs.DevelopmentMultiverseOCs;
import net.mephilis.devocs.block.custom.EmptyGlassBlock;
import net.mephilis.devocs.block.custom.RotatingBlock;
import net.mephilis.devocs.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {



    public static final Block FLOOR_TILE = registerBlock("floor_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));

    public static final Block COBALT_ORE = registerBlock("cobalt_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));

    public static final Block DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));

    public static final Block DEEPSLATE_WALL_DESIGN = registerBlock("deepslate_wall_design",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));

    public static final Block FRAME_BLOCK = registerBlock("frame_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));

    public static final Block BROKEN_PORTAL_FRAME = registerBlock("broken_portal_frame",
            new RotatingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));

    public static final Block EMPTY_GLASS = registerBlock("empty_glass",
            new EmptyGlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));



    private static void addItemsToBuildingBlocksItemGroups(FabricItemGroupEntries entries) {
        entries.add(FLOOR_TILE);
        entries.add(DEEPSLATE_WALL_DESIGN);
        entries.add(EMPTY_GLASS);
        entries.add(FRAME_BLOCK);
        entries.add(BROKEN_PORTAL_FRAME);
    }

    private static void addItemsToNaturalItemGroups(FabricItemGroupEntries entries) {
        entries.add(RUBY_ORE);
        entries.add(DEEPSLATE_RUBY_ORE);
        entries.add(COBALT_ORE);
        entries.add(DEEPSLATE_COBALT_ORE);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, new Identifier(DevelopmentMultiverseOCs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(DevelopmentMultiverseOCs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        DevelopmentMultiverseOCs.LOGGER.info("Registering ModBlocks for " + DevelopmentMultiverseOCs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToBuildingBlocksItemGroups);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemsToNaturalItemGroups);
    }




}
