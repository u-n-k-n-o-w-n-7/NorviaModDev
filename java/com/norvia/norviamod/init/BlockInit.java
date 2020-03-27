package com.norvia.norviamod.init;

import java.util.ArrayList;
import java.util.List;

import com.norvia.norviamod.blocks.BlockBase;
import com.norvia.norviamod.blocks.ModOres;
import com.norvia.norviamod.blocks.NorviumOre;
import com.norvia.norviamod.blocks.OreBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block NORVIUM_BLOCK = new OreBlocks("norvium_block", Material.IRON);
	public static final Block RUBY_BLOCK = new OreBlocks("ruby_block", Material.IRON);
	public static final Block COPPER_BLOCK = new OreBlocks("copper_block", Material.IRON);
	public static final Block PLATINUM_BLOCK = new OreBlocks("platinum_block", Material.IRON);
	public static final Block TITANIUM_BLOCK = new OreBlocks("titanium_bloc", Material.IRON);
	public static final Block SILVER_BLOCK = new OreBlocks("silver_block", Material.IRON);
	public static final Block COBALT_BLOCK = new OreBlocks("cobalt_block", Material.IRON);
	
	//Ores
	public static final Block NORVIUM_ORE = new NorviumOre("norvium_ore", Material.ROCK);
	public static final Block RUBY_ORE = new ModOres("ruby_ore", Material.ROCK);
	public static final Block COPPER_ORE = new ModOres("copper_ore", Material.ROCK);
	public static final Block PLATINUM_ORE = new NorviumOre("platinum_ore", Material.ROCK);
	public static final Block TITANIUM_ORE = new NorviumOre("titanium_ore", Material.ROCK);
	public static final Block SILVER_ORE = new ModOres("silver_ore", Material.ROCK);
	public static final Block COBALT_ORE = new ModOres("cobalt_ore", Material.ROCK);
}
