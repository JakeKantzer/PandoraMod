package com.bluestreakgames.pandoramod.entity.monster;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

/**
 * Created by jkantzer on 1/12/16.
 */
public class EntityZombiePrime extends EntityZombie {
    private int itemTier;

    public EntityZombiePrime(World worldIn) {
        super(worldIn);
    }

    // Zombie Prime gets better equipment than standard issue
    @Override
    protected void func_180481_a(DifficultyInstance p_180481_1_) {
        super.func_180481_a(p_180481_1_);

        itemTier = rand.nextInt(4)+1;
        switch(itemTier){
            case 1:
                this.setCurrentItemOrArmor(0, new ItemStack(Items.golden_sword));
                break;
            case 2:
                this.setCurrentItemOrArmor(0, new ItemStack(Items.stone_sword));
                break;
            case 3:
                this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_sword));
                break;
            case 4:
                this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
                break;
        }

        for(int i = 1; i < 5; i++) {
            ItemStack equippedItem = this.getEquipmentInSlot(i);

            if (equippedItem == null) {
                Item armorItem = getArmorItemForSlot(i, itemTier);
                if(armorItem != null) {
                    this.setCurrentItemOrArmor(i, new ItemStack(armorItem));
                }
            }
        }
    }

    @Override
    protected Item getDropItem() {
        switch(rand.nextInt(6)) {
            case 0:
                switch(itemTier) {
                    case 1:
                        return Items.gold_ingot;
                    case 2:
                        return Item.getItemFromBlock(Blocks.cobblestone);
                    case 3:
                        return Items.iron_ingot;
                    case 4:
                        return Items.diamond;
                }
            case 1:
                return Items.coal;
            case 2:
                return Items.iron_pickaxe;
            default:
                break;
        }
        return Items.rotten_flesh;
    }
}
