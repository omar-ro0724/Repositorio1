class Libro {
    var titulo: String = ""
    var autor: String = ""
    var isbn: String = ""
    var precio: Double = 0.00
    var cantidadDisponible: Int = 0

    constructor()

    constructor(autor: String, titulo: String, isbn: String, precio: Double, cantidadDisponible: Int) {
        this.autor = autor
        this.titulo = titulo
        this.isbn = isbn
        this.precio = precio
        this.cantidadDisponible = cantidadDisponible
    }

    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', isbn='$isbn', precio=$precio, cantidadDisponible=$cantidadDisponible)"
    }

    fun prestarLibro(): Boolean {
        return if (cantidadDisponible > 0) {
            cantidadDisponible--
            println("Libro prestado. Cantidad disponible ahora: $cantidadDisponible")
            true
        } else {
            println("Libro no disponible para el préstamo. Cantidad disponible: $cantidadDisponible")
            false
        }
    }

    fun devolverLibro() {
        cantidadDisponible++
        println("Libro devuelto correctamente. Cantidad disponible ahora: $cantidadDisponible")
    }
}