package com.lmz.firstmod.blocks;

import com.lmz.firstmod.Application;
import com.lmz.firstmod.init.ModBlocks;
import com.lmz.firstmod.init.ModCreativeTab;
import com.lmz.firstmod.init.ModItems;
import com.lmz.firstmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material blockMaterialIn) {
		super(blockMaterialIn);

		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModCreativeTab.FIRSTMODCREATIVETAB);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Application.proxy.registerItemRender(Item.getItemFromBlock(this), 0, "inventory");
	}

}
