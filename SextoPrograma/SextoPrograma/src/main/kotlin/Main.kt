fun main() {

    val cidade: String = "Paris"
    val nomeCompleto: String = "João José"
    val precoHospedagem: Double = 123.45

    // Contatenação de textos = Strings com atributos declados


    imprimir(cidade, nomeCompleto, precoHospedagem)
}


fun imprimir(cidade: String, nomeCompleto: String, precoHospedagem: Double){

    println("\n\n*****\nCidade $cidade Nome do Hóspede $nomeCompleto Valor da Diária $precoHospedagem\n*****")
}