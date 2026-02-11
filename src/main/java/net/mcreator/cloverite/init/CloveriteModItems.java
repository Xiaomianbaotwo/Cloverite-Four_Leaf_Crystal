/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cloverite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cloverite.item.*;
import net.mcreator.cloverite.CloveriteMod;

public class CloveriteModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CloveriteMod.MODID);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL = REGISTRY.register("four_leaf_crystal", FourLeafCrystalItem::new);
	public static final DeferredItem<Item> CLOVERITE = block(CloveriteModBlocks.CLOVERITE);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_CHIP = block(CloveriteModBlocks.FOUR_LEAF_CRYSTAL_CHIP);
	public static final DeferredItem<Item> CLOVERITE_2 = block(CloveriteModBlocks.CLOVERITE_2);
	public static final DeferredItem<Item> CLOVER = block(CloveriteModBlocks.CLOVER);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_SWORD = REGISTRY.register("four_leaf_crystal_sword", FourLeafCrystalSwordItem::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_PICKAXE = REGISTRY.register("four_leaf_crystal_pickaxe", FourLeafCrystalPickaxeItem::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_AXE = REGISTRY.register("four_leaf_crystal_axe", FourLeafCrystalAxeItem::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_SHOVEL = REGISTRY.register("four_leaf_crystal_shovel", FourLeafCrystalShovelItem::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_HOE = REGISTRY.register("four_leaf_crystal_hoe", FourLeafCrystalHoeItem::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_ARMOR_HELMET = REGISTRY.register("four_leaf_crystal_armor_helmet", FourLeafCrystalArmorItem.Helmet::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_ARMOR_CHESTPLATE = REGISTRY.register("four_leaf_crystal_armor_chestplate", FourLeafCrystalArmorItem.Chestplate::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_ARMOR_LEGGINGS = REGISTRY.register("four_leaf_crystal_armor_leggings", FourLeafCrystalArmorItem.Leggings::new);
	public static final DeferredItem<Item> FOUR_LEAF_CRYSTAL_ARMOR_BOOTS = REGISTRY.register("four_leaf_crystal_armor_boots", FourLeafCrystalArmorItem.Boots::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL = REGISTRY.register("diamond_four_leaf_crystal", DiamondFourLeafCrystalItem::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_UPGRADE_SMITHING_TEMPLATE = REGISTRY.register("diamond_four_leaf_crystal_upgrade_smithing_template", DiamondFourLeafCrystalUpgradeSmithingTemplateItem::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_HELMET = REGISTRY.register("diamond_four_leaf_crystal_armor_helmet", DiamondFourLeafCrystalArmorItem.Helmet::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_CHESTPLATE = REGISTRY.register("diamond_four_leaf_crystal_armor_chestplate", DiamondFourLeafCrystalArmorItem.Chestplate::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_LEGGINGS = REGISTRY.register("diamond_four_leaf_crystal_armor_leggings", DiamondFourLeafCrystalArmorItem.Leggings::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_BOOTS = REGISTRY.register("diamond_four_leaf_crystal_armor_boots", DiamondFourLeafCrystalArmorItem.Boots::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_SWORD = REGISTRY.register("diamond_four_leaf_crystal_sword", DiamondFourLeafCrystalSwordItem::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_PICKAXE = REGISTRY.register("diamond_four_leaf_crystal_pickaxe", DiamondFourLeafCrystalPickaxeItem::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_AXE = REGISTRY.register("diamond_four_leaf_crystal_axe", DiamondFourLeafCrystalAxeItem::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_SHOVEL = REGISTRY.register("diamond_four_leaf_crystal_shovel", DiamondFourLeafCrystalShovelItem::new);
	public static final DeferredItem<Item> DIAMOND_FOUR_LEAF_CRYSTAL_HOE = REGISTRY.register("diamond_four_leaf_crystal_hoe", DiamondFourLeafCrystalHoeItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}