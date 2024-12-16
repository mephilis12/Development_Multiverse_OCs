package net.mephilis.devocs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.mephilis.devocs.block.ModBlocks;
import net.mephilis.devocs.item.ModItems;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

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

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.ITEM, new Identifier("arsenal","displayable")))
                .add(ModItems.TRUSTY)
                .add(ModItems.MOSSY_SCYTHE)
                .add(ModItems.COBALT_BATTLEAXE)
                .add(ModItems.COBALT_CLAYMORE)
                .add(ModItems.COBALT_SCYTHE)
                .add(ModItems.COBALT_MORNINGSTAR)
                .add(ModItems.RUBY_BATTLEAXE)
                .add(ModItems.RUBY_CLAYMORE)
                .add(ModItems.RUBY_SCYTHE)
                .add(ModItems.RUBY_MORNINGSTAR)
                .add(ModItems.COBALT_HAMMER)
                .add(ModItems.RUBY_HAMMER);



    }
}
