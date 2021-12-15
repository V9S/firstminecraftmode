package com.lmz.firstmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static final ItemStack ROSE_RED = new ItemStack(Items.DYE, 2, 10);

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.TESTBLOCK, ROSE_RED, 0.3f);

		GameRegistry.addSmelting(ROSE_RED, new ItemStack(Blocks.CAKE, 5), 0.3f);
		GameRegistry.addSmelting(Blocks.CAKE, ROSE_RED, 0.3f);
//		GameRegistry.addSmelting(Blocks.WOOL, ROSE_RED, 0.3f);
		GameRegistry.addSmelting(Blocks.WOOL, new ItemStack(ModBlocks.TESTBLOCK, 3), 0.3f);
		
	}
}
