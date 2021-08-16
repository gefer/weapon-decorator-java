package br.com.weapon.entities;

import br.com.weapon.decorators.WeaponDecorator;

/**
 *
 * @author gefer
 */
public class Silencer extends WeaponDecorator {

    public Silencer(Weapon weapon) {
        super(weapon);
    }

    @Override
    public void mount() {
        super.mount();
        System.out.println("Adicionando silenciador a arma...");
    }

}
