package io.github.alkyaly.infinitywaterbucket.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {

    @Inject(at = @At("HEAD"), method = "isAcceptableItem", cancellable = true)
    protected void stub(ItemStack stack, CallbackInfoReturnable<Boolean> info) {
    }

}
