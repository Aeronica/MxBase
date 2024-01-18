package aeronicamc.mods.mxbase;


import net.minecraftforge.fml.common.Mod;

import static aeronicamc.mods.mxbase.CommonClass.init;
import static aeronicamc.mods.mxbase.Constants.MOD_ID;

@Mod(MOD_ID)
public class MxBase {
    
    public MxBase() {
    
        // This method is invoked by the Forge mod loader when it is ready
        // to load your mod. You can access Forge and Common code in this
        // project.
    
        // Use Forge to bootstrap the Common mod.
        Constants.LOG.info("Hello Forge world!");
        init();
        
    }
}