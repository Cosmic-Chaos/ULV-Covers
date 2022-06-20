package com.filostorm.ulvcovers.items;

import gregtech.api.items.metaitem.MetaItem;

public final class ULVCoverMetaItems {

        private ULVCoverMetaItems() {
        }

        public static MetaItem<?>.MetaValueItem ELECTRIC_MOTOR_ULV;
        public static MetaItem<?>.MetaValueItem ELECTRIC_PUMP_ULV;
        public static MetaItem<?>.MetaValueItem CONVEYOR_MODULE_ULV;
        public static MetaItem<?>.MetaValueItem ELECTRIC_PISTON_ULV;


        public static void init() {
            ULVCoverMetaItem ulvMetaItem = new ULVCoverMetaItem();
            ulvMetaItem.setRegistryName("ulv_cover_meta_item");
        }
}