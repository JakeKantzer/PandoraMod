package com.bluestreakgames.pandoramod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = PandoraMod.MODID, version = PandoraMod.VERSION)
public class PandoraMod {
    public static final String MODID = "pandoramod";
    public static final String VERSION = "0.1";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Do stuff
    }
}