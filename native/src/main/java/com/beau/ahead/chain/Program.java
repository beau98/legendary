package com.beau.ahead.chain;

import com.beau.ahead.chain.bizHanlder.AHandler;
import com.beau.ahead.chain.bizHanlder.BHandler;
import com.beau.ahead.chain.bizHanlder.CHandler;

public class Program {

    public static void main(String[] args) {
        HandlerContext handlerContext = new HandlerContext();
        handlerContext.setTag(false);
        HandlerChain handlerChain = new HandlerChain(handlerContext);
        handlerChain.addHandler(new AHandler());
        handlerChain.addHandler(new CHandler());
        handlerChain.addHandler(new BHandler());

        handlerChain.process();
    }
}
