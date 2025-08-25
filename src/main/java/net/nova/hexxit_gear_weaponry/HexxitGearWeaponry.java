package net.nova.hexxit_gear_weaponry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import net.nova.hexxit_gear_weaponry.init.HGWItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HexxitGearWeaponry implements ModInitializer {
    public static final String MODID = "hexxit_gear_weaponry";
    public static final Logger LOGGER = LoggerFactory.getLogger(HexxitGearWeaponry.class);

    @Override
    public void onInitialize() {

    }

    // Util methods
    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}