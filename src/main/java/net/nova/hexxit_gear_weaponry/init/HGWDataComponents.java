package net.nova.hexxit_gear_weaponry.init;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.util.ExtraCodecs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

public class HGWDataComponents {
    public static final DeferredRegister.DataComponents COMPONENTS = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, MODID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> BLOCKED_HITS = COMPONENTS.registerComponentType(
            "blocked_hits", builder -> builder.persistent(ExtraCodecs.intRange(0, 4)).networkSynchronized(ByteBufCodecs.VAR_INT)
    );
}
