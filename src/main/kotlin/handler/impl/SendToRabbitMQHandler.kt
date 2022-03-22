package main.kotlin.handler.impl

import main.kotlin.handler.IEventHandler

class SendToRabbitMQHandler : IEventHandler {

   override fun handle() {
       println("Chamando o SendToRabbitMQHandler!")
   }

}
