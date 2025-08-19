package net.nova.hexxit_gear_weaponry.data;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.nova.hexxit_gear_weaponry.data.recipe.HGWRecipeProvider;
import net.nova.hexxit_gear_weaponry.data.tags.HGWBlockTagsProvider;
import net.nova.hexxit_gear_weaponry.data.tags.HGWItemTagsProvider;

import static net.nova.hexxit_gear_weaponry.HexxitGearWeaponry.MODID;

@EventBusSubscriber(modid = MODID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(HGWRecipeProvider.Runner::new);
        event.createBlockAndItemTags(HGWBlockTagsProvider::new, HGWItemTagsProvider::new);
    }
}
