package games.happycat.foodgoodness.common.registry;

import games.happycat.foodgoodness.FoodGoodnessMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            FoodGoodnessMod.MODID);

    public static final Supplier<CreativeModeTab> TAB_FOOD_GOODNESS = CREATIVE_TABS.register(FoodGoodnessMod.MODID,
            () -> CreativeModeTab.builder()
                                 .title(
                                         Component.translatable("itemGroup.foodgoodness"))
                                 .icon(() -> new ItemStack(ModItems.BLONDIE.get()))
                                 .displayItems(((itemDisplayParameters, output) -> ModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept(
                                         item.get()))))
                                 .build());
}
