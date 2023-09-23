package com.aincrad.kotlinapp.designPatterns.creational.singleton
class Client(
        var id: Int?,
        var name: String?,
        var email: String?) {

    override fun toString(): String {
        return "Client [id=$id, name=$name, email=$email]"
    }

}
