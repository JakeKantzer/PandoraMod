package com.bluestreakgames.pandoramod.entity.monster;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;

/**
 * Created by jkantzer on 1/12/16.
 */
public class RenderZombiePrime extends RenderZombie {
    private static final ResourceLocation zombiePrimeTextures = new ResourceLocation("pandoramod:textures/entity/zombieprime/zombieprime.png");
    // We need to redefine this because the superclass marked it private :(
    private static final ResourceLocation zombieVillagerTextures = new ResourceLocation("textures/entity/zombie/zombie_villager.png");

    public RenderZombiePrime(RenderManager manager) {
        super(manager);
    }

    @Override
    protected ResourceLocation func_180578_a(EntityZombie entity) {
        return entity.isVillager() ? zombieVillagerTextures : zombiePrimeTextures;
    }
}
