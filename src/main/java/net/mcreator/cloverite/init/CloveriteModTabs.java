/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cloverite.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.cloverite.CloveriteMod;

@EventBusSubscriber
public class CloveriteModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CloveriteMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATE_TAB_CLOVERITE = REGISTRY.register("create_tab_cloverite",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.cloverite.create_tab_cloverite")).icon(() -> new ItemStack(CloveriteModItems.FOUR_LEAF_CRYSTAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_HELMET.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_CHESTPLATE.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_LEGGINGS.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_BOOTS.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_HELMET.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_CHESTPLATE.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_LEGGINGS.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_BOOTS.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_SWORD.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_SWORD.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_PICKAXE.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_PICKAXE.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_AXE.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_AXE.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_SHOVEL.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_SHOVEL.get());
				tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_HOE.get());
				tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_HOE.get());
				tabData.accept(CloveriteModBlocks.CLOVER.get().asItem());
				tabData.accept(CloveriteModBlocks.CLOVERITE_2.get().asItem());
				tabData.accept(CloveriteModBlocks.CLOVERITE.get().asItem());
				tabData.accept(CloveriteModBlocks.FOUR_LEAF_CRYSTAL_CHIP.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_UPGRADE_SMITHING_TEMPLATE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CloveriteModBlocks.FOUR_LEAF_CRYSTAL_CHIP.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_PICKAXE.get());
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_AXE.get());
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_SHOVEL.get());
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_HOE.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_PICKAXE.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_AXE.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_SHOVEL.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CloveriteModBlocks.CLOVER.get().asItem());
			tabData.accept(CloveriteModBlocks.CLOVERITE_2.get().asItem());
			tabData.accept(CloveriteModBlocks.CLOVERITE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_SWORD.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_SWORD.get());
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_HELMET.get());
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_CHESTPLATE.get());
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_LEGGINGS.get());
			tabData.accept(CloveriteModItems.FOUR_LEAF_CRYSTAL_ARMOR_BOOTS.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_HELMET.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_CHESTPLATE.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_LEGGINGS.get());
			tabData.accept(CloveriteModItems.DIAMOND_FOUR_LEAF_CRYSTAL_ARMOR_BOOTS.get());
		}
	}
}