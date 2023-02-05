/**
 * Programa para calcular qual produto está
 * mais vantajoso para compra, comparando preço
 * e quantidade de uma promoção.
 */
fun main() {

    var produtoA = entradaDeDados("Digite o preço do Produto A: 99.99--> ")
    var quantidadeA = entradaDeDados("Digite para o Produto A a quantidade: ")

    var produtoB = entradaDeDados("Digite o preço do Produto B: 99.99--> ")
    var quantidadeB = entradaDeDados("Digite para o Produto B a quantidade: ")

    var precoUnidadeA = 0.00 // em Gramas
    var precoUnidadeB = 0.00 // em Gramas

    precoUnidadeA = produtoA / quantidadeA
    precoUnidadeB = produtoB / quantidadeB

    var precoKiloA = 0.0 // um Kilograma
    var precoKiloB = 0.0 // um Kilograma

    precoKiloA = precoUnidadeA * 1000
    precoKiloB = precoUnidadeB * 1000

    println("ProdutoA preço por KG = R$ $precoKiloA")
    println("ProdutoB preço por KG = R$ $precoKiloB")

    melhorCompra(precoKiloA,precoKiloB)

}

fun entradaDeDados(mensagem: String): Double {

    var valorEntradaDeDados: Double?

    do {
        println(mensagem)
        valorEntradaDeDados = readLine()!!.toDoubleOrNull()
    } while (valorEntradaDeDados == null)


    return valorEntradaDeDados
}

fun melhorCompra(a: Double, b: Double) {

    if (a == b) {
        println("Compre Qualquer um dos produtos")
    } else if (a < b) {
        println("Compre o produto A")
    } else {
        println("Compre o produto B")
    }
}