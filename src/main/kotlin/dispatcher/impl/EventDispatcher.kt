package main.kotlin.dispatcher.impl

import main.kotlin.handler.IEventHandler
import main.kotlin.dispatcher.IEventDispatcher

class EventDispatcher : IEventDispatcher {

    val map = HashMap<String, IEventHandler>();

    override fun register(eventName: String, eventHandler: IEventHandler) {
        this.map[eventName] = eventHandler;
    }

    override fun notify(eventName: String) {
        this.map[eventName]?.handle()
    }
}