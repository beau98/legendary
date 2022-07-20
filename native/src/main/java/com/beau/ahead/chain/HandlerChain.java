package com.beau.ahead.chain;

import java.util.LinkedList;
import java.util.List;

public class HandlerChain {

    private HandlerContext handlerContext;

    private List<AbstractHandler> abstractHandlerList = new LinkedList<>();

    public HandlerChain(HandlerContext handlerContext) {
        this.handlerContext = handlerContext;
    }

    /**
     * add handler
     *
     * @param handler AbstractHandler
     */
    public void addHandler(AbstractHandler handler) {
        this.abstractHandlerList.add(handler);
    }

    /**
     * do process
     */
    public void process() {
        for (AbstractHandler nextHandler : abstractHandlerList) {
            nextHandler.handle(handlerContext);
        }
    }

}
