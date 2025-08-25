package net.nova.hexxit_gear_weaponry;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.nova.hexxit_gear_weaponry.data.recipe.HGWRecipeProvider;
import net.nova.hexxit_gear_weaponry.data.tags.HGWBlockTagsProvider;
import net.nova.hexxit_gear_weaponry.data.tags.HGWItemTagsProvider;

public class DataGenerators implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(HGWRecipeProvider::new);
        pack.addProvider(HGWItemTagsProvider::new);
        pack.addProvider(HGWBlockTagsProvider::new);
    }
}
