package com.mattams.mattamsmod.brass.item;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.base.MattamsModTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BrassItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MattamsMod.MOD_ID);

    public static final RegistryObject<Item> RAW_BRASS = ITEMS.register("raw_brass",
            () -> new Item(new Item.Properties().tab(MattamsModTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            () -> new Item(new Item.Properties().tab(MattamsModTab.MATTAMS_TAB)));

    public static final RegistryObject<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            () -> new Item(new Item.Properties().tab(MattamsModTab.MATTAMS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
