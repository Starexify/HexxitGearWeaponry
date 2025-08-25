package net.nova.hexxit_gear_weaponry.data.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;
import net.nova.hexxit_gear_weaponry.init.HGWTags;

import java.util.concurrent.CompletableFuture;

public class HGWItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public HGWItemTagsProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        valueLookupBuilder(ItemTags.SWORDS).add(HGWItems.SCALE_SWORD);
        valueLookupBuilder(HGWTags.ItemTag.SCALE_TOOL_MATERIALS).add(HGItems.HEXICAL_DIAMOND);
    }
}
