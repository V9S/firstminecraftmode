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

	@SubscribeEvent // ��ע�⸺����������¼�,����㴫��Ĳ�������Event���͵�MC�¼�,��Ҫ�������ע��
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		System.out.println(ModItems.ITEMS.toArray(new Item[0]));
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
		
		/*
		 * ͨ��RegistryEvent.Register<T>ע�᷽��,ÿ�����д�ķ��鶼Ҫͨ�����ַ�ʽע��
		 * 
		 * event.getRegistry().register(new MySpecialBlock().setRegistryName(MOD_ID,
		 * "mySpecialBlock")); setRegistryName () ������Ʒ��ע����,Ҳ�Ǳ��ػ���
		 * 
		 * Register<T>����10�ַ������Ͳ����� <Item>,<Block>,<Potion>(ҩˮ) ,<Biome> (����Ⱥϵ) ,
		 * <SoundEvent>(�����¼�) , <PotionType> (ҩˮ����) , <Enchantment> (��ħ) ,
		 * <VillagerProfession> (����ְҵ) , <EntityEntry> (ʵ��) , <IRecipe> (�ϳɱ�) .
		 * �������ForgeRegistries���п�����Щ���Ͳ���,Ҳ���Բ�ʹ�÷��Ͳ���,ֱ���� RegisterEvent���������¼�
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
