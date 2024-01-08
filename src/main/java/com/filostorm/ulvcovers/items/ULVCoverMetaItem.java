package com.filostorm.ulvcovers.items;

import com.filostorm.ulvcovers.config.ULVCoversConfig;
import gregtech.api.items.metaitem.StandardMetaItem;
import gregtech.common.items.behaviors.TooltipBehavior;
import net.minecraft.client.resources.I18n;

public class ULVCoverMetaItem extends StandardMetaItem {
    @Override
    public void registerSubItems() {
        int startID = 0;
        String[] unlocPartNames;

        // Set unlocalised names and texture as either ULV or Steam, based on the config
        if (ULVCoversConfig.steamTheme) {
            unlocPartNames = new String[] {"conveyor.module.steam", "electric.pump.steam", "electric.motor.steam", "electric.piston.steam", "robot.arm.steam"};
        } else {
            unlocPartNames = new String[] {"conveyor.module.ulv", "electric.pump.ulv", "electric.motor.ulv", "electric.piston.ulv", "robot.arm.ulv"};
        }

        // ULV Components
        ULVCoverMetaItems.CONVEYOR_MODULE_ULV = addItem(startID++, unlocPartNames[0])
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.conveyor.module.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 4));
                }));
        ULVCoverMetaItems.ELECTRIC_PUMP_ULV = addItem(startID++, unlocPartNames[1])
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.electric.pump.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.fluid_transfer_rate", 320));
                }));
        ULVCoverMetaItems.ELECTRIC_MOTOR_ULV = addItem(startID++, unlocPartNames[2]);
        ULVCoverMetaItems.ELECTRIC_PISTON_ULV = addItem(startID++, unlocPartNames[3]);
        ULVCoverMetaItems.ROBOT_ARM_ULV = addItem(startID++, unlocPartNames[4])
                .addComponents(new TooltipBehavior(lines -> {
                    lines.add(I18n.format("metaitem.robot.arm.tooltip"));
                    lines.add(I18n.format("gregtech.universal.tooltip.item_transfer_rate", 4));
                }));
    }
}
