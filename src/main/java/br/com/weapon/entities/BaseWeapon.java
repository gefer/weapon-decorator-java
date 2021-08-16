package br.com.weapon.entities;

/**
 *
 * @author gefer
 */
public class BaseWeapon implements Weapon {

    @Override
    public void mount() {
        System.out.println("Montando uma arma base....");
    }

}
