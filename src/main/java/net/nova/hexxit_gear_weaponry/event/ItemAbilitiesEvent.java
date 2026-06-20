package net.nova.hexxit_gear_weaponry.event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingShieldBlockEvent;
import net.nova.hexxit_gear_weaponry.init.HGWDataComponents;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

@EventBusSubscriber(modid = MODID)
public class ItemAbilitiesEvent {
  @SubscribeEvent
  public static void onSwordBlock(LivingShieldBlockEvent event) {
    if (event.getEntity() instanceof Player player && event.getBlocked()) {
      ItemStack sword = player.getUseItem();

      // Scale Sword
      if (sword.is(HGWItems.SCALE_SWORD)) {
        var blockedHits = sword.get(HGWDataComponents.BLOCKED_HITS);
        if (blockedHits != null && blockedHits != 4) sword.set(HGWDataComponents.BLOCKED_HITS, blockedHits + 1);
      }
    }
  }
}