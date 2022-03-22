import main.kotlin.dispatcher.impl.EventDispatcher
import main.kotlin.event.impl.CreateUserEvent
import main.kotlin.handler.impl.SendToRabbitMQHandler

fun main() {
    val eventDispatcher = EventDispatcher();
    val eventHandler = SendToRabbitMQHandler();

    eventDispatcher.register("CreateUserEvent",eventHandler);

    val createUserEvent = CreateUserEvent()

    createUserEvent.criarUsuario();

    eventDispatcher.notify(createUserEvent.javaClass.simpleName)
}