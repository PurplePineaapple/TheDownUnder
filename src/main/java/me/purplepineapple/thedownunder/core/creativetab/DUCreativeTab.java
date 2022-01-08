package me.purplepineapple.thedownunder.core.creativetab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class DUCreativeTab extends CreativeModeTab {
    public static final CreativeModeTab DOWN_UNDER = new DUCreativeTab("downunder");
    public DUCreativeTab(String label) {
        super(label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.IRON_PICKAXE);
    }
}
