package games.happycat.foodgoodness.common.registry;

import com.google.common.collect.Sets;
import games.happycat.foodgoodness.FoodGoodnessMod;
import games.happycat.foodgoodness.common.FoodValues;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.LinkedHashSet;
import java.util.function.Function;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FoodGoodnessMod.MODID);
    public static LinkedHashSet<DeferredItem<? extends Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

    public static DeferredItem<Item> registerItemWithTab(final String name,
                                                         Function<Item.Properties, Item> item,
                                                         Item.Properties properties)
    {
        DeferredItem<Item> block = ITEMS.registerItem(name, item, properties);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }

    public static DeferredItem<BlockItem> registerBlockWithTab(final String name,
                                                               DeferredBlock<Block> block,
                                                               Item.Properties properties)
    {
        DeferredItem<BlockItem> blockItem = ITEMS.registerSimpleBlockItem(name, block, properties);
        CREATIVE_TAB_ITEMS.add(blockItem);
        return blockItem;
    }

    public static Item.Properties basicItem()
    {
        return new Item.Properties();
    }

    public static Item.Properties foodItem(FoodProperties food)
    {
        return new Item.Properties().food(food);
    }

    // Workstations
    public static final DeferredItem<BlockItem> STOVE = registerBlockWithTab("stove",
            ModBlocks.STOVE,
            basicItem());

    // Food
    public static final DeferredItem<Item> BLONDIE = registerItemWithTab("blondie",
            Item::new,
            foodItem(FoodValues.BLONDIE));
}
