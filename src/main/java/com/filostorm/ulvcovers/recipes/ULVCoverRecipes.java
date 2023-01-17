package com.filostorm.ulvcovers.recipes;

import com.filostorm.ulvcovers.config.ULVCoversConfig;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.stack.UnificationEntry;

import static com.filostorm.ulvcovers.items.ULVCoverMetaItems.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.ore.OrePrefix.*;

public class ULVCoverRecipes {
    // Generates ULV cover recipes based on the recipeType config setting. Any option other than "easy" or "normal" is ignored.
    public static void init() {
        String recipeType = ULVCoversConfig.recipeType;
        if (recipeType.equals("none")) {
            return;
        }

        if (recipeType.equals("easy")) {
            ModHandler.addShapedRecipe("motor_ulv_easy", ELECTRIC_MOTOR_ULV.getStackForm(),
                    "WR",
                    "MW",
                    'R', new UnificationEntry(stick, Bronze),
                    'M', new UnificationEntry(stick, IronMagnetic),
                    'W', new UnificationEntry(wireGtSingle, Tin)
            );
            ModHandler.addShapedRecipe("piston_ulv_easy", ELECTRIC_PISTON_ULV.getStackForm(),
                    "PR",
                    "MG",
                    'R', new UnificationEntry(stick, Bronze),
                    'G', new UnificationEntry(gearSmall, Bronze),
                    'P', new UnificationEntry(plate, Bronze),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
            ModHandler.addShapedRecipe("pump_ulv_easy", ELECTRIC_PUMP_ULV.getStackForm(),
                    "PR",
                    "MO",
                    'R', new UnificationEntry(rotor, Bronze),
                    'O', new UnificationEntry(ring, Rubber),
                    'P', new UnificationEntry(pipeNormalFluid, Copper),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
            ModHandler.addShapedRecipe("conveyor_ulv_easy", CONVEYOR_MODULE_ULV.getStackForm(),
                    "PC",
                    "MP",
                    'P', new UnificationEntry(plate, Rubber),
                    'C', new UnificationEntry(cableGtSingle, Lead),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
            ModHandler.addShapedRecipe("robot_arm_ulv_easy", ROBOT_ARM_ULV.getStackForm(),
                    "MR",
                    "PC",
                    'R', new UnificationEntry(stick, Bronze),
                    'C', new UnificationEntry(circuit, MarkerMaterials.Tier.ULV),
                    'P', ELECTRIC_PISTON_ULV.getStackForm(),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
            return;
        }

        if (recipeType.equals("normal")) {
            ModHandler.addShapedRecipe("motor_ulv_normal", ELECTRIC_MOTOR_ULV.getStackForm(),
                    "CWR",
                    "WMW",
                    "RWC",
                    'R', new UnificationEntry(stick, Bronze),
                    'M', new UnificationEntry(stick, IronMagnetic),
                    'W', new UnificationEntry(wireGtSingle, Tin),
                    'C', new UnificationEntry(cableGtSingle, Lead)
            );
            ModHandler.addShapedRecipe("piston_ulv_normal", ELECTRIC_PISTON_ULV.getStackForm(),
                    "PPP",
                    "CRR",
                    "CMG",
                    'R', new UnificationEntry(stick, Bronze),
                    'G', new UnificationEntry(gearSmall, Bronze),
                    'P', new UnificationEntry(plate, Bronze),
                    'C', new UnificationEntry(cableGtSingle, Lead),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
            ModHandler.addShapedRecipe("pump_ulv_normal", ELECTRIC_PUMP_ULV.getStackForm(),
                    "SRO",
                    "dPw",
                    "OMC",
                    'R', new UnificationEntry(rotor, Bronze),
                    'S', new UnificationEntry(screw, Bronze),
                    'O', new UnificationEntry(ring, Rubber),
                    'P', new UnificationEntry(pipeNormalFluid, Copper),
                    'C', new UnificationEntry(cableGtSingle, Lead),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
            ModHandler.addShapedRecipe("conveyor_ulv_normal", CONVEYOR_MODULE_ULV.getStackForm(),
                    "PPP",
                    "MCM",
                    "PPP",
                    'P', new UnificationEntry(plate, Rubber),
                    'C', new UnificationEntry(cableGtSingle, Lead),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
            ModHandler.addShapedRecipe("robot_arm_ulv_normal", ROBOT_ARM_ULV.getStackForm(),
                    "CCC",
                    "MRM",
                    "PUR",
                    'R', new UnificationEntry(stick, Bronze),
                    'C', new UnificationEntry(cableGtSingle, Lead),
                    'U', new UnificationEntry(circuit, MarkerMaterials.Tier.ULV),
                    'P', ELECTRIC_PISTON_ULV.getStackForm(),
                    'M', ELECTRIC_MOTOR_ULV.getStackForm()
            );
        }
    }
}
