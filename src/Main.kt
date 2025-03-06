import java.util.Scanner

fun main() {
    val listLibro = mutableListOf<Libro>()
    val libro1 = Libro("James Clear", "Atomic Habits", "1", 27.03, 45)
    val libro2 = Libro("Rebecca Yarros", "Fourth Wing", "2", 16.99, 20)
    val libro3 = Libro("Robert T Kiyosaki", "Padre rico Padre pobre", "3", 12.39, 10)

    listLibro.add(libro1)
    listLibro.add(libro2)
    listLibro.add(libro3)

    val scanner = Scanner(System.`in`)

    while (true) {
        println("Menú")
        println("1. Prestar libro")
        println("2. Devolver libro")
        println("3. Mostrar información del libro")
        println("4. Salir")
        print("Seleccione una opción: ")

        val opcion = scanner.nextInt()
        scanner.nextLine()

        when (opcion) {
            1 -> {
                print("Ingrese el ISBN del libro que desea prestar: ")
                val isbn = scanner.nextLine()
                val libro = buscarLibroPorISBN(listLibro, isbn)
                if (libro != null) {
                    libro.prestarLibro()
                } else {
                    println("Libro no encontrado.")
                }
            }
            2 -> {
                print("Ingrese el ISBN del libro que desea devolver: ")
                val isbn = scanner.nextLine()
                val libro = buscarLibroPorISBN(listLibro, isbn)
                if (libro != null) {
                    libro.devolverLibro()
                } else {
                    println("Libro no encontrado.")
                }
            }
            3 -> {
                print("Ingrese el ISBN del libro para mostrar información: ")
                val isbn = scanner.nextLine()
                val libro = buscarLibroPorISBN(listLibro, isbn)
                if (libro != null) {
                    println(libro)
                } else {
                    println("Libro no encontrado.")
                }
            }
            4 -> {
                println("Saliendo del programa.")
                break
            }
            else -> {
                println("Opción no válida. Intente de nuevo.")
            }
        }
    }
}

fun buscarLibroPorISBN(listLibro: List<Libro>, isbn: String): Libro? {
    return listLibro.find { it.isbn == isbn }
}