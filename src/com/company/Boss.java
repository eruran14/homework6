package com.company;

public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return "Health is " + this.getHealth() + ", his damage is " + this.getDamage() +
                ". His weapon type is " + this.weapon.getWeaponType() + " and his weapon is " + this.weapon.getWeaponName();
    }
}
