package com.filostorm.ulvcovers.config;

import com.filostorm.ulvcovers.ULVCovers;

import net.minecraftforge.common.config.Config;

@Config(modid = ULVCovers.MODID)
public class ULVCoversConfig {

    @Config.Comment("Disable all recipes?")
    public static boolean disableRecipes = false;
    @Config.Comment("Easy Recipes? (2x2 crafting)")
    public static boolean easyRecipes = false;


}
