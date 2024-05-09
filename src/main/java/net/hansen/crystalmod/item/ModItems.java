package net.hansen.crystalmod.item;

import net.hansen.crystalmod.CrystalMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    private static final Item.Properties sapphireItemProperties = new Item.Properties().fireResistant();

    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, CrystalMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_TOURMALINE = ITEMS.register("black_tourmaline",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHLOROPHYTE_INGOT = ITEMS.register("chlorophyte_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHLOROPHYTE = ITEMS.register("raw_chlorophyte",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_STICK = ITEMS.register("obsidian_stick",
            () -> new Item(new Item.Properties()));

    // Utilities //
    public static final RegistryObject<Item> SAPPHIRE_ELYTRA = ITEMS.register("sapphire_elytra",
            () -> new SapphireElytraItem(new Item.Properties().durability(956).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> BLACK_TOURMALINE_ELYTRA = ITEMS.register("black_tourmaline_elytra",
            () -> new BlackTourmalineElytraItem(new Item.Properties().durability(956).rarity(Rarity.UNCOMMON)));



    // ARMORS // Sapphire
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET,  new  Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE,  new  Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS,  new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots",
            () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS,  new Item.Properties().rarity(Rarity.EPIC)));

    // ARMORS // Orichalcum
    public static final RegistryObject<ArmorItem> ORICHALCUM_HELMET = ITEMS.register("orichalcum_helmet",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.HELMET,  new  Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<ArmorItem> ORICHALCUM_CHESTPLATE = ITEMS.register("orichalcum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.CHESTPLATE,  new  Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<ArmorItem> ORICHALCUM_LEGGINGS = ITEMS.register("orichalcum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.LEGGINGS,  new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<ArmorItem> ORICHALCUM_BOOTS = ITEMS.register("orichalcum_boots",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, ArmorItem.Type.BOOTS,  new Item.Properties().rarity(Rarity.RARE)));

    // ARMORS // Chlorophyte
    public static final RegistryObject<ArmorItem> CHLOROPHYTE_HELMET = ITEMS.register("chlorophyte_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.HELMET,  new  Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<ArmorItem> CHLOROPHYTE_CHESTPLATE = ITEMS.register("chlorophyte_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.CHESTPLATE,  new  Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<ArmorItem> CHLOROPHYTE_LEGGINGS = ITEMS.register("chlorophyte_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.LEGGINGS,  new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<ArmorItem> CHLOROPHYTE_BOOTS = ITEMS.register("chlorophyte_boots",
            () -> new ArmorItem(ModArmorMaterials.CHLOROPHYTE, ArmorItem.Type.BOOTS,  new Item.Properties().rarity(Rarity.RARE)));

    // ARMORS // Black_tourmaline
    public static final RegistryObject<ArmorItem> BLACK_TOURMALINE_HELMET = ITEMS.register("black_tourmaline_helmet",
            () -> new ArmorItem(ModArmorMaterials.BLACK_TOURMALINE, ArmorItem.Type.HELMET,  new  Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<ArmorItem> BLACK_TOURMALINE_CHESTPLATE = ITEMS.register("black_tourmaline_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BLACK_TOURMALINE, ArmorItem.Type.CHESTPLATE,  new  Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<ArmorItem> BLACK_TOURMALINE_LEGGINGS = ITEMS.register("black_tourmaline_leggings",
            () -> new ArmorItem(ModArmorMaterials.BLACK_TOURMALINE, ArmorItem.Type.LEGGINGS,  new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<ArmorItem> BLACK_TOURMALINE_BOOTS = ITEMS.register("black_tourmaline_boots",
            () -> new ArmorItem(ModArmorMaterials.BLACK_TOURMALINE, ArmorItem.Type.BOOTS,  new Item.Properties().rarity(Rarity.EPIC)));



    // Tool & Weapon//

    public static final RegistryObject<SwordItem> BLACK_TOURMALINE_SWORD = ITEMS.register("black_tourmaline_sword", () ->
            new SwordItem(ModTiers.BLACK_TOURMALINE, 6, 1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<PickaxeItem> BLACK_TOURMALINE_PICKAXE = ITEMS.register("black_tourmaline_pickaxe", () ->
            new PickaxeItem(ModTiers.BLACK_TOURMALINE, 4, -1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<AxeItem> BLACK_TOURMALINE_AXE = ITEMS.register("black_tourmaline_axe", () ->
            new AxeItem(ModTiers.BLACK_TOURMALINE, 7, -1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<ShovelItem> BLACK_TOURMALINE_SHOVEL = ITEMS.register("black_tourmaline_shovel", () ->
            new ShovelItem(ModTiers.BLACK_TOURMALINE, 4, -1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<HoeItem> BLACK_TOURMALINE_HOE = ITEMS.register("black_tourmaline_hoe", () ->
            new HoeItem(ModTiers.BLACK_TOURMALINE, -12, 0.0f, sapphireItemProperties.rarity(Rarity.EPIC)));

    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SwordItem(ModTiers.SAPPHIRE, 6, 1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () ->
            new PickaxeItem(ModTiers.SAPPHIRE, 4, -1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () ->
            new AxeItem(ModTiers.SAPPHIRE, 7, -1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () ->
            new ShovelItem(ModTiers.SAPPHIRE, 4, -1.0f, sapphireItemProperties.rarity(Rarity.EPIC)));
    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () ->
            new HoeItem(ModTiers.SAPPHIRE, -12, 0.0f, sapphireItemProperties.rarity(Rarity.EPIC)));

    public static final RegistryObject<SwordItem> CHLOROPHYTE_SWORD = ITEMS.register("chlorophyte_sword", () ->
            new SwordItem(ModTiers.CHLOROPHYTE, 4, -0.5f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<PickaxeItem> CHLOROPHYTE_PICKAXE = ITEMS.register("chlorophyte_pickaxe", () ->
            new PickaxeItem(ModTiers.CHLOROPHYTE, 3, -1.0f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<AxeItem> CHLOROPHYTE_AXE = ITEMS.register("chlorophyte_axe", () ->
            new AxeItem(ModTiers.CHLOROPHYTE, 6, -2.0f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<ShovelItem> CHLOROPHYTE_SHOVEL = ITEMS.register("chlorophyte_shovel", () ->
            new ShovelItem(ModTiers.CHLOROPHYTE, 2, -1.0f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<HoeItem> CHLOROPHYTE_HOE = ITEMS.register("chlorophyte_hoe", () ->
            new HoeItem(ModTiers.CHLOROPHYTE, -12, 0.0f, sapphireItemProperties.rarity(Rarity.RARE)));

    public static final RegistryObject<SwordItem> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword", () ->
            new SwordItem(ModTiers.ORICHALCUM, 4, -0.5f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<PickaxeItem> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe", () ->
            new PickaxeItem(ModTiers.ORICHALCUM, 3, -1.0f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<AxeItem> ORICHALCUM_AXE = ITEMS.register("orichalcum_axe", () ->
            new AxeItem(ModTiers.ORICHALCUM, 6, -2.0f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<ShovelItem> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel", () ->
            new ShovelItem(ModTiers.ORICHALCUM, 2, -1.0f, sapphireItemProperties.rarity(Rarity.RARE)));
    public static final RegistryObject<HoeItem> ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe", () ->
            new HoeItem(ModTiers.ORICHALCUM, -12, 0.0f, sapphireItemProperties.rarity(Rarity.RARE)));

    // Upgrade Template //
    public static final RegistryObject<Item> SAPPHIRE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("sapphire_upgrade_smithing_template",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> BLACK_TOURMALINE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("black_tourmaline_upgrade_smithing_template",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    // Foods //
    public static final RegistryObject<Item> ORICHALCUM_APPLE = ITEMS.register("orichalcum_apple",
            () -> new EnchantedGoldenAppleItem(new Item.Properties().rarity(Rarity.EPIC).food(ModFoods.ORICHALCUM_APPLE)));
    public static final RegistryObject<Item> CHLOROPHYTE_APPLE = ITEMS.register("chlorophyte_apple",
            () -> new EnchantedGoldenAppleItem(new Item.Properties().rarity(Rarity.EPIC).food(ModFoods.CHLOROPHYTE_APPLE)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
