package net.mephilis.devocs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mephilis.devocs.DevelopmentMultiverseOCs;
import net.mephilis.devocs.item.custom.HammerItem;
import net.mephilis.devocs.item.custom.MilkshakeItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item MOLTEN_IRON = registerItem("molten_iron", new Item(new FabricItemSettings()));
    public static final Item RUBY_UPGRADE = registerItem("ruby_upgrade", new Item(new FabricItemSettings()));
    public static final Item COBALT_UPGRADE = registerItem("cobalt_upgrade", new Item(new FabricItemSettings()));
    public static final Item COBALT_DUST = registerItem("cobalt_dust", new Item(new FabricItemSettings()));
    public static final Item COBALT_INGOT = registerItem("cobalt_ingot", new Item(new FabricItemSettings()));




    public static final Item COBALT_BATTLEAXE = registerItem("cobalt_battleaxe"
            , new SwordItem(ModToolMaterial.COBALT,6,-3.5F, new FabricItemSettings()));
    public static final Item COBALT_CLAYMORE = registerItem("cobalt_claymore"
            , new SwordItem(ModToolMaterial.COBALT,2,-2.5F, new FabricItemSettings()));
    public static final Item COBALT_HAMMER = registerItem("cobalt_hammer"
            , new HammerItem(ModToolMaterial.COBALT,8,-3.75F, new FabricItemSettings()));
    public static final Item COBALT_MORNINGSTAR = registerItem("cobalt_morningstar"
            , new SwordItem(ModToolMaterial.COBALT,1,-1.5F, new FabricItemSettings()));
    public static final Item COBALT_SCYTHE = registerItem("cobalt_scythe"
            , new SwordItem(ModToolMaterial.COBALT,0,-1F, new FabricItemSettings()));
    public static final Item RUBY_BATTLEAXE = registerItem("ruby_battleaxe"
            , new SwordItem(ModToolMaterial.RUBY,5,-3F, new FabricItemSettings()));
    public static final Item RUBY_CLAYMORE = registerItem("ruby_claymore"
            , new SwordItem(ModToolMaterial.RUBY,2,-2.5F, new FabricItemSettings()));
    public static final Item RUBY_HAMMER = registerItem("ruby_hammer"
            , new HammerItem(ModToolMaterial.RUBY,7,-3F, new FabricItemSettings()));
    public static final Item RUBY_MORNINGSTAR = registerItem("ruby_morningstar"
            , new SwordItem(ModToolMaterial.RUBY,-1,-1F, new FabricItemSettings()));
    public static final Item RUBY_SCYTHE = registerItem("ruby_scythe"
            , new SwordItem(ModToolMaterial.RUBY,-1,-1F, new FabricItemSettings()));
    public static final Item TRUSTY = registerItem("trusty"
            , new SwordItem(ModToolMaterial.SPECIAL,4,-2.4F, new FabricItemSettings()));
    public static final Item MOSSY_SCYTHE = registerItem("mossy_scythe"
            , new SwordItem(ModToolMaterial.SPECIAL,2,-1, new FabricItemSettings()));

    public static final Item COBALT_HELMET = registerItem("cobalt_helmet"
            , new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate"
            , new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings"
            , new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots"
            , new ArmorItem(ModArmorMaterials.COBALT, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RUBY_HELMET = registerItem("ruby_helmet"
            , new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate"
            , new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings"
            , new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots"
            , new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));



    public static final Item MILKSHAKE = registerItem("milkshake", new MilkshakeItem(new FabricItemSettings().food(ModFoodComponents.MILKSHAKE).maxCount(1)));


     private static void  addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(COBALT_DUST);
        entries.add(COBALT_INGOT);
        entries.add(MOLTEN_IRON);
        entries.add(COBALT_UPGRADE);
        entries.add(RUBY_UPGRADE);

     }

    private static void  addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {


        entries.add(TRUSTY);
        entries.add(MOSSY_SCYTHE);
        entries.add(COBALT_CLAYMORE);
        entries.add(COBALT_BATTLEAXE);
        entries.add(COBALT_HAMMER);
        entries.add(COBALT_MORNINGSTAR);
        entries.add(COBALT_SCYTHE);
        entries.add(RUBY_CLAYMORE);
        entries.add(RUBY_BATTLEAXE);
        entries.add(RUBY_HAMMER);
        entries.add(RUBY_MORNINGSTAR);
        entries.add(RUBY_SCYTHE);
        entries.add(COBALT_HELMET);
        entries.add(COBALT_CHESTPLATE);
        entries.add(COBALT_LEGGINGS);
        entries.add(COBALT_BOOTS);
        entries.add(RUBY_HELMET);
        entries.add(RUBY_CHESTPLATE);
        entries.add(RUBY_LEGGINGS);
        entries.add(RUBY_BOOTS);

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

