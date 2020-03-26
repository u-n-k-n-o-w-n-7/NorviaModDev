package com.norvia.norviamod.tabs;

import com.norvia.norviamod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NorviaModTab extends CreativeTabs
{
	public NorviaModTab(String label ) { super("norviamodtab");
	this.setBackgroundImageName("norviamod.png");
	}
	
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.NORVIUM_INGOT);
	}
}
