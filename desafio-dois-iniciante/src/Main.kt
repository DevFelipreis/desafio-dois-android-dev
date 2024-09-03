class ConservacaoMarinha(
    var tipoAmbiente: String,
    var areaProtegidaEmKm2: Double,
    var possuiProgramaMonitoramento: Boolean,
) {
    var parqueNacional = ""
        get(){
            println("Parque Nacional Marinho dos Abrolhos")
            return field
        }
        set(value) {
            field = value
            println("Tipo de Ambiente: $field")
        }
    init{
        print("\n")
        println("Tipo de Ambiente: $tipoAmbiente")
        println("Área Protegida: $areaProtegidaEmKm2 km²")
       val possuiProgramaMonitoramentoSimOuNao = if(possuiProgramaMonitoramento) "SIM" else "NÃO"
        println("Possui Monitoramento: $possuiProgramaMonitoramentoSimOuNao")
    }

    constructor(tipoAmbiente: String) : this(tipoAmbiente, 200.0,false) {
        println("Construtor secundário utilizando.")
    }
}

fun main() {
    println("Gerenciador de informações.")

    print("Qual o tamanho da área protegida? ")
    val areaProtegida = readLine()?.toDoubleOrNull() ?: 0.0

    print("\n")

    print("O local possui programa de monitoramento ? (S/N)")
    val possuiMonitoramento = readLine()?.lowercase()
    val isValidMonitoramento = possuiMonitoramento == "s"

    val conservacao: ConservacaoMarinha = ConservacaoMarinha("Coral", areaProtegida, isValidMonitoramento)

    println("Configuração do Parque Nacional: ")
    conservacao.parqueNacional = "Ilha Redonda"

    println("\nInformação do Parque Nacional configurado: ")
    println(conservacao.parqueNacional)

    println("\nUtilizando get e set ->")
    conservacao.parqueNacional
    conservacao.parqueNacional = "Manguezal"
    conservacao.parqueNacional
    conservacao.parqueNacional = "Ilha Redonda"

}
