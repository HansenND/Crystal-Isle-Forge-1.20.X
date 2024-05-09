package net.hansen.crystalmod.item;

import net.hansen.crystalmod.CrystalMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModForgeTiers
{
    public static Tier SAPPHIRE;
    public static Tier ORICHALCUM;
    public static Tier CHLOROPHYTE;

    static
    {
        SAPPHIRE = TierSortingRegistry.registerTier(
                new ForgeTier(5, 6000, 16.0f, 11.0f, 24, BlockTags.MINEABLE_WITH_PICKAXE, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
                new ResourceLocation(CrystalMod.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());

        ORICHALCUM = TierSortingRegistry.registerTier(
                new ForgeTier(3, 3000, 12.0f, 8.0f, 20, BlockTags.MINEABLE_WITH_PICKAXE, () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get())),
                new ResourceLocation(CrystalMod.MOD_ID, "orichalcum"), List.of(Tiers.IRON), List.of());

        CHLOROPHYTE = TierSortingRegistry.registerTier(
                new ForgeTier(4, 4500, 14.0f, 9.5f, 22, BlockTags.MINEABLE_WITH_PICKAXE, () -> Ingredient.of(ModItems.CHLOROPHYTE_INGOT.get())),
                new ResourceLocation(CrystalMod.MOD_ID, "chlorophyte"), List.of(Tiers.DIAMOND), List.of());
    }
}
