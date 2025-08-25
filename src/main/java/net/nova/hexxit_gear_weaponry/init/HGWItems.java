package net.nova.hexxit_gear_weaponry.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.nova.hexxit_gear_weaponry.HexxitGearWeaponry;
import net.nova.hexxit_gear_weaponry.items.ScaleSword;

import java.util.function.Function;

public class HGWItems {
    public static Item SCALE_SWORD = registerItem("scale_sword", properties -> new ScaleSword(properties.sword(HGWToolMaterial.SCALE, 3.0F, -3.3F).fireResistant().component(HGWDataComponents.BLOCKED_HITS, 0)));

    // Methods
    public static <T extends Item> T registerItem(String name, Function<Item.Properties, T> function) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, HexxitGearWeaponry.rl(name));
        return Registry.register(BuiltInRegistries.ITEM, key, function.apply(new Item.Properties().setId(key)));
    }

    public static void initialize() {
        HexxitGearWeaponry.LOGGER.info("Registering Items");
    }
}