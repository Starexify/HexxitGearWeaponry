package net.nova.hexxit_gear_weaponry.data.tags;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.nova.hexxit_gear_weaponry.init.HGWTags;

import java.util.concurrent.CompletableFuture;

public class HGWBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
  public HGWBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
    super(output, registriesFuture);
  }

  @Override
  protected void addTags(HolderLookup.Provider provider) {
    builder(HGWTags.BlockTag.INCORRECT_FOR_SCALE_TOOL);
  }
}
