package com.beau.ahead.chain;

/**
 * base class for handler
 */
public abstract class AbstractHandler {

    /**
     * do something with context in current handler
     *
     * @param context context of chain
     */
    public abstract void handle(HandlerContext context);

}
