package com.mtstream.shelved.gen;

import java.util.List;

import org.quiltmc.qsl.worldgen.biome.api.BiomeModifications;
import org.quiltmc.qsl.worldgen.biome.api.BiomeSelectors;

import com.mtstream.shelved.init.FeatureInit;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
//import net.minecraftforge.event.world.BiomeLoadingEvent;

public class AllGen {
	public static void gen(){
		//BiomeLoadingEvent evt
		/*
		List<Holder<PlacedFeature>> vegBase = evt.getGeneration().getFeatures(Decoration.VEGETAL_DECORATION);
		List<Holder<PlacedFeature>> undBase = evt.getGeneration().getFeatures(Decoration.UNDERGROUND_DECORATION);
		vegBase.add(PlacedFeatures.APPLE_PLACED);
		undBase.add(PlacedFeatures.NAUTILUS_SHELL_PLACED);
		*/
		BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Decoration.VEGETAL_DECORATION, FeatureInit.APPLE);
	}
}
