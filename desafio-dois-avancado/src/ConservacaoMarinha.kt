package ConservacaoMarinha

abstract class ConservacaoMarinha(
    val tipoAmbiente: String,
    val areaProtegidaEmKm2: Double,
    val possuiProgramaMonitoramento: Boolean
) {
    abstract fun calcularEficienciaConservacao(): ConservacaoMarinha

    abstract fun exibirInformacoes(): String
}

class ReservaMarinha(
    tipoAmbiente: String,
    areaProtegidaEmKm2: Double,
    possuiProgramaMonitoramento: Boolean,
    val tipoReserva: String,
    var eficiencia: Double = 0.0
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuiProgramaMonitoramento) {

    override fun calcularEficienciaConservacao(): ConservacaoMarinha {
        eficiencia = if (possuiProgramaMonitoramento) {
            areaProtegidaEmKm2 * 0.9
        } else {
            areaProtegidaEmKm2 * 0.5
        }

        return this
    }

    override fun exibirInformacoes(): String {
        calcularEficienciaConservacao()

        val numeroFormatado = String.format("%.2f", eficiencia)
        val monitoramento: String = if (possuiProgramaMonitoramento) "SIM" else "NÃO"

        return """
            Tipo de Ambiente Marinho: $tipoAmbiente
            Área Protegida: $areaProtegidaEmKm2 km²
            Possui Programa de Monitoramento: $monitoramento
            Tipo de Reserva: $tipoReserva
            Eficiência de Conservação: $numeroFormatado
        """.trimIndent()
    }
}

