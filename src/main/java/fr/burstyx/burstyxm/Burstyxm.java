package fr.burstyx.burstyxm;

import com.mojang.logging.LogUtils;

import fr.burstyx.burstyxm.block.ModBlocks;
import fr.burstyx.burstyxm.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Burstyxm.MOD_ID)
public class Burstyxm {
    public static final String MOD_ID = "burstyxm";
    private static final org.slf4j.Logger LOGGER = LogUtils.getLogger();

    public Burstyxm() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent evt) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent evt) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent evt) {

        }
    }
}
