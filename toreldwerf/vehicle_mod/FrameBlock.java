package toreldwerf.vehicle_mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

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

    public void turnIntoEntity () {
        /**
         * This will spawn a new entity of the shape of the blocks.
         */
    }

    public boolean isValidStructure () {
        /**
         * This will return true if this block and all frame blocks connected
         * make a structure that can actually work.
         */
        return false;
    }

    public FrameBlock[] getTouchingFrameBlocks () {
        /**
         * This gets an array of all of the touching FrameBlocks.
         */
        return new FrameBlock[0];
    }

    public boolean addItem (Item item) {
        /**
         * Adds the item to this block. Will return true if
         * it works.
         */
        return false;
    }
}
