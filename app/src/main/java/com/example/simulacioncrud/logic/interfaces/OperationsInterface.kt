package com.example.simulacioncrud.logic.interfaces

interface OperationsInterface {

    fun ClientAdd ( id: Int , name: String )

    fun ClientDel ( id: Int )

    fun ClientUpdate ( id: Int , name: String )

}