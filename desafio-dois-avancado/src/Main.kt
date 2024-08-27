import ConservacaoMarinha.ReservaMarinha

fun main() {
    println("Digite o tipo de ambiente(Zona Litorânea, Zona Nerítica," +
            "Zona Abatial ou Zona Abissal):")
    val tipoAmbiente = readln().toString()

    println("Digite a área total protegida:")
    val areaProtegidaEmKm2 = readln().toDouble()

    println("Essa área tem monitoramento? (SIM ou NÃO):")
    val possuiProgramaMonitoramento = readln().toString().toLowerCase() == "sim"

    println("Digite o tipo de reserva(Estações Ecológicas, Reservas Biológicas, Parques Nacionais," +
            "Monumentos Naturais ou Refúgios da Vida Silvestre:")
    val tipoReserva = readln().toString()

    val reserva = ReservaMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento, tipoReserva)
    println(reserva.exibirInformacoes())
}