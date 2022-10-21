package fr.burstyx.burstyxm.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BURSYX_TAB = new CreativeModeTab("burstyxtab") {
        @Override
        public net.minecraft.world.item.ItemStack makeIcon() {
            return new ItemStack(ModItems.ZIRCON.get());
        };
    };

}
