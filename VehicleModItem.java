package toreldwerf.vehicle_mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * User: toreltwiddler
 * Date: 2/27/13
 * Time: 7:03 PM
 *
 * VehicleModItem is a generic Item class
 * for random items that do not directly
 * work with the FrameBlocks.
 */
public class VehicleModItem extends Item {
    public VehicleModItem(int id) {
        super(id);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);

    }

    public String getTextureFile() {
        return CommonProxy.ITEMS_PNG;
    }
}
