package net.nova.hexxit_gear_weaponry.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.nova.hexxit_gear_weaponry.init.HGWTags;

import java.util.concurrent.CompletableFuture;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

public class HGWBlockTagsProvider extends BlockTagsProvider {
    public HGWBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(HGWTags.BlockTag.INCORRECT_FOR_SCALE_TOOL);
    }
}
