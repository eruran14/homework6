package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(950);
        boss1.setDamage(150);
        boss1.weapon.setWeaponType("Melee");
        boss1.weapon.setWeaponName("Axe");
        System.out.println("Health is " + boss1.getHealth() + ", his damage is " + boss1.getDamage() +
                ". His weapon type is " + boss1.weapon.getWeaponType() + " and his weapon is " + boss1.weapon.getWeaponName());
        System.out.println(boss1.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(400);
        skeleton1.setDamage(70);
        skeleton1.weapon.setWeaponType("Ranged");
        skeleton1.weapon.setWeaponName("Bow");
        skeleton1.setArrowsAmount(250);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(350);
        skeleton2.setDamage(85);
        skeleton2.weapon.setWeaponType("Ranged");
        skeleton2.weapon.setWeaponName("Crossbow");
        skeleton2.setArrowsAmount(180);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());



    }
}
