package net.hansen.crystalmod.block;

import net.hansen.crystalmod.CrystalMod;
import net.hansen.crystalmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrystalMod.MOD_ID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(5,10)));

    public static final RegistryObject<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ORICHALCUM_ORE = registerBlock("orichalcum_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(3,8)));

    public static final RegistryObject<Block> CHLOROPHYTE_BLOCk = registerBlock("chlorophyte_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHLOROPHYTE_ORE = registerBlock("chlorophyte_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(4,9)));

    public static final RegistryObject<Block> BLACK_TOURMALINE_BLOCK = registerBlock("black_tourmaline_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(7f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLACK_TOURMALINE_ORE = registerBlock("black_tourmaline_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(6,12)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),
                new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
