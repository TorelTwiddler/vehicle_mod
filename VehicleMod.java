/**
 * toreldwerf.vehicle_mod
 * User: toreltwiddler
 * Date: 2/26/13
 * Time: 2:25 PM
 */
package toreldwerf.vehicle_mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid="VehicleMod", name="VehicleMod", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=true)
public class VehicleMod {

    // Items
    private final static Item steelIngot = new VehicleModItem(5000).setMaxStackSize(64)
            .setIconIndex(0).setItemName("steelIngot");
    private final static Item steelLump = new VehicleModItem(5001).setMaxStackSize(64)
            .setIconIndex(1).setItemName("steelLump");
    private final static Item screw = new VehicleModItem(5002).setMaxStackSize(64)
            .setIconIndex(2).setItemName("Screw");
    private final static Item bolt = new VehicleModItem(5003).setMaxStackSize(64)
            .setIconIndex(3).setItemName("Bolt");


    // Blocks
    public final static Block woodFrame = new FrameBlock(500, 0, Material.wood)
            .setHardness(0.5F).setStepSound(Block.soundWoodFootstep)
            .setBlockName("woodFrame").setCreativeTab(CreativeTabs.tabBlock);
    public final static Block steelFrame = new FrameBlock(501, 1, Material.iron)
            .setHardness(0.5F).setStepSound(Block.soundMetalFootstep)
            .setBlockName("steelFrame").setCreativeTab(CreativeTabs.tabBlock);

    // Methods
    @Instance("VehicleMod")
    public static VehicleMod instance;

    @SidedProxy(clientSide="toreldwerf.vehicle_mod.client.ClientProxy",
            serverSide="toreldwerf.vehicle_mod.CommonProxy")
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Init
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();

        loadItems();
        loadBlocks();
        loadRecipes();
        loadSmelting();
    }

    private void loadSmelting() {
        GameRegistry.addSmelting(steelLump.itemID, new ItemStack(steelIngot, 1), 0.1f);
    }

    private void loadRecipes() {
        // Steel Lump
        GameRegistry.addShapelessRecipe(new ItemStack(steelLump, 1),
                new ItemStack(Item.coal), new ItemStack(Item.ingotIron));

        // Frames
        ItemStack planksStack = new ItemStack(Block.planks);
        GameRegistry.addRecipe(new ItemStack(woodFrame), "yxy","x x", "yxy",
                'x', planksStack, 'y', screw);
        GameRegistry.addRecipe(new ItemStack(steelFrame), "yxy","x x", "yxy",
                'x', steelIngot, 'y', bolt);
    }

    private void loadBlocks() {
        // Wood Frame
        LanguageRegistry.addName(woodFrame, "Wood Frame");
        MinecraftForge.setBlockHarvestLevel(woodFrame, "axe", 0);
        GameRegistry.registerBlock(woodFrame, "woodFrame");

        // Steel Frame
        LanguageRegistry.addName(steelFrame, "Steel Frame");
        MinecraftForge.setBlockHarvestLevel(steelFrame, "pickaxe", 1);
        GameRegistry.registerBlock(steelFrame, "steelFrame");
    }

    private void loadItems() {
        LanguageRegistry.addName(steelIngot, "Steel Ingot");
        LanguageRegistry.addName(steelLump, "Steel Lump");
        LanguageRegistry.addName(screw, "Screw");
        LanguageRegistry.addName(bolt, "Bolt");

    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {

    }
}
