package net.mephilis.devocs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mephilis.devocs.DevelopmentMultiverseOCs;
import net.mephilis.devocs.item.custom.MilkshakeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static final Item COBALT_DUST = registerItem("cobalt_dust", new Item(new FabricItemSettings()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));

    public static final Item MILKSHAKE = registerItem("milkshake", new MilkshakeItem(new FabricItemSettings().food(ModFoodComponents.MILKSHAKE).maxCount(1)));


     private static void  addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(COBALT_DUST);
        entries.add(COBALT_INGOT);

     }


     private static void  addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MILKSHAKE);
     }




    private static Item registerItem(String name, Item item ){
       return Registry.register(Registries.ITEM, new Identifier(DevelopmentMultiverseOCs.MOD_ID, name), item);
    }

    public static void registerModItems() {



        DevelopmentMultiverseOCs.LOGGER.info("Register Mod Items for " + DevelopmentMultiverseOCs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
    }
}

