package com.mattams.mattamsmod.base;

import com.mattams.mattamsmod.brass.item.BrassItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MattamsModTab {
    public static final CreativeModeTab MATTAMS_TAB = new CreativeModeTab("mattamstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BrassItems.BRASS_INGOT.get());
        }
    };
}
