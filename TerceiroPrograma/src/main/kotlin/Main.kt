/**
 * val recebe valores imutáveis
 * var recebe valores mutáveis
 */
fun main() {

    // Declaração de atributos, definimos qual é o seu tipo de dado primitivo
    // caracteres, inteiro, real
    // Int, Long, Double, Float
    val valorVal: Int = 10 // Imutável
    var valorVar: Int = 20 // Mutável

   // println(valorVal)
   // println(valorVar)

     // valorVal = 11 instrução ou comando não permitido para atributos do tipo val

     valorVar = 3

    println(valorVal) // não permite alterar o seu conteúdo após definição
    println(valorVar) // permite alterar o seu conteúdo a qualquer momento após definição

     val outraVariavel = valorVal / valorVar.toDouble()

    // Int, Long, Double, Float

    println(outraVariavel)
}