/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananafruits.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.bananafruits.BananaFruitsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BananaFruitsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BananaFruitsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(BananaFruitsModItems.BANANA.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BananaFruitsModItems.BANANA_PEEL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_LOG.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_WOOD.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_PLANKS.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_STAIRS.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_SLAB.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_FENCE.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_FENCE_GATE.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_PRESSURE_PLATE.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(BananaFruitsModBlocks.BANANA_TREE_LEAVES.get().asItem());
			tabData.accept(BananaFruitsModBlocks.BANANA_PLANT_SAPLING.get().asItem());
		}
	}
}