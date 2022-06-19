package com.mtstream.shelved.init;

import com.mtstream.shelved.Shelved;
import com.mtstream.shelved.block.PlacedAppleBlock;
import com.mtstream.shelved.block.PlacedNautilusShellBlock;
import com.mtstream.shelved.block.PlacedNetherStarBlock;

import net.minecraft.core.Registry;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockInit {
	/*
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Shelved.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;

	public static final RegistryObject<Block> PLACED_NAUTILUS_SHELL = register("nautilus_shell_block",
			() -> new PlacedNautilusShellBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).dynamicShape(), Items.NAUTILUS_SHELL),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	public static final RegistryObject<Block> PLACED_APPLE = register("apple_block",
			() -> new PlacedAppleBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).dynamicShape(), Items.APPLE),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	public static final RegistryObject<Block> PLACED_GOLDEN_APPLE = register("golden_apple_block",
			() -> new PlacedAppleBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).dynamicShape(), Items.GOLDEN_APPLE),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	public static final RegistryObject<Block> PLACED_ENCHANTED_GOLDEN_APPLE = register("enchanted_golden_apple_block",
			() -> new PlacedAppleBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).dynamicShape(), Items.ENCHANTED_GOLDEN_APPLE),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));
	public static final RegistryObject<Block> PLACED_NETHER_STAR = register("nether_star_block",
			() -> new PlacedNetherStarBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).dynamicShape().noCollission().emissiveRendering((s,l,p)->true).lightLevel(s->5), Items.NETHER_STAR),
			object -> () -> new BlockItem(object.get(), new Item.Properties()));


	public static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> sup){
		return BLOCKS.register(name, sup);
	}
	public static <T extends Block> RegistryObject<T> register(final String name,final Supplier<? extends T> sup,
		Function<RegistryObject<T>, Supplier<? extends Item>> item){
		RegistryObject<T> obj = registerBlock(name, sup);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
	*/
	//none

	public static final Block PLACED_NAUTILUS_SHELL= new PlacedNautilusShellBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).dynamicShape(), Items.NAUTILUS_SHELL);
	public static final Block PLACED_APPLE= new PlacedAppleBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).dynamicShape(), Items.APPLE);
	public static final Block PLACED_GOLDEN_APPLE= new PlacedAppleBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).dynamicShape(), Items.GOLDEN_APPLE);
	public static final Block PLACED_ENCHANTED_GOLDEN_APPLE= new PlacedAppleBlock(BlockBehaviour.Properties.copy(Blocks.MUSHROOM_STEM).dynamicShape(), Items.ENCHANTED_GOLDEN_APPLE);
	public static final Block PLACED_NETHER_STAR= new PlacedNetherStarBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).dynamicShape().noCollission().emissiveRendering((s,l,p)->true).lightLevel(s->5), Items.NETHER_STAR);

	private static void registerBlock(String id, Block block) {
		Registry.register(Registry.BLOCK, Shelved.MOD_ID + ":" + id, block);
	}

	public static void register() {
		registerBlock("nautilus_shell_block", PLACED_NAUTILUS_SHELL);
		registerBlock("apple_block", PLACED_APPLE);
		registerBlock("golden_apple_block", PLACED_GOLDEN_APPLE);
		registerBlock("enchanted_golden_apple_block", PLACED_ENCHANTED_GOLDEN_APPLE);
		registerBlock("nether_star_block", PLACED_NETHER_STAR);
	}
}
