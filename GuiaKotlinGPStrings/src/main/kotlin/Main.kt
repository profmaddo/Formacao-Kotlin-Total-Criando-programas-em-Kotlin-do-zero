fun main() {

    // Strings
    // \t \b \n \r \\ \$
    // Contatenar + Strings
    // Raw Strings


    val preco : String = "R$ 12.99"
    var Kotlin =
        """  ---
                     KOTLIN CURSO $preco
           DE
           
       Programação *** \n--- 2023 """

    val texto : String = "Formação " + Kotlin + " Total - Guia de Programação"

    println(texto)

}