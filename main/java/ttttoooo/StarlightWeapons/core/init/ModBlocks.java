package ttttoooo.StarlightWeapons.core.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import ttttoooo.StarlightWeapons.starlightweapons;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
	//For reference this would normally be called BlocksInit
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, starlightweapons.MOD_ID);
	
	//Order
	public static final RegistryObject<Block> SL_BLOCK = BLOCKS.register("sl_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DL_BLOCK = BLOCKS.register("dl_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CC_BLOCK = BLOCKS.register("cc_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SP_BLOCK = BLOCKS.register("sp_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PU_BLOCK = BLOCKS.register("pu_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GR_BLOCK = BLOCKS.register("gr_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> PUO_BLOCK = BLOCKS.register("puo_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> GRO_BLOCK = BLOCKS.register("gro_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> CCO_BLOCK = BLOCKS.register("cco_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SPO_BLOCK = BLOCKS.register("spo_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));

	//public static final Block LForge = new MetalBlock("lforge", Material.IRON);
	
	//Chaos
	public static final RegistryObject<Block> VO_BLOCK = BLOCKS.register("vo_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DI_BLOCK = BLOCKS.register("di_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BE_BLOCK = BLOCKS.register("be_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> RE_BLOCK = BLOCKS.register("re_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> KO_BLOCK = BLOCKS.register("ko_block", () -> new Block(AbstractBlock.Properties.of(Material.GLASS).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> VOO_BLOCK = BLOCKS.register("voo_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(3)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> DIO_BLOCK = BLOCKS.register("dio_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(3)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> BEO_BLOCK = BLOCKS.register("beo_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(3)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> REO_BLOCK = BLOCKS.register("reo_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(3)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> KOO_BLOCK = BLOCKS.register("koo_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(3)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	
	//Other Blocks
	public static final RegistryObject<Block> SA_BLOCK = BLOCKS.register("sa_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> NA_BLOCK = BLOCKS.register("na_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(1)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> SAO_BLOCK = BLOCKS.register("sao_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(2)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	public static final RegistryObject<Block> NAO_BLOCK = BLOCKS.register("nao_block", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4f,6f).harvestLevel(1)
			.harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	
}

