package games.happycat.foodgoodness.common.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import static games.happycat.foodgoodness.common.registry.ModBlockEntityTypes.STOVE;

public class StoveBlockEntity extends BlockEntity
{
    public StoveBlockEntity(BlockPos pos,
                            BlockState blockState)
    {
        super(STOVE.get(), pos, blockState);
    }
}
