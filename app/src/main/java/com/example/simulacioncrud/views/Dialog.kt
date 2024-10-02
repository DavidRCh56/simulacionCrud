package com.example.simulacioncrud.views

import com.example.simulacioncrud.logic.Controller
import com.example.simulacioncrud.logic.interfaces.OperationsInterface

class Dialog(var controller: Controller) {

    private var listener: OperationsInterface? = null

    fun setListener ( _listener : OperationsInterface ){
        listener = _listener
    }



}