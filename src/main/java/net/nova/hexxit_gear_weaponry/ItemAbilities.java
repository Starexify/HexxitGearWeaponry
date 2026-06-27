package net.nova.hexxit_gear_weaponry;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.nova.hexxit_gear_weaponry.init.HGWDataComponents;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

public class ItemAbilities {
  public static void register() {
    ServerLivingEntityEvents.AFTER_DAMAGE.register((entity, damageSource, baseDamageTaken, damageTaken, blocked) -> {
      if (entity instanceof Player player && player.isBlocking()) {
        ItemStack sword = player.getItemBlockingWith();

        // Scale Sword
        if (sword.is(HGWItems.SCALE_SWORD.getFirst())) {
          var blockedHits = sword.get(HGWDataComponents.BLOCKED_HITS);
          if (blockedHits != null && blockedHits != 4) sword.set(HGWDataComponents.BLOCKED_HITS, blockedHits + 1);
        }
      }
    });
  }
}