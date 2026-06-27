package net.nova.hexxit_gear_weaponry.data.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;
import net.nova.hexxit_gear_weaponry.init.HGWTags;

import java.util.concurrent.CompletableFuture;

public class HGWItemTagsProvider extends FabricTagsProvider.ItemTagsProvider {
  public HGWItemTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void addTags(HolderLookup.Provider wrapperLookup) {
    builder(ItemTags.SWORDS).add(HGWItems.SCALE_SWORD.getSecond());
    builder(HGWTags.ItemTag.SCALE_TOOL_MATERIALS).add(HGItems.HEXICAL_DIAMOND.getSecond());
  }
}
