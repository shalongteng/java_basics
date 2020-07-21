package com.slt.java_basics.designPatterns.proxy.dynamicroxy.cglib.aop;

/**
 * @Description： 改类作为AOP 模型中切面角色类， 实现切面接口，切面接口定义了两个切面方法，分别在切点接口方法执行前和执行后执行 。 <br/>
 */
public class CustomAspect implements IAspect {
    @Override
    public void startTransaction() {
        System.out.println("cglib. I get datasource here and start transaction");
    }

    public void endTrasaction() {
        System.out.println("cglib I get datasource here and end transaction");
    }
}