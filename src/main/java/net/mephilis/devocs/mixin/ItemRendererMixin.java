package net.mephilis.devocs.mixin;

import net.mephilis.devocs.DevelopmentMultiverseOCs;
import net.mephilis.devocs.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;

import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useCobaltBattleAxeModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(ModItems.COBALT_BATTLEAXE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "wrath_of_dragonkin", "inventory"));
        }
        if (stack.isOf(ModItems.COBALT_CLAYMORE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "cobalt_claymore_3d", "inventory"));
        }
        if (stack.isOf(ModItems.COBALT_HAMMER) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "cobalt_hammer3d", "inventory"));
        }
        if (stack.isOf(ModItems.COBALT_MORNINGSTAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "cobalt_morninstar3d", "inventory"));
        }
        if (stack.isOf(ModItems.RUBY_BATTLEAXE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "ruby_battleaxe3d", "inventory"));
        }
        if (stack.isOf(ModItems.RUBY_CLAYMORE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "ruby_claymore_3d", "inventory"));
        }
        if (stack.isOf(ModItems.RUBY_HAMMER) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "ruby_hammer3d", "inventory"));
        }
        if (stack.isOf(ModItems.RUBY_MORNINGSTAR) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(DevelopmentMultiverseOCs.MOD_ID, "ruby_morninstar3d", "inventory"));
        }
        return value;
    }
}
