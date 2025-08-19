package net.nova.hexxit_gear_weaponry.event;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.nova.hexxit_gear.init.CreativeTab;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

import java.util.function.Supplier;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

@EventBusSubscriber(modid = MODID)
public class HexxitGearAddonClient {
    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        CreativeModeTab hgTab = CreativeTab.HEXXIT_GEAR_TAB.get();
        if (event.getTab() == hgTab) {
            putAfter(HGItems.SCALE_BOOTS.get(), HGWItems.SCALE_SWORD, event);
        }
    }

    public static void putAfter(Item item, Supplier<? extends ItemLike> itemAfter, BuildCreativeModeTabContentsEvent event) {
        event.insertAfter(item.getDefaultInstance(), itemAfter.get().asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
