package EntradaInformacoes
import ConservacaoMarinha.ReservaMarinha

fun entradaInformacoes(){

    try {
        var tipoAmbiente: String
        var areaProtegidaEmKm2: Double
        var possuiProgramaMonitoramento: Boolean
        var tipoReserva: String

        do {
            println(
                "Digite o tipo de ambiente (Zona Litorânea, Zona Nerítica, " +
                        "Zona Abatial ou Zona Abissal):"
            )
            tipoAmbiente = readln().toString()
            if (tipoAmbiente !in listOf("Zona Litorânea", "Zona Nerítica", "Zona Abatial", "Zona Abissal")) {
                println("Comando Inválido, digite novamente um comando válido")
            }
        } while (tipoAmbiente !in listOf("Zona Litorânea", "Zona Nerítica", "Zona Abatial", "Zona Abissal"))

        do {
            println("Digite a área total protegida:")
            areaProtegidaEmKm2 = readln().toDoubleOrNull() ?: -1.0
            if (areaProtegidaEmKm2 <= 0) {
                println("Número Inválido, digite novamente um número válido")
            }
        } while (areaProtegidaEmKm2 <= 0)

            println("Essa área tem monitoramento? (SIM ou NÃO):")
            possuiProgramaMonitoramento = readln().toString().toLowerCase() == "sim"

        do {
            println("Digite o tipo de reserva(Estações Ecológicas, Reservas Biológicas, Parques Nacionais," +
                    "Monumentos Naturais ou Refúgios da Vida Silvestre:")
            tipoReserva = readln().toString()
            if (tipoReserva !in listOf("Estações Ecológicas", "Reservas Biológicas", "Parques Nacionais",
                    "Monumentos Naturais", "Refúgios da Vida Silvestre")) {
                println("Comando Inválido, digite novamente um comando válido")
            }
        } while (tipoReserva !in listOf("Estações Ecológicas", "Reservas Biológicas", "Parques Nacionais",
                "Monumentos Naturais", "Refúgios da Vida Silvestre"))


        val reserva = ReservaMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento, tipoReserva)
        println(reserva.exibirInformacoes())

    } catch (e: IllegalArgumentException){
        println("Erro interno. Tente novamente mais tarde")
    }
}