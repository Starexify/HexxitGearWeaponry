package net.nova.hexxit_gear_weaponry.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagCopyingItemTagProvider;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;
import net.nova.hexxit_gear_weaponry.init.HGWTags;

import java.util.concurrent.CompletableFuture;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

public class HGWItemTagsProvider extends BlockTagCopyingItemTagProvider {
    public HGWItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags) {
        super(output, lookupProvider, blockTags, MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS).add(HGWItems.SCALE_SWORD.get());
        tag(HGWTags.ItemTag.SCALE_TOOL_MATERIALS).add(HGItems.HEXICAL_DIAMOND.get());
    }
}
