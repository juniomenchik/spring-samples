package com.aincrad.kotlinapp.designPatterns.creational.singleton

class SingletonTest

    fun main () {

        println("Singleton Test")
        println(Database.getVersion())
        val database = Database.getInstance()
        println(Database.getVersion())
        var client1 = Client(1,"John", "john@email.com")
        println("Adicionando Cliente.")
        database.addClient(client1)
        print("Mostrando todos os Clientes: 1 ")
        database.showClients()

        database.deleteClient(1)
        print("Mostrando todos os Clientes: 2 ")
        database.showClients()

    }
