package com.bawnorton.archaeologyplus;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

import java.util.function.Supplier;

public class ArchaeologyPlus {
    public static final String MOD_ID = "archaeologyplus";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final ItemGroup EXAMPLE_TAB = CreativeTabRegistry.create(new Identifier(MOD_ID, "example_tab"), () ->
            new ItemStack(ArchaeologyPlus.EXAMPLE_ITEM.get()));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Settings().group(ArchaeologyPlus.EXAMPLE_TAB)));
    
    public static void init() {
        ITEMS.register();
        
        System.out.println(ArchaeologyPlusExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
