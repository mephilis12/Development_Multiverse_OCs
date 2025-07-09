package net.mephilis.devocs.block;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mephilis.devocs.DevelopmentMultiverseOCs;
import net.mephilis.devocs.block.custom.*;
import net.mephilis.devocs.block.custom.WallSignBlock;
import net.mephilis.devocs.world.tree.ModSapplingGenerators;
import net.minecraft.block.*;
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
    public static final Block GRIMSTONE = registerBlock("frame_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block BROKEN_PORTAL_FRAME = registerBlock("broken_portal_frame",
            new RotatingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_TILES)));
    public static final Block COBALT_BLOCK = registerBlock("cobalt_block",
            new RotatingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_BLOCK)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new RotatingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            new RotatingBlock(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN).luminance(state -> 15)));
    public static final Block GLOWING_CRYING_OBSIDIAN = registerBlock("glowing_crying_obsidian",
            new RotatingBlock(FabricBlockSettings.copyOf(Blocks.CRYING_OBSIDIAN).luminance(state -> 15)));
    public static final Block PUB_SIGN = registerBlock("pub_sign",
            new WallSignBlock(FabricBlockSettings.copyOf(Blocks.GLASS).luminance(state -> 6).nonOpaque()));

    public static final Block EMPTY_GLASS = registerBlock("empty_glass",
            new EmptyGlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));


    public static final Block STEPHAN_STATUE = registerBlock("stephan_statue",
            new StephanBlock(FabricBlockSettings.copyOf(Blocks.STONE).nonOpaque()));

    public static final Block POLY_LOG = registerBlock("poly_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block POLY_WOOD = registerBlock("poly_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_POLY_LOG = registerBlock("stripped_poly_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_POLY_WOOD = registerBlock("stripped_poly_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));


    public static final Block POLY_PLANKS = registerBlock("poly_planks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block POLY_SLAB = registerBlock("poly_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block POLY_STAIRS = registerBlock("poly_stairs",
            new StairsBlock(ModBlocks.POLY_PLANKS.getDefaultState(),FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block POLY_FENCE = registerBlock("poly_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block POLY_FENCE_GATE = registerBlock("poly_fence_gate",
            new FenceGateBlock(WoodType.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE)));

    public static final Block POLY_BUTTON = registerBlock("poly_button",
            new ButtonBlock(BlockSetType.CHERRY,10,FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON)));
    public static final Block POLY_PRESSURE_PLATE = registerBlock("poly_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE)));

    public static final Block POLY_DOOR = registerBlock("poly_door",
            new DoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR).nonOpaque()));
    public static final Block POLY_TRAPDOOR = registerBlock("poly_trapdoor",
            new TrapdoorBlock(BlockSetType.CHERRY, FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR)));

    public static final Block POLY_LEAVES = registerBlock("poly_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).nonOpaque()));
    public static final Block POLY_SAPLING = registerBlock("poly_sapling",
            new SaplingBlock(ModSapplingGenerators.POLY,FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).nonOpaque()));

    public static final Block GRIMSTONE_SLAB = registerBlock("grimstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_SLAB)));
    public static final Block GRIMSTONE_STAIRS = registerBlock("grimstone_stairs",
            new StairsBlock(ModBlocks.GRIMSTONE.getDefaultState(),FabricBlockSettings.copyOf(Blocks.POLISHED_DEEPSLATE_STAIRS)));




    private static void addItemsToBuildingBlocksItemGroups(FabricItemGroupEntries entries) {
        entries.add(FLOOR_TILE);
        entries.add(DEEPSLATE_WALL_DESIGN);
        entries.add(EMPTY_GLASS);
        entries.add(GRIMSTONE);
        entries.add(GRIMSTONE_STAIRS);
        entries.add(GRIMSTONE_SLAB);
        entries.add(BROKEN_PORTAL_FRAME);
        entries.add(COBALT_BLOCK);
        entries.add(RUBY_BLOCK);
        entries.add(GLOWING_OBSIDIAN);
        entries.add(GLOWING_CRYING_OBSIDIAN);
        entries.add(PUB_SIGN);
        entries.add(STEPHAN_STATUE);

        entries.add(POLY_LOG);
        entries.add(POLY_WOOD);
        entries.add(STRIPPED_POLY_LOG);
        entries.add(STRIPPED_POLY_WOOD);
        entries.add(POLY_PLANKS);
        entries.add(POLY_STAIRS);
        entries.add(POLY_SLAB);
        entries.add(POLY_FENCE);
        entries.add(POLY_FENCE_GATE);
        entries.add(POLY_DOOR);
        entries.add(POLY_TRAPDOOR);
        entries.add(POLY_PRESSURE_PLATE);
        entries.add(POLY_BUTTON);
    }

    private static void addItemsToNaturalItemGroups(FabricItemGroupEntries entries) {
        entries.add(RUBY_ORE);
        entries.add(DEEPSLATE_RUBY_ORE);
        entries.add(COBALT_ORE);
        entries.add(DEEPSLATE_COBALT_ORE);
        entries.add(POLY_LOG);
        entries.add(POLY_WOOD);
        entries.add(STRIPPED_POLY_LOG);
        entries.add(STRIPPED_POLY_WOOD);
        entries.add(POLY_PLANKS);
        entries.add(POLY_LEAVES);
        entries.add(POLY_SAPLING);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, Identifier.of(DevelopmentMultiverseOCs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM,  Identifier.of(DevelopmentMultiverseOCs.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        DevelopmentMultiverseOCs.LOGGER.info("Registering ModBlocks for " + DevelopmentMultiverseOCs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToBuildingBlocksItemGroups);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemsToNaturalItemGroups);
    }




}
