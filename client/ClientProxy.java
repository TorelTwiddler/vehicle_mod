package toreldwerf.vehicle_mod.client;

import net.minecraftforge.client.MinecraftForgeClient;
import toreldwerf.vehicle_mod.CommonProxy;

/**
 * User: toreltwiddler
 * Date: 2/27/13
 * Time: 4:30 PM
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {
        MinecraftForgeClient.preloadTexture(ITEMS_PNG);
        MinecraftForgeClient.preloadTexture(BLOCKS_PNG);
    }
}
