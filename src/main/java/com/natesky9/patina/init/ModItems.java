package com.natesky9.patina.init;

import com.natesky9.patina.Patina;
import com.natesky9.patina.item.BlinkBrownie;
import com.natesky9.patina.item.CoalCokeItem;
import com.natesky9.patina.item.LuxometerItem;
import com.natesky9.patina.item.VenomSwordItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Patina.MOD_ID);

    public static final RegistryObject<Item> TEST = ITEMS.register("test",
            () -> new Item(new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CUSTOM_INGOT = ITEMS.register("custom_ingot",
            () -> new Item(new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CUSTOM_NUGGET = ITEMS.register("custom_nugget",
            () -> new Item(new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().rarity(Rarity.UNCOMMON).tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> INERT_ROD = ITEMS.register("inert_rod",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON).tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> LUXOMETER = ITEMS.register("luxometer",
            () -> new LuxometerItem(new Item.Properties().rarity(Rarity.UNCOMMON).tab(Patina.CREATIVE_MODE_TAB)));


    public static final RegistryObject<Item> CUSTOM_SWORD = ITEMS.register("custom_sword",
            () -> new SwordItem(ModTiers.Custom,2,3f,new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CUSTOM_AXE = ITEMS.register("custom_axe",
            () -> new AxeItem(ModTiers.Custom,2,3f,new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CUSTOM_PICK = ITEMS.register("custom_pick",
            () -> new PickaxeItem(ModTiers.Custom,2,3f,new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CUSTOM_SHOVEL = ITEMS.register("custom_shovel",
            () -> new ShovelItem(ModTiers.Custom,2,3f,new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CUSTOM_HOE = ITEMS.register("custom_hoe",
            () -> new HoeItem(ModTiers.Custom,2,3f,new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> VENOM_SWORD = ITEMS.register("venom_sword",
            () -> new VenomSwordItem(ModTiers.Custom,3,3f,new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));

    //armor//
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots",
            () -> new ArmorItem(ModArmorMaterials.COPPER, EquipmentSlot.FEET,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> CRYSTAL_HELMET = ITEMS.register("crystal_helmet",
            () -> new ArmorItem(ModArmorMaterials.CRYSTAL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CRYSTAL_CHESTPLATE = ITEMS.register("crystal_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CRYSTAL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CRYSTAL_LEGGINGS = ITEMS.register("crystal_leggings",
            () -> new ArmorItem(ModArmorMaterials.CRYSTAL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CRYSTAL_BOOTS = ITEMS.register("crystal_boots",
            () -> new ArmorItem(ModArmorMaterials.CRYSTAL, EquipmentSlot.FEET,
                    new Item.Properties().tab(Patina.CREATIVE_MODE_TAB)));
    //foods
    public static final RegistryObject<Item> TEST_FOOD = ITEMS.register("test_food",
            () -> new Item(new Item.Properties().food(ModFoods.TEST_FOOD)
                    .tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> BLINK_BROWNIE = ITEMS.register("blink_brownie",
            () -> new BlinkBrownie(new Item.Properties().food(ModFoods.BLINK_BROWNIE)
                    .tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> CANDY_WARTS = ITEMS.register("candy_warts",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_WARTS)
                    .tab(Patina.CREATIVE_MODE_TAB)));
    //loot
    public static final RegistryObject<Item> ROYAL_JELLY = ITEMS.register("royal_jelly",
            () -> new Item(new Item.Properties()
                    .tab(Patina.CREATIVE_MODE_TAB)));
    public static final RegistryObject<Item> SPIDER_NEST = ITEMS.register("spider_nest",
            () -> new Item(new Item.Properties()
                    .tab(Patina.CREATIVE_MODE_TAB)));

    //--------------------------------------------------//
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
