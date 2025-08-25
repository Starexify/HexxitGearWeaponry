package net.nova.hexxit_gear_weaponry.data.recipe;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.nova.hexxit_gear.init.HGItems;
import net.nova.hexxit_gear_weaponry.init.HGWItems;

public class CraftingRecipes extends RecipeProvider {
    public final HolderGetter<Item> itemLookup;

    protected CraftingRecipes(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
        itemLookup = registries.lookupOrThrow(Registries.ITEM);
    }

    @Override
    public void buildRecipes() {
        ShapedRecipeBuilder.shaped(itemLookup, RecipeCategory.COMBAT, HGWItems.SCALE_SWORD)
                .define('#', HGItems.HEXICAL_DIAMOND)
                .define('S', Items.NETHERITE_SWORD)
                .define('O', Blocks.OBSIDIAN)
                .define('G', Blocks.GOLD_BLOCK)
                .pattern(" O#")
                .pattern("G#O")
                .pattern("SG ")
                .unlockedBy(getHasName(HGItems.HEXICAL_DIAMOND), has(HGItems.HEXICAL_DIAMOND))
                .save(output);
    }
}
