package com.bluestreakgames.pandoramod;

import net.minecraft.init.Blocks;

/**
 * Created by jkantzer on 1/13/16.
 */
public class Utils {
    public static void setFireInfo() {
        // Increase the flammability of a few things
        Blocks.fire.setFireInfo(Blocks.planks, 10, 40);
        Blocks.fire.setFireInfo(Blocks.double_wooden_slab, 10, 40);
        Blocks.fire.setFireInfo(Blocks.wooden_slab, 10, 40);
        Blocks.fire.setFireInfo(Blocks.oak_fence_gate, 10, 40);
        Blocks.fire.setFireInfo(Blocks.spruce_fence_gate, 10, 40);
        Blocks.fire.setFireInfo(Blocks.birch_fence_gate, 10, 40);
        Blocks.fire.setFireInfo(Blocks.jungle_fence_gate, 10, 40);
        Blocks.fire.setFireInfo(Blocks.dark_oak_fence_gate, 10, 40);
        Blocks.fire.setFireInfo(Blocks.acacia_fence_gate, 10, 40);
        Blocks.fire.setFireInfo(Blocks.oak_fence, 10, 40);
        Blocks.fire.setFireInfo(Blocks.spruce_fence, 10, 40);
        Blocks.fire.setFireInfo(Blocks.birch_fence, 10, 40);
        Blocks.fire.setFireInfo(Blocks.jungle_fence, 10, 40);
        Blocks.fire.setFireInfo(Blocks.dark_oak_fence, 10, 40);
        Blocks.fire.setFireInfo(Blocks.acacia_fence, 10, 40);
        Blocks.fire.setFireInfo(Blocks.oak_stairs, 10, 40);
        Blocks.fire.setFireInfo(Blocks.birch_stairs, 10, 40);
        Blocks.fire.setFireInfo(Blocks.spruce_stairs, 10, 40);
        Blocks.fire.setFireInfo(Blocks.jungle_stairs, 10, 40);
        Blocks.fire.setFireInfo(Blocks.log, 10, 5);
        Blocks.fire.setFireInfo(Blocks.log2, 10, 5);
    }
}
