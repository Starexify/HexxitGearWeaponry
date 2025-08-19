package net.nova.hexxit_gear_weaponry.event;

import net.minecraft.core.component.DataComponents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.BlocksAttacks;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingShieldBlockEvent;
import net.nova.hexxit_gear.item.ScaleArmor;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

@EventBusSubscriber(modid = MODID)
public class ItemAbilitiesEvent {
    @SubscribeEvent
    public static void onSwordBlock(LivingShieldBlockEvent event) {
        if (event.getEntity() instanceof Player player && event.getBlocked()) {
            ItemStack sword = player.getUseItem();
            BlocksAttacks blocksAttacks = sword.get(DataComponents.BLOCKS_ATTACKS);
            float cooldownTime = 0.2F;
            Level level = player.level();
            ServerLevel serverLevel = level instanceof ServerLevel ? (ServerLevel) level : null;

            // Scale Sword
            if (sword.is(HGWItems.SCALE_SWORD)) {
                blocksAttacks.disable(serverLevel, player, cooldownTime, sword);
            }
        }
    }
}
