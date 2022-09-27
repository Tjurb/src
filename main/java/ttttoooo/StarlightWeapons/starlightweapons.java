package ttttoooo.StarlightWeapons;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import ttttoooo.StarlightWeapons.core.init.ModBlocks;
import ttttoooo.StarlightWeapons.core.init.ModItems;

@Mod("starlightweapons")
public class starlightweapons  {
	
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "starlightweapons";
	
	public starlightweapons() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModItems.ITEMS.register(bus);
		ModBlocks.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	public static final ItemGroup TAB = new ItemGroup("starlightweaponsTab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.PCRYSTAL.get());
		}
	};
}