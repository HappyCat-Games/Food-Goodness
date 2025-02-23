package games.happycat.foodgoodness.common.registry;

import games.happycat.foodgoodness.FoodGoodnessMod;
import games.happycat.foodgoodness.common.block.entity.StoveBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntityTypes
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, FoodGoodnessMod.MODID);

    public static final Supplier<BlockEntityType<StoveBlockEntity>> STOVE = BLOCK_ENTITY_TYPES.register(
            "stove",
            () -> new BlockEntityType<>(
                    StoveBlockEntity::new,
                    ModBlocks.STOVE.get()
            )
    );
}
