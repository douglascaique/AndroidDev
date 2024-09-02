data class Livro(val nome: String, val totalPaginas: Int, var paginasLidas: Int)

fun main() {
    val livros = mutableListOf<Livro>()

    while (true) {
        println("Digite o nome do livro (ou 'sair' para terminar):")
        val nomeDoLivro = readLine() ?: ""
        if (nomeDoLivro.lowercase() == "sair") break

        println("Digite o número total de páginas:")
        val totalPaginas = readLine()?.toIntOrNull() ?: 0

        println("Digite o número de páginas lidas:")
        val paginasLidas = readLine()?.toIntOrNull() ?: 0

        livros.add(Livro(nomeDoLivro, totalPaginas, paginasLidas))
    }

    for (livro in livros) {
        val progresso = if (livro.totalPaginas > 0) (livro.paginasLidas.toDouble() / livro.totalPaginas * 100) else 0.0
        println("Você leu %.2f%% do livro \"${livro.nome}\".".format(progresso))
    }
}
