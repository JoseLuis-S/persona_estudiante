class Estudiante(nombre: String, open var edad: Int, val carrera: String): Persona(nombre, edad) {
    override fun toString(): String {
        return super.toString() + " - Carrera: $carrera"
    }

    override fun actividad() = println("$nombre esta estudiando.")
}