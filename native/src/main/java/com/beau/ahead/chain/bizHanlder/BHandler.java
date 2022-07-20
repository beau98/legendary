package com.beau.ahead.chain.bizHanlder;

import com.beau.ahead.chain.AbstractHandler;
import com.beau.ahead.chain.HandlerContext;

public class BHandler extends AbstractHandler {
    @Override
    public void handle(HandlerContext context) {
        System.out.println(this.getClass().getName() + "->" + context.getTag());
    }
}
