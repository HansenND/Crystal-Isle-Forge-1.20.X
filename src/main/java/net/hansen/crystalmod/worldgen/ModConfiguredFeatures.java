package net.hansen.crystalmod.worldgen;

import net.hansen.crystalmod.CrystalMod;
import net.hansen.crystalmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static net.minecraft.data.worldgen.features.FeatureUtils.register;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHLOROPHYTE_ORE_KEY = registerKey("chlorophyte_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ORICHALCUM_ORE_KEY = registerKey("orichalcum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLACK_TOURMALINE_ORE_KEY = registerKey("black_tourmaline_ore");

    public  static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldCrystalores = List.of(OreConfiguration.target(deepslateReplaceables,
                ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.CHLOROPHYTE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.ORICHALCUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.BLACK_TOURMALINE_ORE.get().defaultBlockState()));


        register(context, OVERWORLD_CHLOROPHYTE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCrystalores,5));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCrystalores,4));
        register(context, OVERWORLD_ORICHALCUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCrystalores,6));
        register(context, OVERWORLD_BLACK_TOURMALINE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCrystalores,3));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(CrystalMod.MOD_ID, name));

    }

    private static <FC extends FeatureConfiguration, F extends  Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                           ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new  ConfiguredFeature<>(feature, configuration));
    }


}
