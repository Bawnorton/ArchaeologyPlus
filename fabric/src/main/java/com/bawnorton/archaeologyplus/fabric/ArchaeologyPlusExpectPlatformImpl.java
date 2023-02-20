package com.bawnorton.archaeologyplus.fabric;

import com.bawnorton.archaeologyplus.ArchaeologyPlusExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class ArchaeologyPlusExpectPlatformImpl {
    /**
     * This is our actual method to {@link ArchaeologyPlusExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
