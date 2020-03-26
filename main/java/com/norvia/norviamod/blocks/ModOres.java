package com.norvia.norviamod.blocks;

import com.norvia.norviamod.init.ItemInit;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ModOres extends BlockBase 
{

	public ModOres(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setHarvestLevel("pickaxe", 2);
		setResistance(15.0f);
	}
	
}
