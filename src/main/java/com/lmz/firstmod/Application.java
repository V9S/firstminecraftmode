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
		//�÷����������Ԥ��ʼ���¼�����������event���������Ӧ�ķ������һЩ����
//        GameRegistry.registerTileEntity(TileEntityChest.class,"TileEntityChest"); //���������һ�׶�ע��TileEntity���������ӣ�
//        GameRegistry.registerTileEntity(TileEntityChest.class,new ResourceLocation("TileEntityChest"));
        //���°汾��forge������resourcelocationע��ʵ�壬resourcelocation����һ��ָ��json�ļ���������ἰ
        //Ҳ������RegistryEvent.Register<T>����������ע�ᣬ�Ƽ������������Ļ��ἰ
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// some example code
		//�÷������������ʼ���¼����������ø��¼����������Ӧ�������һЩ�����������������ע����ĺϳɱ�
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//�÷�������������ʼ���¼����������ø��¼����������Ӧ�������һЩ����
	}
}
