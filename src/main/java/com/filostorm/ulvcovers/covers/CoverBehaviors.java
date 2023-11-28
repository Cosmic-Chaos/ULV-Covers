package com.filostorm.ulvcovers.covers;

import com.filostorm.ulvcovers.ULVCovers;
import com.filostorm.ulvcovers.items.ULVCoverMetaItems;

import gregtech.api.GTValues;
import gregtech.api.cover.CoverDefinition;
import gregtech.api.items.behavior.CoverItemBehavior;
import gregtech.api.items.metaitem.MetaItem.MetaValueItem;
import gregtech.common.covers.CoverConveyor;
import gregtech.common.covers.CoverPump;
import gregtech.common.covers.CoverRoboticArm;
import net.minecraft.util.ResourceLocation;

public class CoverBehaviors {


    public static void init() {
        registerBehavior(new ResourceLocation(ULVCovers.MODID, "pump.ulv"), ULVCoverMetaItems.ELECTRIC_PUMP_ULV,
                (def, tile, side) -> new CoverPump(def, tile, side, GTValues.ULV, 320));
        registerBehavior(new ResourceLocation(ULVCovers.MODID, "conveyor.ulv"), ULVCoverMetaItems.CONVEYOR_MODULE_ULV,
                (def, tile, side) -> new CoverConveyor(def, tile, side, GTValues.ULV, 4));
        registerBehavior(new ResourceLocation(ULVCovers.MODID, "robot.arm.ulv"), ULVCoverMetaItems.ROBOT_ARM_ULV,
                (def, tile, side) -> new CoverRoboticArm(def, tile, side, GTValues.ULV, 4));
    }

    public static void registerBehavior(ResourceLocation coverId, MetaValueItem placerItem, CoverDefinition.CoverCreator behaviorCreator) {
        CoverDefinition coverDefinition = gregtech.common.covers.CoverBehaviors.registerCover(coverId, placerItem.getStackForm(), behaviorCreator);
        placerItem.addComponents(new CoverItemBehavior(coverDefinition));
    }
}
