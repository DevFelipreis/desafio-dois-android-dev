class  ConservacaoMarinha(
    var tipoAmbiente: String,
    var areaProtegidaEmKm2: Double,
    var possuiProgramaMonitoramento: Boolean,
){
    var parqueNacional = ""
        get(){
            println("Parque Nacional Marinho dos Abrolhos")
            return field
        }
        set(value) {
            field = value
            println("Novo tipo de Ambiente: $field")
        }
    init{
        print("\n")
        println("Tipo de Ambiente: $tipoAmbiente")
        println("Área Protegida: $areaProtegidaEmKm2 km²")
        println("Possui Monitoramento: $possuiProgramaMonitoramento")
    }


    //Isabel - Entender qual a função do constructor secundário:
    constructor(tipoAmbiente: String): this(tipoAmbiente, 0.0, false){}
}

fun main() {
    //Isabel - Realizar os inputs da tarefa
    val conservacao: ConservacaoMarinha = ConservacaoMarinha("Coral",100.0, true)
    conservacao.parqueNacional
    conservacao.parqueNacional = "Manguezal"
}


