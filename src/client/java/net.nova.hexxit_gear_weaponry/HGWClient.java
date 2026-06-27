package net.nova.hexxit_gear_weaponry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.nova.hexxit_gear.init.CreativeTab;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

public class HGWClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    // Creative Tab Placement
    CreativeModeTabEvents.modifyOutputEvent(CreativeTab.HEXXIT_GEAR_TAB_KEY).register(entries -> {
      entries.insertAfter(HGItems.SCALE_BOOTS.getFirst().value(), HGWItems.SCALE_SWORD.getFirst().value());
    });
  }
}
