package com.slt.java_basics.designPatterns.factory.factory1.factoryMethod;

import com.slt.java_basics.designPatterns.factory.factory1.simpleFactory.Rectangle;
import com.slt.java_basics.designPatterns.factory.factory1.simpleFactory.Shape;

public class RectangleFactory implements Factory{

    @Override
    public Shape getShape() {
        // TODO Auto-generated method stub
        return new Rectangle();
    }

}

