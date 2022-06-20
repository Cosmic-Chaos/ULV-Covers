package com.filostorm.ulvcovers.config;

import com.filostorm.ulvcovers.ULVCovers;

import net.minecraftforge.common.config.Config;

@Config(modid = ULVCovers.MODID)
public class ULVCoversConfig {
    
    @Config.Comment("The fuel type for the rocket boots.")
    @Config.Name("Rocket Boots Fuel")
    @Config.RequiresMcRestart
    public static String fueltype = "methane";

}
