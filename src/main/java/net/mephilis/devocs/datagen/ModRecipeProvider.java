package net.mephilis.devocs.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mephilis.devocs.block.ModBlocks;
import net.mephilis.devocs.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE,ModBlocks.DEEPSLATE_RUBY_ORE);
    private static List<ItemConvertible> COBALT_SMELTABLES = List.of(ModBlocks.COBALT_ORE,ModBlocks.DEEPSLATE_COBALT_ORE);



    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.8f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.8f, 100, "ruby");
        offerSmelting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_DUST,
                0.8f, 200, "cobalt");
        offerBlasting(exporter, COBALT_SMELTABLES, RecipeCategory.MISC, ModItems.COBALT_DUST,
                0.8f, 100, "cobalt");


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.FLOOR_TILE, 5)
                .pattern("XOX")
                .pattern("OXO")
                .pattern("XOX")
                .input('O', Items.BLACKSTONE)
                .input('X', Items.CALCITE)
                .criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .criterion(hasItem(Items.CALCITE), conditionsFromItem(Items.CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.FLOOR_TILE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DEEPSLATE_WALL_DESIGN, 1)
                .pattern("XXX")
                .pattern("OOO")
                .pattern("OOO")
                .input('O', Items.POLISHED_DEEPSLATE)
                .input('X', Items.RED_TERRACOTTA)
                .criterion(hasItem(Items.POLISHED_DEEPSLATE), conditionsFromItem(Items.POLISHED_DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DEEPSLATE_WALL_DESIGN)));

    }
}
