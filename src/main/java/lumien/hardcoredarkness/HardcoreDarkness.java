package lumien.hardcoredarkness;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientConnectedToServerEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent.ClientDisconnectionFromServerEvent;

@Mod(modid = HardcoreDarkness.MOD_ID, name = HardcoreDarkness.MOD_NAME, version = HardcoreDarkness.MOD_VERSION)
public class HardcoreDarkness
{
	public static final String MOD_ID = "HardcoreDarkness";
	public static final String MOD_NAME = "Hardcore Darkness";
	public static final String MOD_VERSION = "@VERSION@";

	@Instance(MOD_ID)
	public static HardcoreDarkness INSTANCE;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		
	}

	@SubscribeEvent
	public void playerLogin(ClientConnectedToServerEvent event)
	{
		
	}
	
	@SubscribeEvent
	public void playerLogout(ClientDisconnectionFromServerEvent event)
	{
		
	}

	@SubscribeEvent
	public void playerLoginServer(final PlayerLoggedInEvent event)
	{
		
	}
	
}
