package net.mephilis.devocs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mephilis.devocs.DevelopmentMultiverseOCs;
import net.mephilis.devocs.item.custom.HammerItem;
import net.mephilis.devocs.item.custom.MilkshakeItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

    public static final Item MOLTEN_IRON = registerItem("molten_iron", new Item(new FabricItemSettings()));

    public static final Item COBALT_DUST = registerItem("cobalt_dust", new Item(new FabricItemSettings()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));

    public static final Item COBALT_BATTLEAXE = registerItem("cobalt_battleaxe", new SwordItem(ModToolMaterial.COBALT,6,-3.5F, new FabricItemSettings()));

    public static final Item COBALT_CLAYMORE = registerItem("cobalt_claymore", new SwordItem(ModToolMaterial.COBALT,2,-2.5F, new FabricItemSettings()));

    public static final Item COBALT_HAMMER = registerItem("cobalt_hammer", new HammerItem(ModToolMaterial.COBALT,8,-3.75F, new FabricItemSettings()));

    public static final Item COBALT_MORNINGSTAR = registerItem("cobalt_morningstar", new SwordItem(ModToolMaterial.COBALT,1,-1.5F, new FabricItemSettings()));

    public static final Item RUBY_BATTLEAXE = registerItem("ruby_battleaxe", new SwordItem(ModToolMaterial.RUBY,5,-3F, new FabricItemSettings()));

    public static final Item RUBY_CLAYMORE = registerItem("ruby_claymore", new SwordItem(ModToolMaterial.RUBY,2,-2.5F, new FabricItemSettings()));

    public static final Item RUBY_HAMMER = registerItem("ruby_hammer", new HammerItem(ModToolMaterial.RUBY,7,-3F, new FabricItemSettings()));

    public static final Item RUBY_MORNINGSTAR = registerItem("ruby_morningstar", new SwordItem(ModToolMaterial.RUBY,0,-1F, new FabricItemSettings()));

    public static final Item MILKSHAKE = registerItem("milkshake", new MilkshakeItem(new FabricItemSettings().food(ModFoodComponents.MILKSHAKE).maxCount(1)));


     private static void  addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(COBALT_DUST);
        entries.add(COBALT_INGOT);

     }

    private static void  addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(COBALT_BATTLEAXE);
        entries.add(COBALT_CLAYMORE);
        entries.add(COBALT_HAMMER);
        entries.add(COBALT_MORNINGSTAR);
        entries.add(RUBY_BATTLEAXE);
        entries.add(RUBY_CLAYMORE);
        entries.add(RUBY_HAMMER);
        entries.add(RUBY_MORNINGSTAR);

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

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
    }
}

