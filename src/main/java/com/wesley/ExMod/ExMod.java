package com.wesley.ExMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExMod.MOD_ID)
public class ExMod {
	public static final String MOD_ID = "exmod";
	
	public ExMod () {
		ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
}
