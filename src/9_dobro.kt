fun main() {
    print("Digite um número inteiro: ")

    // toIntOrNull tenta converter; se falhar, retorna null
    // ?: 0 diz: "se for null, use 0"
    val numero = readLine()?.toIntOrNull() ?: 0

    val dobro = numero * 2

    println("O dobro do que você digitou (ou 0 se inválido) é: $dobro")
}