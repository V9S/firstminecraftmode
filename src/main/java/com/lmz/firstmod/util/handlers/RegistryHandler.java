package com.lmz.firstmod.util.handlers;

import com.lmz.firstmod.init.ModBlocks;
import com.lmz.firstmod.init.ModItems;
import com.lmz.firstmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent // 该注解负责监听各种事件,如果你传入的参数里有Event类型的MC事件,需要加上这个注解
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		System.out.println(ModItems.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
		/*
		 * 通过RegistryEvent.Register<T>注册方块,每个你编写的方块都要通过这种方式注册
		 * 
		 * event.getRegistry().register(new MySpecialBlock().setRegistryName(MOD_ID,
		 * "mySpecialBlock")); setRegistryName () 设置物品的注册名,也是本地化名
		 * 
		 * Register<T>具有10种泛型类型参数： <Item>,<Block>,<Potion>(药水) ,<Biome> (生物群系) ,
		 * <SoundEvent>(声音事件) , <PotionType> (药水类型) , <Enchantment> (附魔) ,
		 * <VillagerProfession> (村民职业) , <EntityEntry> (实体) , <IRecipe> (合成表) .
		 * 你可以在ForgeRegistries类中看到这些泛型参数,也可以不使用泛型参数,直接用 RegisterEvent监听所有事件
		 */

	}

	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		System.out.println(ModBlocks.BLOCKS.toArray());
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		
	}
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for (Item item : ModItems.ITEMS) {
			if (item instanceof IHasModel) {
				((IHasModel) item).registerModels();
			}
		}
		
		for (Block block : ModBlocks.BLOCKS) {
			if (block instanceof IHasModel) {
				((IHasModel) block).registerModels();
			}
		}
	}
}
