package br.com.weapon.entities;

import br.com.weapon.decorators.WeaponDecorator;

/**
 *
 * @author gefer
 */
public class GunSight extends WeaponDecorator {

    public GunSight(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void mount() {
        super.mount();
        System.out.println("Adicionando uma mira a arma...");
    }

}
