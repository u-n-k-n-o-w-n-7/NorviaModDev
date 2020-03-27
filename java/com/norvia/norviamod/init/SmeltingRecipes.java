package com.norvia.norviamod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
	public static void init()
	{
		//Ores
		GameRegistry.addSmelting(BlockInit.NORVIUM_ORE, new ItemStack(ItemInit.NORVIUM_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.COBALT_ORE, new ItemStack(ItemInit.COBALT_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.COPPER_ORE, new ItemStack(ItemInit.COPPER_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.PLATINUM_ORE, new ItemStack(ItemInit.PLATINUM_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.TITANIUM_ORE, new ItemStack(ItemInit.TITANIUM_INGOT, 1), 1.5f);
		GameRegistry.addSmelting(BlockInit.SILVER_ORE, new ItemStack(ItemInit.SILVER_INGOT, 1), 1.5f);
	}
}
