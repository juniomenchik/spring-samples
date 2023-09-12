package com.aincrad.kotlinapp.designPatterns.creational.singleton

// Database singleton

class Database private constructor() {
    private val clients: MutableList<Client> = mutableListOf()
    private val version = 0
    fun addClient(client: Client) {
        clients.add(client)
    }
    fun getClient(id: Int): Client? {
        return clients.find { it.id == id }
    }
    fun deleteClient(id: Int) {
        clients.removeIf { it.id == id }
    }
    fun showClients() {
        clients.forEach { println(it) }
    }

    // instance
    companion object {
        private var instance: Database? = null
        private var version = 0
        fun getInstance(): Database {
            if (instance == null) {
                version++
                instance = Database()
            }
            return instance as Database
        }
        fun getVersion(): Int {
            return version
        }
    }
}