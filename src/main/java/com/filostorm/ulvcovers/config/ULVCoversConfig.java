package com.filostorm.ulvcovers.config;

import com.filostorm.ulvcovers.ULVCovers;

import net.minecraftforge.common.config.Config;

@Config(modid = ULVCovers.MODID)
public class ULVCoversConfig {
    @Config.Comment("Theme ULV Parts as Steam Parts. Options: true (Steam Parts), false (ULV Parts). Default: false")
    @Config.RequiresMcRestart
    public static Boolean steamTheme = false;

    @Config.Comment("Recipe Type. Options: none (no generated recipes), easy (2x2 crafting), normal (3x3 crafting). Default: normal")
    @Config.RequiresMcRestart
    public static String recipeType = "normal";


}
