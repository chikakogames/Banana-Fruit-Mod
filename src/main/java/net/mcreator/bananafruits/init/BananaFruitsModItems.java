/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananafruits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bananafruits.item.BananaPeelItem;
import net.mcreator.bananafruits.item.BananaItem;
import net.mcreator.bananafruits.BananaFruitsMod;

public class BananaFruitsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BananaFruitsMod.MODID);
	public static final RegistryObject<Item> BANANA = REGISTRY.register("banana", () -> new BananaItem());
	public static final RegistryObject<Item> BANANA_PEEL = REGISTRY.register("banana_peel", () -> new BananaPeelItem());
	public static final RegistryObject<Item> BANANA_TREE_LOG = block(BananaFruitsModBlocks.BANANA_TREE_LOG);
	public static final RegistryObject<Item> BANANA_TREE_WOOD = block(BananaFruitsModBlocks.BANANA_TREE_WOOD);
	public static final RegistryObject<Item> BANANA_TREE_PLANKS = block(BananaFruitsModBlocks.BANANA_TREE_PLANKS);
	public static final RegistryObject<Item> BANANA_TREE_LEAVES = block(BananaFruitsModBlocks.BANANA_TREE_LEAVES);
	public static final RegistryObject<Item> BANANA_TREE_STAIRS = block(BananaFruitsModBlocks.BANANA_TREE_STAIRS);
	public static final RegistryObject<Item> BANANA_TREE_SLAB = block(BananaFruitsModBlocks.BANANA_TREE_SLAB);
	public static final RegistryObject<Item> BANANA_TREE_FENCE = block(BananaFruitsModBlocks.BANANA_TREE_FENCE);
	public static final RegistryObject<Item> BANANA_TREE_FENCE_GATE = block(BananaFruitsModBlocks.BANANA_TREE_FENCE_GATE);
	public static final RegistryObject<Item> BANANA_TREE_PRESSURE_PLATE = block(BananaFruitsModBlocks.BANANA_TREE_PRESSURE_PLATE);
	public static final RegistryObject<Item> BANANA_TREE_BUTTON = block(BananaFruitsModBlocks.BANANA_TREE_BUTTON);
	public static final RegistryObject<Item> BANANA_PLANT_SAPLING = block(BananaFruitsModBlocks.BANANA_PLANT_SAPLING);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}