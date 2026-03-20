/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananafruits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bananafruits.block.BananaTreeWoodBlock;
import net.mcreator.bananafruits.block.BananaTreeStairsBlock;
import net.mcreator.bananafruits.block.BananaTreeSlabBlock;
import net.mcreator.bananafruits.block.BananaTreePressurePlateBlock;
import net.mcreator.bananafruits.block.BananaTreePlanksBlock;
import net.mcreator.bananafruits.block.BananaTreeLogBlock;
import net.mcreator.bananafruits.block.BananaTreeLeavesBlock;
import net.mcreator.bananafruits.block.BananaTreeFenceGateBlock;
import net.mcreator.bananafruits.block.BananaTreeFenceBlock;
import net.mcreator.bananafruits.block.BananaTreeButtonBlock;
import net.mcreator.bananafruits.block.BananaPlantSaplingBlock;
import net.mcreator.bananafruits.BananaFruitsMod;

public class BananaFruitsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BananaFruitsMod.MODID);
	public static final RegistryObject<Block> BANANA_TREE_LOG = REGISTRY.register("banana_tree_log", () -> new BananaTreeLogBlock());
	public static final RegistryObject<Block> BANANA_TREE_WOOD = REGISTRY.register("banana_tree_wood", () -> new BananaTreeWoodBlock());
	public static final RegistryObject<Block> BANANA_TREE_PLANKS = REGISTRY.register("banana_tree_planks", () -> new BananaTreePlanksBlock());
	public static final RegistryObject<Block> BANANA_TREE_LEAVES = REGISTRY.register("banana_tree_leaves", () -> new BananaTreeLeavesBlock());
	public static final RegistryObject<Block> BANANA_TREE_STAIRS = REGISTRY.register("banana_tree_stairs", () -> new BananaTreeStairsBlock());
	public static final RegistryObject<Block> BANANA_TREE_SLAB = REGISTRY.register("banana_tree_slab", () -> new BananaTreeSlabBlock());
	public static final RegistryObject<Block> BANANA_TREE_FENCE = REGISTRY.register("banana_tree_fence", () -> new BananaTreeFenceBlock());
	public static final RegistryObject<Block> BANANA_TREE_FENCE_GATE = REGISTRY.register("banana_tree_fence_gate", () -> new BananaTreeFenceGateBlock());
	public static final RegistryObject<Block> BANANA_TREE_PRESSURE_PLATE = REGISTRY.register("banana_tree_pressure_plate", () -> new BananaTreePressurePlateBlock());
	public static final RegistryObject<Block> BANANA_TREE_BUTTON = REGISTRY.register("banana_tree_button", () -> new BananaTreeButtonBlock());
	public static final RegistryObject<Block> BANANA_PLANT_SAPLING = REGISTRY.register("banana_plant_sapling", () -> new BananaPlantSaplingBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}