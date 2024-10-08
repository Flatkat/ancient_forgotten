package net.flatkat.ancient_forgotten;

import net.fabricmc.api.ModInitializer;

import net.flatkat.ancient_forgotten.block.ModBlocks;
import net.flatkat.ancient_forgotten.item.ModItemGroups;
import net.flatkat.ancient_forgotten.item.ModItems;
import net.flatkat.ancient_forgotten.loot.ModLoot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AncientAndForgotten implements ModInitializer {
	public static final String MOD_ID = "ancient_forgotten";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("ancient_forgotten");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		// LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLoot.init();
	}
}