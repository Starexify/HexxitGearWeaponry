package net.nova.hexxit_gear_weaponry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

public class HGWClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Creative Tab Placement
  /*      ItemGroupEvents.modifyEntriesEvent().register(entries -> {
            entries.addAfter(HGItems.SCALE_HELMET, HGWItems.SCALE_SWORD);
        });*/
    }
}
