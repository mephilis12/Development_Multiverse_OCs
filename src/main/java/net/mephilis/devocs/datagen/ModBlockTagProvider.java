package net.mephilis.devocs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mephilis.devocs.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBALT_ORE)
                .add(ModBlocks.DEEPSLATE_COBALT_ORE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.FLOOR_TILE)
                .add(ModBlocks.DEEPSLATE_WALL_DESIGN)
                .add(ModBlocks.BROKEN_PORTAL_FRAME)
                .add(ModBlocks.GRIMSTONE)
                .add(ModBlocks.GRIMSTONE_STAIRS)
                .add(ModBlocks.GRIMSTONE_SLAB)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.GLOWING_OBSIDIAN)
                .add(ModBlocks.GLOWING_CRYING_OBSIDIAN)
                .add(ModBlocks.STEPHAN_STATUE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.POLY_PLANKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_WALL_DESIGN)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.GRIMSTONE_SLAB)
                .add(ModBlocks.GRIMSTONE_STAIRS);


        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BROKEN_PORTAL_FRAME)
                .add(ModBlocks.GRIMSTONE)
                .add(ModBlocks.COBALT_ORE)
                .add(ModBlocks.DEEPSLATE_COBALT_ORE)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.GLOWING_OBSIDIAN)
                .add(ModBlocks.GLOWING_CRYING_OBSIDIAN);




        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.POLY_LOG)
                .add(ModBlocks.POLY_WOOD)
                .add(ModBlocks.STRIPPED_POLY_LOG)
                .add(ModBlocks.STRIPPED_POLY_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.POLY_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.POLY_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.POLY_FENCE,ModBlocks.POLY_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.POLY_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.POLY_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.POLY_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.POLY_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.POLY_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.POLY_TRAPDOOR);



    }
}
