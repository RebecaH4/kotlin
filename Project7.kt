fun main(parametro: Array<String>) {
    print("Ingrese el precio del producto:")
    val precio = readln().toDouble()
    print("Ingrese la cantidad de productos:")
    val cantidad = readln().toInt()
    val total = precio * cantidad
    println("El total a pagar es $total")
}