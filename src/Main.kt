fun main() {
    val persona1 = Persona("Juan", 34)
    println(persona1.nombre)
    persona1.cumple()
    println(persona1)
    persona1.mostrarEdad()

    val estudiante1 = Estudiante("Miguel", 24, "Ingenieria")
    estudiante1.actividad()
    persona1.actividad()
}