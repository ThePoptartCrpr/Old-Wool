package thepoptartcrpr.oldwool;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thepoptartcrpr.oldwool.proxy.CommonProxy;

@Mod(modid = Variables.MODID, name = Variables.NAME, version = Variables.VERSION)
public class OldWool {
	
	@Mod.Instance(Variables.MODID)
	public static OldWool instance;
	
	@SidedProxy(serverSide = Variables.SERVER_PROXY, clientSide = Variables.CLIENT_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
