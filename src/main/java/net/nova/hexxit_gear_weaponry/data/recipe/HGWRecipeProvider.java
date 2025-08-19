package net.nova.hexxit_gear_weaponry.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

import java.util.concurrent.CompletableFuture;

public class HGWRecipeProvider extends RecipeProvider {
    protected HGWRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        // Scale Sword
        shaped(RecipeCategory.MISC, HGWItems.SCALE_SWORD)
                .define('#', HGItems.HEXICAL_DIAMOND)
                .define('S', Items.NETHERITE_SWORD)
                .define('O', Blocks.OBSIDIAN)
                .define('G', Blocks.GOLD_BLOCK)
                .pattern(" O#")
                .pattern("G#O")
                .pattern("SG ")
                .unlockedBy(getHasName(HGItems.HEXICAL_PETAL), has(HGItems.HEXICAL_PETAL))
                .save(output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
            return new HGWRecipeProvider(provider, output);
        }

        @Override
        public String getName() {
            return "Hexxit Gear Weaponry Recipes";
        }
    }
}
