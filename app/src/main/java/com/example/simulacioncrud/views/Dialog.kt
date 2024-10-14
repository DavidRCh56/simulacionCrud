package com.example.simulacioncrud.views

class Dialog {
    private var onAdd: ((Int, String, String, String) -> Unit)? = null
    private var onDelete: ((Int) -> Unit)? = null
    private var onUpdate: ((Int, String, String, String) -> Unit)? = null

    fun setOnAdd(listener: (Int, String, String, String) -> Unit) {
        onAdd = listener
    }

    fun setOnDelete(listener: (Int) -> Unit) {
        onDelete = listener
    }

    fun setOnUpdate(listener: (Int, String, String, String) -> Unit) {
        onUpdate = listener
    }

    fun show() {
        // Simular la captura de datos
        // Aquí se llamaría a onAdd?.invoke(id, name, apellidos, telefono) según la acción
    }
}
