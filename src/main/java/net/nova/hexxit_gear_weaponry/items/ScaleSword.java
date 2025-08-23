package net.nova.hexxit_gear_weaponry.items;

import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.BlocksAttacks;
import net.nova.hexxit_gear.item.ScaleArmor;
import net.nova.hexxit_gear_weaponry.init.HGWDataComponents;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Optional;

public class ScaleSword extends Item {
    public static int ABILITY_COOLDOWN = 300;

    public ScaleSword(Properties properties) {
        super(properties);
    }

    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, @Nullable EquipmentSlot slotId) {
        super.inventoryTick(stack, level, entity, slotId);
        if (entity instanceof LivingEntity livingEntity) {
            boolean isWearingFullSet = true;
            boolean currentlyHasBlocking = stack.has(DataComponents.BLOCKS_ATTACKS);
            for (EquipmentSlot slot : new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET})
                if (!(livingEntity.getItemBySlot(slot).getItem() instanceof ScaleArmor)) isWearingFullSet = false;

            if (isWearingFullSet && !currentlyHasBlocking) stack.set(DataComponents.BLOCKS_ATTACKS, new BlocksAttacks(
                    0.25F, 1.0F,
                    List.of(new BlocksAttacks.DamageReduction(45.0F, Optional.empty(), 0.0F, 0.6F)),
                    new BlocksAttacks.ItemDamageFunction(3.0F, 1.0F, 1.0F),
                    Optional.of(DamageTypeTags.BYPASSES_SHIELD),
                    Optional.of(SoundEvents.SHIELD_BLOCK),
                    Optional.of(SoundEvents.SHIELD_BREAK)
            ));
            else if (!isWearingFullSet && currentlyHasBlocking) stack.remove(DataComponents.BLOCKS_ATTACKS);
        }
    }

    @Override
    public void onStopUsing(ItemStack stack, LivingEntity entity, int count) {
        super.onStopUsing(stack, entity, count);
        var blockedHits = stack.get(HGWDataComponents.BLOCKED_HITS);
        stack.set(HGWDataComponents.BLOCKED_HITS, 0);
        if (blockedHits >= 4) {
            if (entity instanceof Player) {
                Player player = (Player) entity;
                player.getCooldowns().addCooldown(stack, ABILITY_COOLDOWN);
            }
        }
    }
}
