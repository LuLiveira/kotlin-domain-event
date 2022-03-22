package main.kotlin.event.impl

import main.kotlin.event.IEvent

class CreateUserEvent : IEvent {
    fun criarUsuario() {
        println("Usuario criado!")
    }

}
