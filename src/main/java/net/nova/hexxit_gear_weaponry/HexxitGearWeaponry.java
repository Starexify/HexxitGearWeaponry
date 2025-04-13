package net.nova.hexxit_gear_weaponry;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;

public class HexxitGearWeaponry implements ModInitializer {
    public static final String MODID = "hexxit_gear_weaponry";

    @Override
    public void onInitialize() {

    }

    // Util methods
    public static ResourceLocation rl(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
