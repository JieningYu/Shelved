package com.mtstream.shelved;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;

import com.mtstream.shelved.event.ClientSetupEvt;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class ShelvedClient implements ClientModInitializer{

	@Override
	public void onInitializeClient(ModContainer mod) {
		ClientSetupEvt.ClientEventBusSubscriber.clientSetup();
	}

}
