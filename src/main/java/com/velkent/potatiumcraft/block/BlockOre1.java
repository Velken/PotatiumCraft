package com.velkent.potatiumcraft.block;

import com.velkent.potatiumcraft.item.PCItems;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockOre1 extends BlockBase {

    public BlockOre1(String name) {
        super(Material.ROCK, name);

        setHardness(50f);
        setResistance(2000f);
    }

    @Override
    public BlockOre1 setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Nullable
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == PCBlocks.ore_potatium ? PCItems.potatium_dust : (Item.getItemFromBlock(this));
    }

    public int quantityDropped(Random random) {
        return this == PCBlocks.ore_potatium ? 1 + random.nextInt(5) : 1;
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState) this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0) {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        } else {
            return this.quantityDropped(random);
        }
    }

    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = world instanceof World ? ((World) world).rand : new Random();
        if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {
            int i = 0;

            if (this == PCBlocks.ore_potatium) {
                i = MathHelper.getRandomIntegerInRange(rand, 2, 10);
            }
            return i;
        }
        return 0;
    }
}