package net.hansen.crystalmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CHLOROPHYTE_APPLE = new FoodProperties.Builder().alwaysEat().nutrition(4)
            .saturationMod(1.2f).effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 400,2),1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 6000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 6000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL, 100, 1), 1.0F)
            .build();
    public static final FoodProperties ORICHALCUM_APPLE = new FoodProperties.Builder().alwaysEat().nutrition(4)
            .saturationMod(1.2f).effect(()-> new MobEffectInstance(MobEffects.REGENERATION, 400,2),1.0f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 6000, 4), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.JUMP, 6000, 2), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEAL, 100, 1), 1.0F)
            .build();
}
