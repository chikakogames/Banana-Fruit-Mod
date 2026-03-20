/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bananafruits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.bananafruits.entity.BananaPellProjectileEntity;
import net.mcreator.bananafruits.BananaFruitsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BananaFruitsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BananaFruitsMod.MODID);
	public static final RegistryObject<EntityType<BananaPellProjectileEntity>> BANANA_PELL_PROJECTILE = register("banana_pell_projectile", EntityType.Builder.<BananaPellProjectileEntity>of(BananaPellProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BananaPellProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}