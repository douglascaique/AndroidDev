fun main() {

    println("ACOMPANHADOR DE LEITURA")

    println("Digite o nome do livro:")
    val nomeDoLivro = readLine() ?: ""

    println("Digite o número total de páginas:")
    val totalPaginas = readLine()?.toIntOrNull() ?: 0


    println("Digite o número de páginas lidas:")
    val paginasLidas = readLine()?.toIntOrNull() ?: 0


    val progresso = if (totalPaginas > 0) (paginasLidas.toDouble() / totalPaginas * 100) else 0.0


    println("Você leu %.2f%% do livro \"$nomeDoLivro\".".format(progresso))
}
