package com.mattams.mattamsmod.brass;

import com.mattams.mattamsmod.brass.block.BrassBlocks;
import com.mattams.mattamsmod.brass.item.BrassItems;
import net.minecraftforge.eventbus.api.IEventBus;

public class BrassModule {
    public static void register(IEventBus eventBus){
        BrassItems.register(eventBus);
        BrassBlocks.register(eventBus);
    }
}
