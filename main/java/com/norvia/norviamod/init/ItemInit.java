package com.norvia.norviamod.init;

import java.util.ArrayList;
import java.util.List;

import com.norvia.norviamod.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Items
	public static final Item RUBY_STICK = new ItemBase("ruby_stick");
	public static final Item JIGSAW = new ItemBase("jigsaw");
	
	//Ores
	public static final Item NORVIUM_INGOT = new ItemBase("norvium_ingot");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");
	public static final Item PLATINUM_INGOT = new ItemBase("platinum_ingot");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
}