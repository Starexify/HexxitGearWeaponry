package net.nova.hexxit_gear_weaponry.init;

import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.nova.hexxit_gear_weaponry.HexxitGearWeaponry;
import net.nova.hexxit_gear_weaponry.items.ScaleSword;

import java.util.function.Function;

public class HGWItems {
  public static Pair<Holder<Item>, ResourceKey<Item>> SCALE_SWORD = registerItem("scale_sword", properties -> new ScaleSword(properties.sword(HGWToolMaterial.SCALE, 3.0F, -3.3F).fireResistant().component(HGWDataComponents.BLOCKED_HITS, 0)));

  // Methods
  public static <T extends Item> Pair<Holder<T>, ResourceKey<Item>> registerItem(String name, Function<Item.Properties, T> function) {
    return register(name, function, new Item.Properties());
  }

  public static <T extends Item> Pair<Holder<T>, ResourceKey<Item>> register(String name, Function<Item.Properties, T> function, Item.Properties properties) {
    ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, HexxitGearWeaponry.rl(name));
    return Pair.of(Registry.registerForHolder(BuiltInRegistries.ITEM, key, function.apply(properties.setId(key))), key);
  }

  public static void initialize() {
    HexxitGearWeaponry.LOGGER.info("Registering Items");
  }
}