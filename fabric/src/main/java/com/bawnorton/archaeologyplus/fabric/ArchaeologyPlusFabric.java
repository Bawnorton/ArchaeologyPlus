package com.bawnorton.archaeologyplus.fabric;

import com.bawnorton.archaeologyplus.ArchaeologyPlus;
import net.fabricmc.api.ModInitializer;

public class ArchaeologyPlusFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ArchaeologyPlus.init();
    }
}
