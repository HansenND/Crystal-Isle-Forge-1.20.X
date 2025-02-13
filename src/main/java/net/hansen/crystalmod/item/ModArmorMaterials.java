package net.hansen.crystalmod.item;

import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BLACK_TOURMALINE("black_tourmaline", 42, Util.make(new EnumMap<>(ArmorItem.Type.class), (black_tourmaline) -> {
        black_tourmaline.put(ArmorItem.Type.BOOTS, 6);
        black_tourmaline.put(ArmorItem.Type.LEGGINGS, 9);
        black_tourmaline.put(ArmorItem.Type.CHESTPLATE, 10);
        black_tourmaline.put(ArmorItem.Type.HELMET, 5);
    }), 21, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F, () -> {
        return Ingredient.of(ModItems.BLACK_TOURMALINE.get());
    }),
    SAPPHIRE("sapphire", 42, Util.make(new EnumMap<>(ArmorItem.Type.class), (sapphire) -> {
        sapphire.put(ArmorItem.Type.BOOTS, 6);
        sapphire.put(ArmorItem.Type.LEGGINGS, 9);
        sapphire.put(ArmorItem.Type.CHESTPLATE, 10);
        sapphire.put(ArmorItem.Type.HELMET, 5);
    }), 21, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.3F, () -> {
        return Ingredient.of(ModItems.SAPPHIRE.get());
    }),
    CHLOROPHYTE("chlorophyte", 37, Util.make(new EnumMap<>(ArmorItem.Type.class), (chlorophyte) -> {
        chlorophyte.put(ArmorItem.Type.BOOTS, 3);
        chlorophyte.put(ArmorItem.Type.LEGGINGS, 6);
        chlorophyte.put(ArmorItem.Type.CHESTPLATE, 8);
        chlorophyte.put(ArmorItem.Type.HELMET, 3);
    }), 19, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.2F, () -> {
        return Ingredient.of(ModItems.CHLOROPHYTE_INGOT.get());
    }),
    ORICHALCUM("orichalcum", 37, Util.make(new EnumMap<>(ArmorItem.Type.class), (orichalcum) -> {
        orichalcum.put(ArmorItem.Type.BOOTS, 3);
        orichalcum.put(ArmorItem.Type.LEGGINGS, 6);
        orichalcum.put(ArmorItem.Type.CHESTPLATE, 8);
        orichalcum.put(ArmorItem.Type.HELMET, 3);
    }), 17, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.5F, 0.2F, () -> {
        return Ingredient.of(ModItems.ORICHALCUM_INGOT.get());
    });

    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private ModArmorMaterials(String p_268171_, int p_268303_, EnumMap<ArmorItem.Type, Integer> p_267941_, int p_268086_, SoundEvent p_268145_, float p_268058_, float p_268180_, Supplier<Ingredient> p_268256_) {
        this.name = p_268171_;
        this.durabilityMultiplier = p_268303_;
        this.protectionFunctionForType = p_267941_;
        this.enchantmentValue = p_268086_;
        this.sound = p_268145_;
        this.toughness = p_268058_;
        this.knockbackResistance = p_268180_;
        this.repairIngredient = new LazyLoadedValue<>(p_268256_);
    }

    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }
}
