package com.lmz.firstmod.init;

import java.util.ArrayList;
import java.util.List;

import com.lmz.firstmod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block TESTBLOCK = new BlockBase("testblock",Material.WOOD);
}
