package net.nova.hexxit_gear_weaponry.init;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nova.hexxit_gear_weaponry.items.ScaleSword;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

public class HGWItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static DeferredItem<Item> SCALE_SWORD = ITEMS.registerItem("scale_sword", properties -> new ScaleSword(properties.sword(HGWToolMaterial.SCALE, 3.0F, -3.3F).fireResistant().component(HGWDataComponents.BLOCKED_HITS, 0)));
}