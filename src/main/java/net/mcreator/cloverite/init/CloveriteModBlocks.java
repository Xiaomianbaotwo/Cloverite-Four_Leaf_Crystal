/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cloverite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.cloverite.block.FourLeafCrystalChipBlock;
import net.mcreator.cloverite.block.CloveriteBlock;
import net.mcreator.cloverite.block.Cloverite2Block;
import net.mcreator.cloverite.block.CloverBlock;
import net.mcreator.cloverite.CloveriteMod;

public class CloveriteModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CloveriteMod.MODID);
	public static final DeferredBlock<Block> CLOVERITE;
	public static final DeferredBlock<Block> FOUR_LEAF_CRYSTAL_CHIP;
	public static final DeferredBlock<Block> CLOVERITE_2;
	public static final DeferredBlock<Block> CLOVER;
	static {
		CLOVERITE = REGISTRY.register("cloverite", CloveriteBlock::new);
		FOUR_LEAF_CRYSTAL_CHIP = REGISTRY.register("four_leaf_crystal_chip", FourLeafCrystalChipBlock::new);
		CLOVERITE_2 = REGISTRY.register("cloverite_2", Cloverite2Block::new);
		CLOVER = REGISTRY.register("clover", CloverBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}