package ttttoooo.StarlightWeapons.util.enums;


import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import ttttoooo.StarlightWeapons.core.init.ModItems;

public enum ModItemTiers implements IItemTier{
	NAMBER(2, 300, 4.0F, 1.0F, 10, () -> {
		return Ingredient.of(ModItems.NACRYSTAL.get());
	}),
	SAPPHIRE(3, 1500, 7.5F, 2.0F, 18, () -> {
		return Ingredient.of(ModItems.SACRYSTAL.get());
	}),
	STARLIGHT(4, 2000, 7.0F, 2.0F, 15, () -> {
		return Ingredient.of(ModItems.SLINGOT.get());
	}),
	DARKLIGHT(4, 1800, 7.0F, 2.5F, 15, () -> {
		return Ingredient.of(ModItems.DLINGOT.get());
	}),;

	private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ModItemTiers(int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

	@Override
	public int getUses() {
		// TODO Auto-generated method stub
		return this.uses;
	}

	@Override
	public float getSpeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

	@Override
	public float getAttackDamageBonus() {
		// TODO Auto-generated method stub
		return this.damage;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return this.enchantmentValue;
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return this.repairIngredient.get();
	}
}