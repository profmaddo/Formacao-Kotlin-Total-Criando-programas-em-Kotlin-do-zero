/**
 * Métodos
 * Assinaturas de métodos
 * Métodos sem retorno
 * Métodos com retorno
 */

fun main() {
    imprimir()
    imprimirAlgo("Algo")
    println(somarDoisNumeros(4,2))

    var somar = devolverSomatoria(5,3)

    imprimirAlgo("Somatoria: $somar")
    imprimirAlgo(somar.toString())
}

fun imprimir(){
    println("Imprimindo...")
}

fun imprimirAlgo(algo: String): Unit{
    println("Imprimindo...$algo")

}

fun somarDoisNumeros(numeroA: Int, numeroB: Int){

    println(numeroA+numeroB);
}

fun devolverSomatoria(numeroA: Int, numeroB: Int): Int{
    return  numeroA+numeroB
 }

