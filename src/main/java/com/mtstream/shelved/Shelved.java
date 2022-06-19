package com.mtstream.shelved;

import com.mtstream.shelved.init.BlockInit;
import com.mtstream.shelved.init.FeatureInit;
//import com.mtstream.shelved.init.ItemInit;

//import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class Shelved implements ModInitializer {
	public static final String MOD_ID = "shelved";

	public void onInitialize(ModContainer mod) {
		//ItemInit.ITEMS.register(bus);
		BlockInit.register();
		FeatureInit.register();
	}
}
