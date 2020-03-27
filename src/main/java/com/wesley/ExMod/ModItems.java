package com.wesley.ExMod;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    //The ITEMS deferred register in which you can register items.
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExMod.MOD_ID);

    //Register the tutorial dust with "tutorial_dust" as registry name and default properties
    public static final RegistryObject<Item> TUTORIAL_DUST = ITEMS.register("tutorial_dust", () -> new Item(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC)));
    
    public static final RegistryObject<Item> TUTORIAL_BLOCK = ITEMS.register("tutorial_block", () -> new BlockItem(ModBlocks.TUTORIAL_BLOCK.get(), new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));
}
