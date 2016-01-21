package com.bluestreakgames.pandoramod.entity.monster;

import com.bluestreakgames.pandoramod.entity.EntityManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by jkantzer on 1/9/16.
 */
public class CreeperPrime implements IPandoraMob {
    @Override
    public Class<? extends EntityLiving> getEntityClass() {
        return EntityCreeperPrime.class;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Render getEntityRenderer(RenderManager manager) {
        return new RenderCreeperPrime(manager);
    }

    @Override
    public String getEntityName() {
        return "CreeperPrime";
    }

    @Override
    public int getTrackingRange() {
        return 64;
    }

    @Override
    public int getUpdateFrequency() {
        return 3;
    }

    @Override
    public boolean getSendsVelocityUpdates() {
        return true;
    }

    @Override
    public int getEggPrimary() {
        return 0;
    }

    @Override
    public int getEggSecondary() {
        return 26112;
    }

    @Override
    public EnumCreatureType getCreatureType() {
        return EnumCreatureType.MONSTER;
    }

    @Override
    public BiomeGenBase[] getBiomesForSpawn() {
        return EntityManager.getStandardBiomes();
    }

    @Override
    public int getSpawnWeightedProb() {
        return 50;
    }

    @Override
    public int getSpawnMin() {
        return 4;
    }

    @Override
    public int getSpawnMax() {
        return 4;
    }
}
