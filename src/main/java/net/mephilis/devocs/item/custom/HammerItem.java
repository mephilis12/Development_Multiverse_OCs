package net.mephilis.devocs.item.custom;

import net.minecraft.client.sound.Sound;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class HammerItem extends SwordItem {

    public HammerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }





    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        if (user.getItemCooldownManager().isCoolingDown(this))
            return super.use(world,user,hand);
        user.getItemCooldownManager().set(this,20*5);
        user.swingHand(hand);
        user.playSound(SoundEvents.ITEM_TRIDENT_THUNDER, SoundCategory.PLAYERS,1,1);

        user.getWorld().getEntitiesByClass(LivingEntity .class, user.getBoundingBox().expand(3), (target)->{ Vec3d vec3d = target.getPos().subtract(user.getPos());
            double knockbackResistance = (1.0 - target.getAttributeValue(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE));
            double knockback = (4) * knockbackResistance;
            Vec3d vec3d2 = vec3d.normalize().multiply(knockback);
            target.addVelocity(vec3d2.x, vec3d2.y, vec3d2.z);
            if (target instanceof ServerPlayerEntity serverPlayerEntity) {
                serverPlayerEntity.networkHandler.sendPacket(new EntityVelocityUpdateS2CPacket(serverPlayerEntity));
            }



            return true;
        });

        return super.use(world, user, hand);


    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BLOCK;
    }


}
