package net.chlorinemc.carbon.core;

import me.jellysquid.mods.sodium.client.SodiumClientMod;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;

@Mod(modid = "carbon")
public class CarbonClientMod {
    private static final SodiumClientMod sodium = new SodiumClientMod();

/*    List<ClientModInitializer> initializers = Arrays.asList(
            new SodiumClientMod()
    );


    @Override
    public void onInitializeClient() {
        initializers.forEach(ClientModInitializer::onInitializeClient);
    }*/
}
