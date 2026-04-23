package main.kotlin.ejercicios

object Constants {
    const val VELOCIDAD_LUZ = 299792458
}

fun ejecutarBloque1() {
    println("\n=== BLOQUE 1: VARIABLES ===")

    // 1. Perfil de Usuario
    val nombre = "Estiven"
    var ciudad = "Bello"
    println("1. Nombre: $nombre, Ciudad inicial: $ciudad")
    ciudad = "Medellín"
    println("   Ciudad cambiada a: $ciudad")

    // 2. Calculadora de Años
    val anioNacimiento = 2008
    val anioActual = 2026
    val edad = anioActual - anioNacimiento
    println("2. Año nacimiento: $anioNacimiento, Edad aproximada: $edad")

    // 3. Tipos Explícitos
    val precioCoche: Double = 10000.50
    val pesoNaranja: Float = 0.30f
    val poblacionMundial: Long = 8000000000L
    println("3. Coche: $$precioCoche, Naranja: ${pesoNaranja}kg, Población: $poblacionMundial")

    // 4. Inferencia
    val estaLloviendo = false
    println("4. ¿Está lloviendo? $estaLloviendo (Tipo inferido: ${estaLloviendo::class.simpleName})")

    // 5. Constantes Reales
    println("5. Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
}
