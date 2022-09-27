package ttttoooo.StarlightWeapons.core.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import ttttoooo.StarlightWeapons.starlightweapons;
import ttttoooo.StarlightWeapons.util.enums.ModItemTiers;
//import ttttoooo.StarlightWeapons.items.ItemBase;
//import ttttoooo.StarlightWeapons.items.tools.ToolAxe;
//import ttttoooo.StarlightWeapons.items.tools.ToolHoe;
//import ttttoooo.StarlightWeapons.items.tools.ToolPickaxe;
//import ttttoooo.StarlightWeapons.items.tools.ToolSpade;
//import ttttoooo.StarlightWeapons.items.tools.ToolSword;

public class ModItems {
	//For reference this would normally be called ItemInit
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, starlightweapons.MOD_ID);
	
	//Order/Items
	public static final RegistryObject<Item> CCRYSTAL = ITEMS.register("ccrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> CCRYSTALE = ITEMS.register("ccrystale", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> SPCRYSTAL = ITEMS.register("spcrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> SPCRYSTALE = ITEMS.register("spcrystale", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> DCRYSTALE = ITEMS.register("dcrystale", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> PCRYSTAL = ITEMS.register("pcrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> GCRYSTAL = ITEMS.register("gcrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> DLINGOT = ITEMS.register("dlingot", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> SLINGOT = ITEMS.register("slingot", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	
	//Order/Blocks
	public static final RegistryObject<Item> SL_BLOCK_ITEM = ITEMS.register("sl_block", () -> new BlockItem(ModBlocks.SL_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> DL_BLOCK_ITEM = ITEMS.register("dl_block", () -> new BlockItem(ModBlocks.DL_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> CC_BLOCK_ITEM = ITEMS.register("cc_block", () -> new BlockItem(ModBlocks.CC_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> SP_BLOCK_ITEM = ITEMS.register("sp_block", () -> new BlockItem(ModBlocks.SP_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> PU_BLOCK_ITEM = ITEMS.register("pu_block", () -> new BlockItem(ModBlocks.PU_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> GR_BLOCK_ITEM = ITEMS.register("gr_block", () -> new BlockItem(ModBlocks.GR_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> CCO_BLOCK_ITEM = ITEMS.register("cco_block", () -> new BlockItem(ModBlocks.CCO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> SPO_BLOCK_ITEM = ITEMS.register("spo_block", () -> new BlockItem(ModBlocks.SPO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> PUO_BLOCK_ITEM = ITEMS.register("puo_block", () -> new BlockItem(ModBlocks.PUO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> GRO_BLOCK_ITEM = ITEMS.register("gro_block", () -> new BlockItem(ModBlocks.GRO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	
	//Order/Materials
	//*NOW DEFINED IN MODITEMTIERS.JAVA*
	//public static final ToolMaterial MATERIAL_SLBASE = EnumHelper.addToolMaterial("Starlight", 0, 150, 3.0F, 1.0F, 10).setRepairItem(new ItemStack(SLINGOT));
	//public static final ToolMaterial MATERIAL_DLBASE = EnumHelper.addToolMaterial("darklight", 0, 100, 3.0F, 1.5F, 10).setRepairItem(new ItemStack(DLINGOT));
	//public static final ToolMaterial MATERIAL_CCBASE = EnumHelper.addToolMaterial("chro", 0, 2000, 3.0F, 15.0F, 30).setRepairItem(new ItemStack(CCRYSTAL));
	//public static final ToolMaterial MATERIAL_PUBASE = EnumHelper.addToolMaterial("diam", 0, 6000, 3.0F, 10.0F, 30).setRepairItem(new ItemStack(Items.DIAMOND));
	//public static final ToolMaterial MATERIAL_ZUBASE = EnumHelper.addToolMaterial("zult", 0, 4000, 3.0F, 12.5F, 30).setRepairItem(new ItemStack(ZCRYSTAL));
	
	//Order/Weapons
    public static final RegistryObject<Item> SSWORD = ITEMS.register("ssword_base",
            () -> new PickaxeItem(ModItemTiers.STARLIGHT, 5, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> DSWORD = ITEMS.register("dsword_base",
            () -> new PickaxeItem(ModItemTiers.DARKLIGHT, 5, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
	//public static final ItemSword SSWORDA = new ToolSword("ssword_base", MATERIAL_SLBASE);
	//public static final ItemSword SSWORDB = new ToolSword("ssword_diam", MATERIAL_PUBASE);
	//public static final ItemSword SSWORDC = new ToolSword("ssword_chro", MATERIAL_CCBASE);
	//public static final ItemSword SSWORDD = new ToolSword("ssword_zult", MATERIAL_ZUBASE);
	//public static final ItemSword DSWORDA = new ToolSword("dsword_base", MATERIAL_DLBASE);
	//public static final ItemSword DSWORDB = new ToolSword("dsword_chro", MATERIAL_CCBASE);
	//public static final ItemSword DSWORDC = new ToolSword("dsword_diam", MATERIAL_PUBASE);
	//public static final ItemSword DSWORDD = new ToolSword("dsword_zult", MATERIAL_ZUBASE);
		
	
	//Chaos/Items
	public static final RegistryObject<Item> BCRYSTAL = ITEMS.register("bcrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> BCRYSTALE = ITEMS.register("bcrystale", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> KCRYSTAL = ITEMS.register("kcrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> KCRYSTALE = ITEMS.register("kcrystale", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> RCRYSTAL = ITEMS.register("rcrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> RCRYSTALE = ITEMS.register("rcrystale", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> VoCRYSTAL = ITEMS.register("vocrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> DiCRYSTAL = ITEMS.register("dicrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> VoINGOT = ITEMS.register("voingot", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> DiINGOT = ITEMS.register("diingot", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	
	//Chaos/Blocks
	public static final RegistryObject<Item> VO_BLOCK_ITEM = ITEMS.register("vo_block", () -> new BlockItem(ModBlocks.VO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> DI_BLOCK_ITEM = ITEMS.register("di_block", () -> new BlockItem(ModBlocks.DI_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> BE_BLOCK_ITEM = ITEMS.register("be_block", () -> new BlockItem(ModBlocks.BE_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> RE_BLOCK_ITEM = ITEMS.register("re_block", () -> new BlockItem(ModBlocks.RE_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> KO_BLOCK_ITEM = ITEMS.register("ko_block", () -> new BlockItem(ModBlocks.KO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> VOO_BLOCK_ITEM = ITEMS.register("voo_block", () -> new BlockItem(ModBlocks.VOO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> DIO_BLOCK_ITEM = ITEMS.register("dio_block", () -> new BlockItem(ModBlocks.DIO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> BEO_BLOCK_ITEM = ITEMS.register("beo_block", () -> new BlockItem(ModBlocks.BEO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> REO_BLOCK_ITEM = ITEMS.register("reo_block", () -> new BlockItem(ModBlocks.REO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> KOO_BLOCK_ITEM = ITEMS.register("koo_block", () -> new BlockItem(ModBlocks.KOO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
		
	//Chaos/Materials
	//*NOW DEFINED IN MODITEMTIERS.JAVA*
	//public static final ToolMaterial MATERIAL_DiBASE = EnumHelper.addToolMaterial("disorder", 0, 150, 3.0F, 1.0F, 10).setRepairItem(new ItemStack(DiINGOT));
	//public static final ToolMaterial MATERIAL_VoBASE = EnumHelper.addToolMaterial("void", 0, 100, 3.0F, 1.5F, 10).setRepairItem(new ItemStack(VoINGOT));
	//public static final ToolMaterial MATERIAL_KCBASE = EnumHelper.addToolMaterial("chro", 0, 2000, 3.0F, 10.0F, 30).setRepairItem(new ItemStack(KCRYSTAL));
	//public static final ToolMaterial MATERIAL_RCBASE = EnumHelper.addToolMaterial("diam", 0, 3000, 3.0F, 9.0F, 30).setRepairItem(new ItemStack(RCRYSTAL));
	//public static final ToolMaterial MATERIAL_BCBASE = EnumHelper.addToolMaterial("zult", 0, 2500, 3.0F, 9.5F, 30).setRepairItem(new ItemStack(BCRYSTAL));
			
	//Chaos/Weapons
	//public static final ItemSword SWORDD = new ToolSword("dsword_zult", MATERIAL_ZUBASE);
	
	//Base/Items
	public static final RegistryObject<Item> SACRYSTAL = ITEMS.register("sacrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	public static final RegistryObject<Item> NACRYSTAL = ITEMS.register("nacrystal", () -> new Item(new Item.Properties().tab(starlightweapons.TAB)));
	
	//Base/Blocks
	public static final RegistryObject<Item> SA_BLOCK_ITEM = ITEMS.register("sa_block", () -> new BlockItem(ModBlocks.SA_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> NA_BLOCK_ITEM = ITEMS.register("na_block", () -> new BlockItem(ModBlocks.NA_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> SAO_BLOCK_ITEM = ITEMS.register("sao_block", () -> new BlockItem(ModBlocks.SAO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	public static final RegistryObject<Item> NAO_BLOCK_ITEM = ITEMS.register("nao_block", () -> new BlockItem(ModBlocks.NAO_BLOCK.get(),(new Item.Properties().tab(starlightweapons.TAB))));
	
	//Base/Materials
	//*NOW DEFINED IN MODITEMTIERS.JAVA*
	//public static final ToolMaterial MATERIAL_NABASE = EnumHelper.addToolMaterial("namber", 2, 300, 4.0F, 1.0F, 10).setRepairItem(new ItemStack(NACRYSTAL));
	//public static final ToolMaterial MATERIAL_SABASE = EnumHelper.addToolMaterial("sapphire", 3, 1500, 7.5F, 2.0F, 18).setRepairItem(new ItemStack(SACRYSTAL));
	
	//Base/Tools
    public static final RegistryObject<Item> NAPICK = ITEMS.register("na_pick",
            () -> new PickaxeItem(ModItemTiers.NAMBER, 1, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> NAAXE = ITEMS.register("na_axe",
            () -> new PickaxeItem(ModItemTiers.NAMBER, 6, -3.4F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> NASPADE = ITEMS.register("na_spade",
            () -> new PickaxeItem(ModItemTiers.NAMBER, 1, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> NAHOE = ITEMS.register("na_hoe",
            () -> new PickaxeItem(ModItemTiers.NAMBER, 0, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> SAPICK = ITEMS.register("sa_pick",
            () -> new PickaxeItem(ModItemTiers.SAPPHIRE, 1, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> SAAXE = ITEMS.register("sa_axe",
            () -> new PickaxeItem(ModItemTiers.SAPPHIRE, 6, -3.4F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> SASPADE = ITEMS.register("sa_spade",
            () -> new PickaxeItem(ModItemTiers.SAPPHIRE, 1, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
    public static final RegistryObject<Item> SAHOE = ITEMS.register("sa_hoe",
            () -> new PickaxeItem(ModItemTiers.SAPPHIRE, 0, -1.0F, new Item.Properties().tab(starlightweapons.TAB)));
}
