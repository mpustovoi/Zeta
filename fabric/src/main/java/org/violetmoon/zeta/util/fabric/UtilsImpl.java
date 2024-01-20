package org.violetmoon.zeta.util.fabric;

import net.fabricmc.loader.api.FabricLoader;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Path;

public class UtilsImpl {
    public static boolean isModLoaded(String id, @Nullable String fabricId) {
        return FabricLoader.getInstance().isModLoaded(fabricId != null ? fabricId : id);
    }

    public static Path configDir() {
        return FabricLoader.getInstance().getConfigDir();
    }

    public static Path modsDir() {
        return FabricLoader.getInstance().getGameDir().resolve("mods");
    }

    public static boolean isDevEnv() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }
}
