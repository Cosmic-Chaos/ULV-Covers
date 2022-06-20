package com.filostorm.ulvcovers;

import com.filostorm.ulvcovers.covers.CoverBehaviors;
import com.filostorm.ulvcovers.items.ULVCoverMetaItems;
import com.filostorm.ulvcovers.init.ULVCoverRecipes;
import com.filostorm.ulvcovers.proxy.CommonProxy;

import org.apache.logging.log4j.Logger;

import gregtech.api.GregTechAPI.RegisterEvent;
import gregtech.api.cover.CoverDefinition;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = ULVCovers.MODID, name = ULVCovers.NAME, version = ULVCovers.VERSION, dependencies = "required-after:gregtech@[2.0.0-beta,);")
public class ULVCovers
{
    public static final String MODID = "ulv_covers";
    public static final String NAME = "ULV Covers";
    public static final String VERSION = "0.1.0";

    private static Logger logger;

    @SidedProxy(modId = ULVCovers.MODID, clientSide = "com.filostorm.ulvcovers.proxy.ClientProxy", serverSide = "com.filostorm.ulvcovers.proxy.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("Registering items for ULV Covers");
        ULVCoverMetaItems.init();

        logger.info("Registering recipes for ULV Covers");
        ULVCoverRecipes.init();
    }

    @Mod.EventBusSubscriber
	public static class RegistrationHandler {
        @SubscribeEvent
		public static void coverRegistry(RegisterEvent<CoverDefinition> event) {
            logger.info("Registering covers for ULV Covers.");
            CoverBehaviors.init();
		}
	}
}
