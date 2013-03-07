package toreldwerf.vehicle_mod;

import net.minecraft.creativetab.CreativeTabs;

/**
 * toreldwerf.vehicle_mod
 * User: toreltwiddler
 * Date: 3/2/13
 * Time: 1:15 PM
 *
 * FrameItems are items that can be placed into
 * FrameBlocks, such as seats and engines.
 */
public class FrameItem extends VehicleModItem{
    public FrameItem(int id) {
        super(id);
        setCreativeTab(CreativeTabs.tabMisc);
    }
}
