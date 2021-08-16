package br.com.weapon.runner;

import br.com.weapon.entities.BaseWeapon;
import br.com.weapon.entities.GunSight;
import br.com.weapon.entities.Silencer;
import br.com.weapon.entities.Weapon;

public class Main {

    public static void main(String[] args) {

        Weapon fullWeapon = new GunSight(new Silencer(new BaseWeapon()));
        fullWeapon.mount();

        Weapon baseWeapon = new BaseWeapon();
        baseWeapon.mount();

        Weapon weaponWithSilencer = new Silencer(baseWeapon);
        weaponWithSilencer.mount();

        Weapon weaponWithGunSight = new GunSight(baseWeapon);
        weaponWithGunSight.mount();
    }

}
