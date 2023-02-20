package com.bawnorton.archaeologyplus.forge;

import com.bawnorton.archaeologyplus.ArchaeologyPlusExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ArchaeologyPlusExpectPlatformImpl {
    /**
     * This is our actual method to {@link ArchaeologyPlusExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
