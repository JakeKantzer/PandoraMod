package com.bluestreakgames.pandoramod.entity.monster;

import com.bluestreakgames.pandoramod.entity.EntityManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.ZombieEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by jkantzer on 1/12/16.
 */
public class ZombiePrime implements IPandoraMob {
    public ZombiePrime() {
        MinecraftForge.EVENT_BUS.register(new ZombiePrimeEventHandler());
    }

    @Override
    public Class<? extends EntityLiving> getEntityClass() {
        return EntityZombiePrime.class;
    }

    @Override
    public String getEntityName() {
        return "ZombiePrime";
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
        return 65280;
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

    @Override
    @SideOnly(Side.CLIENT)
    public Render getEntityRenderer(RenderManager manager) {
        return new RenderZombiePrime(manager);
    }

    public class ZombiePrimeEventHandler {
        @SubscribeEvent
        public void zombiePrimeReinforcement(ZombieEvent.SummonAidEvent event) {
            if (event.entity.getClass() == EntityZombiePrime.class) {
                event.customSummonedAid = new EntityZombiePrime(event.world);
            }
        }
    }
}
