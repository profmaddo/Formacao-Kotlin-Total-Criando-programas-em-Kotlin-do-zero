fun main(args: Array<String>) {
    // cast

    val preco : Double = -12.121314

    var novoPreco = preco.toString()
    var novoPrecoPromocao = preco.toFloat()

    val unidade : Int =  100

    var mensagemUnidade : String = unidade.toString()


    println("$preco   -   $novoPreco  -   $novoPrecoPromocao")
    println("$unidade   -   $mensagemUnidade")
}