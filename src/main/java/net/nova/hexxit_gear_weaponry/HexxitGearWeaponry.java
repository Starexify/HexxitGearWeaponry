package net.nova.hexxit_gear_weaponry;

import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.nova.hexxit_gear_weaponry.init.HGWDataComponents;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

@Mod(MODID)
public class HexxitGearWeaponry {
    public static final String MODID = "hexxit_gear_weaponry";

    public HexxitGearWeaponry(IEventBus bus) {
        HGWDataComponents.COMPONENTS.register(bus);
        HGWItems.ITEMS.register(bus);
    }

    // Util methods
    public static Identifier rl(String path) {
        return Identifier.fromNamespaceAndPath(MODID, path);
    }
}