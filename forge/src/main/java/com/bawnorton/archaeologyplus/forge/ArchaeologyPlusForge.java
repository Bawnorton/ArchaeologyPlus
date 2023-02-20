package com.bawnorton.archaeologyplus.forge;

import dev.architectury.platform.forge.EventBuses;
import com.bawnorton.archaeologyplus.ArchaeologyPlus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ArchaeologyPlus.MOD_ID)
public class ArchaeologyPlusForge {
    public ArchaeologyPlusForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ArchaeologyPlus.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ArchaeologyPlus.init();
    }
}
