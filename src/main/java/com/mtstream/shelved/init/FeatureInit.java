package com.mtstream.shelved.init;

import com.mtstream.shelved.Shelved;
import com.mtstream.shelved.feature.AppleFeature;
import com.mtstream.shelved.feature.NautilusShellFeature;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;

public class FeatureInit {
	public static final AppleFeature APPLE = new AppleFeature(NoneFeatureConfiguration.CODEC);
	public static final NautilusShellFeature NAUTILUS_SHELL = new NautilusShellFeature(ProbabilityFeatureConfiguration.CODEC);

	private static String featureId(String id) {
		return Shelved.MOD_ID + ":" + id;
	}
	public static void register() {

		Registry.register(Registry.FEATURE, featureId("apple_feature"), APPLE);
		Registry.register(Registry.FEATURE, featureId("nautilus_shell_feature"), NAUTILUS_SHELL);
	}
}
