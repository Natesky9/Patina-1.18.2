package com.natesky9.patina.init;

import com.natesky9.patina.Patina;
import com.natesky9.patina.block.Custom.CustomBlockEntity;
import com.natesky9.patina.block.BlastCauldron.MachineBlastCauldronEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Patina.MOD_ID);

    //--------------------------------------------------//
    public static final RegistryObject<BlockEntityType<CustomBlockEntity>> CUSTOM_MACHINE_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("custom_machine_block_entity", () ->
                    BlockEntityType.Builder.of(CustomBlockEntity::new,
                            ModBlocks.MACHINE_CUSTOM.get()).build(null));

    public static final RegistryObject<BlockEntityType<MachineBlastCauldronEntity>> MACHINE_BLAST_CAULDRON_ENTITY =
            BLOCK_ENTITIES.register("machine_blast_furnace_entity",() ->
                    BlockEntityType.Builder.of(MachineBlastCauldronEntity::new,
                            ModBlocks.MACHINE_BLAST_CAULDRON.get()).build(null));
    //--------------------------------------------------//
    public static void register(IEventBus eventBus)
    {
        BLOCK_ENTITIES.register(eventBus);
    }
}
