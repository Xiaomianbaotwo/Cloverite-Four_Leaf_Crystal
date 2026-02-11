package net.mcreator.cloverite.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class FourLeafCrystalItem extends Item {
	public FourLeafCrystalItem() {
		super(new Item.Properties());
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}