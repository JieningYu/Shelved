package com.mtstream.shelved.event;

import com.mtstream.shelved.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class ClientSetupEvt {
	public class ClientEventBusSubscriber {
		public static void clientSetup() {
			/*
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PLACED_NETHER_STAR, RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PLACED_APPLE, RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PLACED_GOLDEN_APPLE, RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(BlockInit.PLACED_ENCHANTED_GOLDEN_APPLE, RenderType.cutout());
			*/
			BlockRenderLayerMap.put(RenderType.translucent(), BlockInit.PLACED_NETHER_STAR);
			BlockRenderLayerMap.put(RenderType.cutout(), BlockInit.PLACED_APPLE);
			BlockRenderLayerMap.put(RenderType.cutout(), BlockInit.PLACED_GOLDEN_APPLE);
			BlockRenderLayerMap.put(RenderType.cutout(), BlockInit.PLACED_ENCHANTED_GOLDEN_APPLE);
		}
	}
}
