package awesomemancam.minersdeluxe.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import awesomemancam.minersdeluxe.MinersDeluxe;
import awesomemancam.minersdeluxe.lib.Library;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class GlowSapphireGlass extends BlockGlass {

	public GlowSapphireGlass(int par1, Material material, boolean bool) {
		super(par1, material, bool);
		
		this.setStepSound(soundGlassFootstep);
		this.setUnlocalizedName(Library.BLOCK.U_NAME.glowsapphireGlass);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.3F);
		this.setLightOpacity(1);
		this.setLightValue(1.0F);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("minersdeluxe:glowsapphireGlass");
	}
	
}
