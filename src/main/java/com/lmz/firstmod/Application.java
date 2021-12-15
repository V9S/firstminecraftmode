package com.lmz.firstmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.lmz.firstmod.init.ModRecipes;
import com.lmz.firstmod.proxy.CommonProxy;
import com.lmz.firstmod.util.Reference;

import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Application {

	private static Logger logger;

	@Instance
	public Application instace;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		ModRecipes.init();
		logger.info("preInit");
		//该方法负责监听预初始化事件，并可以用event对象调用相应的方法完成一些工作
//        GameRegistry.registerTileEntity(TileEntityChest.class,"TileEntityChest"); //你可以在这一阶段注册TileEntity（例如箱子）
//        GameRegistry.registerTileEntity(TileEntityChest.class,new ResourceLocation("TileEntityChest"));
        //较新版本的forge建议用resourcelocation注册实体，resourcelocation对象一般指向json文件，后面会提及
        //也可以用RegistryEvent.Register<T>对象来进行注册，推荐的做法，下文会提及
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		//该方法负责监听初始化事件，并可以用该事件对象调用相应方法完成一些工作，你可以在这里注册你的合成表
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//该方法负责监听后初始化事件，并可以用该事件对象调用相应方法完成一些工作
	}
}
