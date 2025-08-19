package net.nova.hexxit_gear_weaponry.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.nova.hexxit_gear_weaponry.HexxitGearWeaponry;

public class HGWTags {
    public interface BlockTag {
        TagKey<Block> INCORRECT_FOR_SCALE_TOOL = blockTag("incorrect_for_scale_tool");
    }

    public interface ItemTag {
        TagKey<Item> SCALE_TOOL_MATERIALS = itemTag("scale_tool_materials");
    }

    // Registers
    public static TagKey<Block> blockTag(String name) {
        return BlockTags.create(HexxitGearWeaponry.rl(name));
    }

    public static TagKey<Item> itemTag(String name) {
        return ItemTags.create(HexxitGearWeaponry.rl(name));
    }
}
