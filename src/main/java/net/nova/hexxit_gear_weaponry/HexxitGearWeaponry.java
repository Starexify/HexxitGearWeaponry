package net.nova.hexxit_gear_weaponry;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.nova.hexxit_gear_weaponry.init.HGWItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

@Mod(MODID)
public class HexxitGearWeaponry {
    public static final String MODID = "hexxit_gear_weaponry";
    public static final Logger logger = LoggerFactory.getLogger(HexxitGearWeaponry.class);

    public HexxitGearWeaponry(IEventBus bus) {
        HGWItems.ITEMS.register(bus);
    }

    // Util methods
    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
