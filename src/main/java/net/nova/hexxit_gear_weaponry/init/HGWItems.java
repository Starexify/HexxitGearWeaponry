package net.nova.hexxit_gear_weaponry.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

public class HGWItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static DeferredItem<Item> SCALE_SWORD = ITEMS.registerSimpleItem("scale_sword");
}
