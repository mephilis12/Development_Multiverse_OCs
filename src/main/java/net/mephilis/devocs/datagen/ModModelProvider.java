package net.mephilis.devocs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mephilis.devocs.block.ModBlocks;
import net.mephilis.devocs.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerLog(ModBlocks.POLY_LOG).log(ModBlocks.POLY_LOG).wood(ModBlocks.POLY_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_POLY_LOG).log(ModBlocks.STRIPPED_POLY_LOG).wood(ModBlocks.STRIPPED_POLY_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLY_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLY_PLANKS);
        blockStateModelGenerator.registerTintableCross(ModBlocks.POLY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_HELMET));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_CHESTPLATE));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_LEGGINGS));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_BOOTS));

    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
    itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));

    }
}
