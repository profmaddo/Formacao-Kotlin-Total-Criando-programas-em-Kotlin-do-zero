/**
 * Para facilitar a leitura de números grandes
 * Kotlin possue um ótimo recurso.
 * Podemos utilizar "sublinhado" para criar "templates"
 * para padrões numéricos
 */
fun main() {
    // Templates
    // CPF - CNPJ - CODIGO BARRAS - NÚMERO DE MATRÍCULA - PLANO DE CONTAS CONTABILIDADE
    val cpf = 321_432_543_77 // 321.432.543-77
    val cnpj = 100_000_000_1000_00 // 100.000.000/1000-00
    val codigoBarras = 12_222_3333_2_22
    val matricula = 99999_8888_7_8_9999
    val planoDeContasDespesa = 1_2222_22_22_22_9999

    println(cpf)
    println(cnpj)
    println(codigoBarras)
    println(matricula)
    println(planoDeContasDespesa)

}