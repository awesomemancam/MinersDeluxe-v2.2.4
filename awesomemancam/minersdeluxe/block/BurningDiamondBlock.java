package awesomemancam.minersdeluxe.block;

import awesomemancam.minersdeluxe.lib.Library;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BurningDiamondBlock extends Block {

	public BurningDiamondBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setHardness(4.0F);
		this.setStepSound(soundStoneFootstep);
		this.setUnlocalizedName(Library.BLOCK.U_NAME.burningDiamondBlock);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightValue(0.9F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("minersdeluxe:burningDiamondBlock");
	}
	
}
