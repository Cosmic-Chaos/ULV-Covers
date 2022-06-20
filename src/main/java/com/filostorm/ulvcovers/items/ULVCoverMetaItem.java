package com.filostorm.ulvcovers.items;

import gregtech.api.items.metaitem.StandardMetaItem;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public class ULVCoverMetaItem extends StandardMetaItem {
    @Override
    public void registerSubItems() {
        int startID = 0;
        // ULV Components
        ULVCoverMetaItems.CONVEYOR_MODULE_ULV = addItem(startID++, "conveyor.module.ulv");
        ULVCoverMetaItems.ELECTRIC_PUMP_ULV = addItem(startID++, "electric.pump.ulv");
        ULVCoverMetaItems.ELECTRIC_MOTOR_ULV = addItem(startID++, "electric.motor.ulv");
        ULVCoverMetaItems.ELECTRIC_PISTON_ULV = addItem(startID++, "electric.piston.ulv");
    }
}
