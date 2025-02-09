open class Persona(val nombre: String, private var edad: Int = 18) {
    init {
        require(edad >= 0) { "La edad debe ser positiva" }
        require(nombre.isNotEmpty()) { "El nombre no debe estar vacio." }
    }

    fun cumple() = edad++

    override fun toString(): String = "Persona | Nombre = $nombre - Edad = $edad"

    fun mostrarEdad() = println("Edad = $edad")

    open fun actividad() = println("$nombre esta realizando una actividad.")
}