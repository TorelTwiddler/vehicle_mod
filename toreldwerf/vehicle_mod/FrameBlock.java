package toreldwerf.vehicle_mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

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

    public void turnIntoEntity (World world, int x, int y, int z) {
        /**
         * This will spawn a new entity of the shape of the blocks.
         */
        if (isValidStructure(world, x, y, z)) {
            //TODO: Turn the block into an entity here
        }
    }

    public boolean isValidStructure (World world, int x, int y, int z) {
        /**
         * This will return true if this block and all frame blocks connected
         * make a structure that can actually work.
         */
        return false;
    }

    public FrameBlock[] getTouchingFrameBlocks (World world, int x, int y, int z) {
        /**
         * This gets an array of all of the touching FrameBlocks.
         */
        return new FrameBlock[0];
    }

    public boolean addItem (World world, int x, int y, int z, Item item) {
        /**
         * Adds the item to this block. Will return true if
         * it works.
         */
        return false;
    }
}
