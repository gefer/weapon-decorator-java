package br.com.weapon.decorators;

import br.com.weapon.entities.Weapon;

public class WeaponDecorator implements Weapon {

    private Weapon weapon;

    public WeaponDecorator(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mount() {
        this.weapon.mount();
    }

}
