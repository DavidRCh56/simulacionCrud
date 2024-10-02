package com.example.simulacioncrud.data

import com.example.simulacioncrud.logic.Client

class RepositoryClient {

    companion object{

        var primary = 100

        val listClient : List<Client> = listOf(
            Client (incrementPrimary(),"Santi"),
            Client (RepositoryClient.incrementPrimary(),"Alberto"),
            Client (RepositoryClient.incrementPrimary(),"Juan"),
            Client (RepositoryClient.incrementPrimary(),"David"),

        )

        fun incrementPrimary() = primary ++

    }

}