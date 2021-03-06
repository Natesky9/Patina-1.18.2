package com.natesky9.patina.block.BlastCauldron;

import com.natesky9.patina.block.Template.MachineTemplateBlock;
import com.natesky9.patina.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class MachineBlastCauldronBlock extends MachineTemplateBlock
{
    //block stuff
    @Override
    public BlockEntityType<MachineBlastCauldronEntity> getBlockEntityType()
        {return ModBlockEntities.MACHINE_BLAST_CAULDRON_ENTITY.get();}

    //constructor
    public MachineBlastCauldronBlock(Properties p_49224_) {
        super(p_49224_);
    }

    //Block Entity stuff
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new MachineBlastCauldronEntity(pPos, pState);
    }
}