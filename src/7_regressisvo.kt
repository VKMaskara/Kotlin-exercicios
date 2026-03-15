fun main() {
    for (i in 10 downTo 0) {
        println("Tempo: $i")
        Thread.sleep(1000) // Pausa de 1 segundo
    }

    println("Fim!")
}
