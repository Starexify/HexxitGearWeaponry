package net.nova.hexxit_gear_weaponry.init;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;
import net.nova.hexxit_gear_weaponry.HexxitGearWeaponry;

import java.util.function.UnaryOperator;

public class HGWDataComponents {
    public static final DataComponentType<Integer> BLOCKED_HITS = register(
            "blocked_hits", builder -> builder.persistent(ExtraCodecs.intRange(0, 4)).networkSynchronized(ByteBufCodecs.VAR_INT)
    );

    // Registers
    public static <T> DataComponentType<T> register(String name, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {
        return Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, HexxitGearWeaponry.rl(name), builderOperator.apply(DataComponentType.builder()).build());
    }

    public static void initialize() {
        HexxitGearWeaponry.LOGGER.info("Registering Data Components");
    }
}
