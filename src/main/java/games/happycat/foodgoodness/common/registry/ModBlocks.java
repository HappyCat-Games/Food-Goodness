package games.happycat.foodgoodness.common.registry;

import games.happycat.foodgoodness.FoodGoodnessMod;
import games.happycat.foodgoodness.common.block.StoveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(FoodGoodnessMod.MODID);

    // Workstations
    public static final DeferredBlock<Block> STOVE = BLOCKS.registerBlock("stove",
            StoveBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).lightLevel(state -> 13));
}
