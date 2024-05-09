package net.hansen.crystalmod.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.hansen.crystalmod.CrystalMod;
import net.hansen.crystalmod.item.ModItems;
import net.minecraft.client.model.ElytraModel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public class BlackTourmalineElytraRenderer<E extends LivingEntity, M extends EntityModel<E>> extends ElytraLayer<E, M> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(CrystalMod.MOD_ID, "textures/entity/black_tourmaline_elytra.png");
    private final ElytraModel<E> model;

    public BlackTourmalineElytraRenderer(RenderLayerParent<E, M> pRenderer, EntityModelSet pModelSet) {
        super(pRenderer, pModelSet);
        this.model = new ElytraModel<>(pModelSet.bakeLayer(ModelLayers.ELYTRA));
    }
    @Override
    public void render(PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight, E pLivingEntity, float pLimbSwing, float pLimbSwingAmount, float pPartialTicks, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        ItemStack itemStack = pLivingEntity.getItemBySlot(EquipmentSlot.CHEST);
        if(itemStack.is(ModItems.BLACK_TOURMALINE_ELYTRA.get())) {
            pMatrixStack.pushPose();
            pMatrixStack.translate(0, 0, 0.125f);
            this.getParentModel().copyPropertiesTo(this.model);
            this.model.setupAnim(pLivingEntity, pLimbSwing, pLimbSwingAmount, pAgeInTicks, pNetHeadYaw, pHeadPitch);
            VertexConsumer vertexConsumer = ItemRenderer.getArmorFoilBuffer(pBuffer, RenderType.armorCutoutNoCull(TEXTURE), false, itemStack.hasFoil());
            this.model.renderToBuffer(pMatrixStack, vertexConsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
            pMatrixStack.popPose();
        }
    }
}
