fun main() {
    print("Digite a temperatura em Celsius: ")

    // Lê o que foi digitado e converte para número decimal (Double)
    val celsius = readln().toDouble()

    // Aplica a fórmula: F = C * 1.8 + 32
    val fahrenheit = celsius * 1.8 + 32

    println("$celsius°C é igual a $fahrenheit°F")
}