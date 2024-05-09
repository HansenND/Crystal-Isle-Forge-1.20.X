package net.hansen.crystalmod;

import com.mojang.logging.LogUtils;
import net.hansen.crystalmod.block.ModBlocks;
import net.hansen.crystalmod.item.BlackTourmalineElytraItem;
import net.hansen.crystalmod.item.ModCreativeModsTab;
import net.hansen.crystalmod.item.ModItems;
import net.hansen.crystalmod.item.SapphireElytraItem;
import net.hansen.crystalmod.render.BlackTourmalineElytraRenderer;
import net.hansen.crystalmod.render.SapphireElytraRenderer;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;


@Mod(CrystalMod.MOD_ID)
public class CrystalMod {
    public static final String MOD_ID = "crystalmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CrystalMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModsTab.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModsTab.CRYSTAL_TAB.get()) {
            event.accept(ModItems.BLACK_TOURMALINE);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.CHLOROPHYTE_INGOT);
            event.accept(ModItems.ORICHALCUM_INGOT);
            event.accept(ModItems.RAW_ORICHALCUM);
            event.accept(ModItems.RAW_CHLOROPHYTE);
            event.accept(ModItems.SAPPHIRE_UPGRADE_SMITHING_TEMPLATE);
            event.accept(ModItems.BLACK_TOURMALINE_UPGRADE_SMITHING_TEMPLATE);
            event.accept(ModItems.OBSIDIAN_STICK);
        }
        if (event.getTab() == ModCreativeModsTab.CRYSTAL_TAB.get()){
            event.accept(ModItems.BLACK_TOURMALINE_HELMET);
            event.accept(ModItems.BLACK_TOURMALINE_CHESTPLATE);
            event.accept(ModItems.BLACK_TOURMALINE_LEGGINGS);
            event.accept(ModItems.BLACK_TOURMALINE_BOOTS);
            event.accept(ModItems.BLACK_TOURMALINE_SWORD);
            event.accept(ModItems.BLACK_TOURMALINE_AXE);
            event.accept(ModItems.BLACK_TOURMALINE_PICKAXE);
            event.accept(ModItems.BLACK_TOURMALINE_SHOVEL);
            event.accept(ModItems.BLACK_TOURMALINE_HOE);
            event.accept(ModItems.SAPPHIRE_HELMET);
            event.accept(ModItems.SAPPHIRE_CHESTPLATE);
            event.accept(ModItems.SAPPHIRE_LEGGINGS);
            event.accept(ModItems.SAPPHIRE_BOOTS);
            event.accept(ModItems.SAPPHIRE_SWORD);
            event.accept(ModItems.SAPPHIRE_AXE);
            event.accept(ModItems.SAPPHIRE_PICKAXE);
            event.accept(ModItems.SAPPHIRE_SHOVEL);
            event.accept(ModItems.SAPPHIRE_HOE);
            event.accept(ModItems.CHLOROPHYTE_HELMET);
            event.accept(ModItems.CHLOROPHYTE_CHESTPLATE);
            event.accept(ModItems.CHLOROPHYTE_LEGGINGS);
            event.accept(ModItems.CHLOROPHYTE_BOOTS);
            event.accept(ModItems.CHLOROPHYTE_SWORD);
            event.accept(ModItems.CHLOROPHYTE_AXE);
            event.accept(ModItems.CHLOROPHYTE_PICKAXE);
            event.accept(ModItems.CHLOROPHYTE_SHOVEL);
            event.accept(ModItems.CHLOROPHYTE_HOE);
            event.accept(ModItems.ORICHALCUM_HELMET);
            event.accept(ModItems.ORICHALCUM_CHESTPLATE);
            event.accept(ModItems.ORICHALCUM_LEGGINGS);
            event.accept(ModItems.ORICHALCUM_BOOTS);
            event.accept(ModItems.ORICHALCUM_SWORD);
            event.accept(ModItems.ORICHALCUM_AXE);
            event.accept(ModItems.ORICHALCUM_PICKAXE);
            event.accept(ModItems.ORICHALCUM_SHOVEL);
            event.accept(ModItems.ORICHALCUM_HOE);
        }
        if(event.getTab() == ModCreativeModsTab.CRYSTAL_TAB.get()){
            event.accept(ModItems.CHLOROPHYTE_APPLE);
            event.accept(ModItems.ORICHALCUM_APPLE);
            event.accept(ModItems.BLACK_TOURMALINE_ELYTRA);
            event.accept(ModItems.SAPPHIRE_ELYTRA);
        }
        if(event.getTab() == ModCreativeModsTab.CRYSTAL_TAB.get()){
            event.accept(ModBlocks.BLACK_TOURMALINE_BLOCK);
            event.accept(ModBlocks.BLACK_TOURMALINE_ORE);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_ORE);
            event.accept(ModBlocks.CHLOROPHYTE_BLOCk);
            event.accept(ModBlocks.CHLOROPHYTE_ORE);
            event.accept(ModBlocks.ORICHALCUM_BLOCK);
            event.accept(ModBlocks.ORICHALCUM_ORE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class DeeperDarkerClient
    {
        @SubscribeEvent
        public static void clientSetup(final FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ItemProperties.register(ModItems.SAPPHIRE_ELYTRA.get(), new ResourceLocation("broken"),
                        (pStack, pLevel, pEntity, pSeed) -> SapphireElytraItem.isFlyEnabled(pStack) ? 0 : 1);
                ItemProperties.register(ModItems.BLACK_TOURMALINE_ELYTRA.get(), new ResourceLocation("broken"),
                        (pStack, pLevel, pEntity, pSeed) -> BlackTourmalineElytraItem.isFlyEnabled(pStack) ? 0 : 1);
            });
}
        @SubscribeEvent
        public static void addLayers(final EntityRenderersEvent.AddLayers event) {
            event.getSkins().forEach(name -> {
                if(event.getSkin(name) instanceof PlayerRenderer renderer) {
                    renderer.addLayer(new SapphireElytraRenderer<>(renderer, event.getEntityModels()));
                    renderer.addLayer(new BlackTourmalineElytraRenderer<>(renderer, event.getEntityModels()));

                }
            });
            if(event.getRenderer(EntityType.ARMOR_STAND) instanceof ArmorStandRenderer renderer) {
                renderer.addLayer(new SapphireElytraRenderer<>(renderer, event.getEntityModels()));
                renderer.addLayer(new BlackTourmalineElytraRenderer<>(renderer, event.getEntityModels()));
    }
}
        @SubscribeEvent
        public void enqueueIMC(final InterModEnqueueEvent event) {
            SlotTypePreset[] types = {SlotTypePreset.BACK};
            for (SlotTypePreset type : types) {
                InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> type.getMessageBuilder().build());
            }
        }
    }
}
