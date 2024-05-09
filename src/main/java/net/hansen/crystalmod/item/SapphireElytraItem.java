package net.hansen.crystalmod.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

public class SapphireElytraItem extends Item implements Equipable {
    private final Multimap<Attribute, AttributeModifier> MODIFIERS;
    public SapphireElytraItem(Properties pProperties) {
            super(pProperties);

            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
            builder.put(Attributes.ARMOR, new AttributeModifier("Sapphire Elytra armor", 10, AttributeModifier.Operation.ADDITION));
            this.MODIFIERS = builder.build();
}
    public static boolean isFlyEnabled(ItemStack p_41141_) {
        return p_41141_.getDamageValue() < p_41141_.getMaxDamage() - 1;
    }

    @Override
    public boolean isValidRepairItem(@NotNull ItemStack pToRepair, ItemStack pRepair) {
        return pRepair.is(ModItems.SAPPHIRE.get());
    }
    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        return slot == EquipmentSlot.CHEST ? this.MODIFIERS : super.getAttributeModifiers(slot, stack);
    }

    public InteractionResultHolder<ItemStack> use(Level p_41137_, Player p_41138_, InteractionHand p_41139_) {
        return this.swapWithEquipmentSlot(this, p_41137_, p_41138_, p_41139_);
    }

    public boolean canElytraFly(ItemStack stack, LivingEntity entity) {
        return isFlyEnabled(stack);
    }

    public boolean elytraFlightTick(ItemStack stack, LivingEntity entity, int flightTicks) {
        if (!entity.level().isClientSide) {
            int nextFlightTick = flightTicks + 1;
            if (nextFlightTick % 10 == 0) {
                if (nextFlightTick % 20 == 0) {
                    stack.hurtAndBreak(1, entity, (e) -> {
                        e.broadcastBreakEvent(EquipmentSlot.CHEST);
                    });
                }

                entity.gameEvent(GameEvent.ELYTRA_GLIDE);
            }
        }

        return true;
    }

    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_ELYTRA;
    }

    public EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.CHEST;
    }
}