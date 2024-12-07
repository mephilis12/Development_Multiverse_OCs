package net.mephilis.devocs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mephilis.devocs.block.ModBlocks;
import net.mephilis.devocs.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider  {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.COBALT_HELMET,ModItems.COBALT_CHESTPLATE,ModItems.COBALT_LEGGINGS,ModItems.COBALT_BOOTS,ModItems.RUBY_HELMET,ModItems.RUBY_CHESTPLATE,ModItems.RUBY_LEGGINGS,ModItems.RUBY_BOOTS);

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.POLY_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.POLY_LOG.asItem())
                .add(ModBlocks.POLY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_POLY_LOG.asItem())
                .add(ModBlocks.STRIPPED_POLY_WOOD.asItem());

    }
}
