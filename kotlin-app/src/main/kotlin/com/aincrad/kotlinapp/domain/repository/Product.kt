package com.aincrad.kotlinapp.domain.repository

import java.time.LocalDateTime

class Product(var name: String?, var price: Int?, var createdAt: LocalDateTime?, var updatedAt: LocalDateTime?) {
    //criar um id estatico para o produto
    var id: Int? = null

}