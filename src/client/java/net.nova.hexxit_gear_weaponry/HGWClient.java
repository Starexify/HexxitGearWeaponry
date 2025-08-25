package net.nova.hexxit_gear_weaponry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.nova.hexxit_gear.HexxitGearR;
import net.nova.hexxit_gear.init.CreativeTab;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

public class HGWClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Creative Tab Placement
        ItemGroupEvents.modifyEntriesEvent(CreativeTab.HEXXIT_GEAR_TAB_KEY).register(entries -> {
            entries.addAfter(HGItems.SCALE_BOOTS, HGWItems.SCALE_SWORD);
        });
    }
}
