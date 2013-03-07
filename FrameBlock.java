package toreldwerf.vehicle_mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * User: toreltwiddler
 * Date: 2/27/13
 * Time: 4:38 PM
 *
 * This is the base class for all Frame Blocks.
 * It will allow you to "place" select items inside them
 * by right-clicking with the item to place inside.
 *
 * After a set of touching FrameBlocks has a Key used
 * on it, the entire set will turn into an entity
 * to be driven around.
 */
public class FrameBlock extends Block {
    public FrameBlock(int id, int texture, Material material) {
        super(id, texture, material);
    }

    @Override
    public String getTextureFile () {
        return CommonProxy.BLOCKS_PNG;
    }
}
