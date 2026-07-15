class Weapon {
    public void fire(int ammo) {
        System.out.println(ammo);
    }
}

class LaserRifle extends Weapon {
    @Override
    public void fire(int ammo) {
        System.out.println(ammo * 2);
    }
}

class OverrideDemo {
    public static void main(String[] args) {
        Weapon myWeapon = new LaserRifle();
        myWeapon.fire(10);
    }
}