package com.lmz.firstmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCreativeTab extends CreativeTabs {

	public static final ModCreativeTab FIRSTMODCREATIVETAB = new ModCreativeTab("mytab");

	public ModCreativeTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.IRON_AXE);
	}

}
