package com.slt.java_basics.designPatterns.factory.factory1.abstractFactory;

public class AK_Factory implements Factory{

    @Override
    public Gun produceGun() {
        return new AK();
    }

    @Override
    public Bullet produceBullet() {
        return new AK_Bullet();
    }

}
