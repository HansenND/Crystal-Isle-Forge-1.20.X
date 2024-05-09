package net.hansen.crystalmod.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModTiers implements Tier {
    BLACK_TOURMALINE(5, 7500, 18.0f, 7.0f, 35, () ->
    {
        return Ingredient.of(ModItems.ORICHALCUM_INGOT.get());
    }),
    SAPPHIRE(5, 7500, 18.0f, 7.0f, 35, () ->
    {
        return Ingredient.of(ModItems.SAPPHIRE.get());
    }),
    ORICHALCUM(3, 3000, 16.0f, 5.5f, 35, () ->
    {
        return Ingredient.of(ModItems.ORICHALCUM_INGOT.get());
    }),
    CHLOROPHYTE(3, 3000, 16.0f, 5.5f, 35, () ->
    {
        return Ingredient.of(ModItems.CHLOROPHYTE_INGOT.get());
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient)
    {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses()
    {
        return this.uses;
    }

    @Override
    public float getSpeed()
    {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus()
    {
        return this.damage;
    }

    @Override
    public int getLevel()
    {
        return this.level;
    }

    @Override
    public int getEnchantmentValue()
    {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }
}
