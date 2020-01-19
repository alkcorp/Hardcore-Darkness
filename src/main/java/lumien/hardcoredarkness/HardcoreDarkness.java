package lumien.hardcoredarkness;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientDisconnectionFromServerEvent;

@Mod(modid = "HardcoreDarkness", name = "Hardcore Darkness", version = "1.7")
public class HardcoreDarkness {

	public static final String MOD_ID = "HardcoreDarkness";
	public static final String MOD_NAME = "Hardcore Darkness";
	public static final String MOD_VERSION = "1.7";

	public static Logger logger;

	@Mod.Instance("HardcoreDarkness")
	public static HardcoreDarkness INSTANCE;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		logger.info("Loading "+MOD_NAME+"-"+MOD_VERSION+".");
		logger.info("This dummy mod has been provided by Alkalus to stop server administrators forcing HCD on their players.");
		logger.info("This mod is free to use and redistribute.");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {

	}

	@SubscribeEvent
	public void playerLogin(ClientConnectedToServerEvent event) {

	}

	@SubscribeEvent
	public void playerLogout(ClientDisconnectionFromServerEvent event) {

	}

	@SubscribeEvent
	public void playerLoginServer(final PlayerLoggedInEvent event) {

	}

}
