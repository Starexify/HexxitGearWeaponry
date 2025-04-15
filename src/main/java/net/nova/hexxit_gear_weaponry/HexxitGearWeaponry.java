package net.nova.hexxit_gear_weaponry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import java.util.function.Function;

public class HexxitGearWeaponry implements ModInitializer {
    public static final String MODID = "hexxit_gear_weaponry";

    public static Item SCALE_SWORD;

    @Override
    public void onInitialize() {
        SCALE_SWORD = registerItem("scale_sword", properties -> new Item(properties.sword(ToolMaterial.NETHERITE, 3.0F, -2.4F).fireResistant()));

    }

    public static Item registerItem(String name, Function<Item.Properties, Item> factory) {
        return register(name, factory, new Item.Properties());
    }

    public static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, rl(name)), factory.apply(properties.setId(ResourceKey.create(Registries.ITEM, rl(name)))));
    }

    // Util methods
    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
