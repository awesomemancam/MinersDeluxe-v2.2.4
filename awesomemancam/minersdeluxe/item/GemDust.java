package awesomemancam.minersdeluxe.item;

import awesomemancam.minersdeluxe.lib.Library;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GemDust extends Item {

	public GemDust(int par1) {
		super(par1);
		
		this.setMaxStackSize(64);
		this.setUnlocalizedName(Library.ITEM.U_NAME.gemDust);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon("minersdeluxe:gemDust");
	}
	
}
