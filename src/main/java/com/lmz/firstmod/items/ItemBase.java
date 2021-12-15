package com.lmz.firstmod.items;

import com.lmz.firstmod.Application;
import com.lmz.firstmod.init.ModCreativeTab;
import com.lmz.firstmod.init.ModItems;
import com.lmz.firstmod.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModCreativeTab.FIRSTMODCREATIVETAB);
		ModItems.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Application.proxy.registerItemRender(this, 0, "inventory");
	}

}
