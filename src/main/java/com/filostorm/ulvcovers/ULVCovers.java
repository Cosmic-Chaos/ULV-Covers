package com.filostorm.ulvcovers;

import com.filostorm.ulvcovers.covers.CoverBehaviors;
import com.filostorm.ulvcovers.items.ULVCoverMetaItems;
import com.filostorm.ulvcovers.recipes.ULVCoverRecipes;
import com.filostorm.ulvcovers.proxy.CommonProxy;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.Logger;

import gregtech.api.GregTechAPI.RegisterEvent;
import gregtech.api.cover.CoverDefinition;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@Mod.EventBusSubscriber
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
    }

    public void Init(FMLInitializationEvent event)
    {
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        logger.info("Registering recipes for ULV Components");
        ULVCoverRecipes.init();
    }

	public static class RegistrationHandler {
        @SubscribeEvent
		public static void coverRegistry(RegisterEvent<CoverDefinition> event) {
            logger.info("Registering covers for ULV Covers.");
            CoverBehaviors.init();
		}
	}
}
