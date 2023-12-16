package net.nektarios.snw_tweaks.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SNW_TWEAKS_TAB = new CreativeModeTab("snwtweakstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRASS_FLIGHT_CORE.get());
        }
    };
}
