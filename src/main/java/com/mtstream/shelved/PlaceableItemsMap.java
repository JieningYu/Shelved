package com.mtstream.shelved;

import com.mtstream.shelved.init.BlockInit;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class PlaceableItemsMap {
	public static Object2ObjectArrayMap<Item, Block> map = new Object2ObjectArrayMap<>();
	public static Block getBlock(Item item) {
		map.put(Items.NAUTILUS_SHELL, BlockInit.PLACED_NAUTILUS_SHELL);
		map.put(Items.NETHER_STAR, BlockInit.PLACED_NETHER_STAR);
		map.put(Items.APPLE, BlockInit.PLACED_APPLE);
		map.put(Items.GOLDEN_APPLE, BlockInit.PLACED_GOLDEN_APPLE);
		map.put(Items.ENCHANTED_GOLDEN_APPLE, BlockInit.PLACED_ENCHANTED_GOLDEN_APPLE);
		return map.get(item);
	}
}
