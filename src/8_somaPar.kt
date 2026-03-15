fun main(){
    val somaArray = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val somaPares =  somaArray.filter { it % 2 == 0 }.sum()
    println("A soma dos numeros Pares = $somaPares")
}