package me.purplepineapple.thedownunder;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("downunder")
public class TheDownUnder {
    private static final Logger LOGGER = LogManager.getLogger(); // LOGGER
    public static final String MOD_ID = "downunder"; // MOD ID

    public TheDownUnder() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();


        MinecraftForge.EVENT_BUS.register(this);
    }

}
