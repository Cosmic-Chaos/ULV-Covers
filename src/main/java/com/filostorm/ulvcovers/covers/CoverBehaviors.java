package com.filostorm.ulvcovers.covers;

import java.util.function.BiFunction;

import com.filostorm.ulvcovers.ULVCovers;
import com.filostorm.ulvcovers.items.ULVCoverMetaItems;

import gregtech.api.GTValues;
import gregtech.api.GregTechAPI;
import gregtech.api.cover.CoverBehavior;
import gregtech.api.cover.CoverDefinition;
import gregtech.api.cover.ICoverable;
import gregtech.api.items.metaitem.MetaItem.MetaValueItem;
import gregtech.common.covers.CoverConveyor;
import gregtech.common.covers.CoverPump;
import gregtech.common.items.behaviors.CoverPlaceBehavior;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class CoverBehaviors {


    public static void init() {
        registerBehavior(104, new ResourceLocation(ULVCovers.MODID, "pump.ulv"), ULVCoverMetaItems.ELECTRIC_PUMP_ULV, (tile, side) -> new CoverPump(tile, side, GTValues.ULV, 320));
        registerBehavior(105, new ResourceLocation(ULVCovers.MODID, "conveyor.ulv"), ULVCoverMetaItems.CONVEYOR_MODULE_ULV, (tile, side) -> new CoverConveyor(tile, side, GTValues.ULV, 4));
    }

    public static void registerBehavior(int coverNetworkId, ResourceLocation coverId, MetaValueItem placerItem, BiFunction<ICoverable, EnumFacing, CoverBehavior> behaviorCreator) {
        placerItem.addComponents(new CoverPlaceBehavior(registerCover(coverNetworkId, coverId, placerItem, behaviorCreator)));
    }

    public static CoverDefinition registerCover(int coverNetworkId, ResourceLocation coverId, MetaValueItem itemStack, BiFunction<ICoverable, EnumFacing, CoverBehavior> behaviorCreator) {
        CoverDefinition coverDefinition = new CoverDefinition(coverId, behaviorCreator, itemStack.getStackForm());
        GregTechAPI.COVER_REGISTRY.register(coverNetworkId, coverId, coverDefinition);
        return coverDefinition;
    }
    
}
