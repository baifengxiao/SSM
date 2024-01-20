package com.this0.aop;

import com.this0.aop.Impl.CalculatorImpl;
import org.junit.jupiter.api.Test;

public class TestAop {
    @Test
    public void test(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);

    }
}
