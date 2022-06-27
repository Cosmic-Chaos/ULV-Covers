package com.filostorm.ulvcovers.items;

import com.filostorm.ulvcovers.config.ULVCoversConfig;
import gregtech.api.items.metaitem.StandardMetaItem;

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
        ULVCoverMetaItems.CONVEYOR_MODULE_ULV = addItem(startID++, unlocPartNames[0]);
        ULVCoverMetaItems.ELECTRIC_PUMP_ULV = addItem(startID++, unlocPartNames[1]);
        ULVCoverMetaItems.ELECTRIC_MOTOR_ULV = addItem(startID++, unlocPartNames[2]);
        ULVCoverMetaItems.ELECTRIC_PISTON_ULV = addItem(startID++, unlocPartNames[3]);
        ULVCoverMetaItems.ROBOT_ARM_ULV = addItem(startID++, unlocPartNames[4]);
    }
}
