package com.lmz.firstmod.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class FirstMaterial extends Material {

	public static final Material FIRSTMATERIAL = new FirstMaterial(MapColor.GRAY);
	public FirstMaterial(MapColor color) {
		super(color);
	}

}
