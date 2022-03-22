package main.kotlin.dispatcher

import main.kotlin.handler.IEventHandler

interface IEventDispatcher {

    fun register(eventName: String, eventHandler: IEventHandler);
    fun notify(eventName: String);
}