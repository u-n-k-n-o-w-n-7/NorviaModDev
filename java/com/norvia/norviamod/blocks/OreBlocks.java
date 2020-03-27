package com.norvia.norviamod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OreBlocks extends BlockBase
{

	public OreBlocks(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
	}

}
