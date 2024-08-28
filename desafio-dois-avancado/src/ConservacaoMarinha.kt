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
            areaProtegidaEmKm2 - areaProtegidaEmKm2 * 0.5
        }

        when(tipoReserva){
            "Estações Ecológicas" -> eficiencia+=10
            "Reservas Biológicas" -> eficiencia+=20
            "Parques Nacionais"   -> eficiencia+=20
            "Monumentos Naturais" -> eficiencia+=5
            "Refúgios da Vida Silvestre" -> eficiencia+=2
            else -> eficiencia++
        }

        when(tipoAmbiente){
            "Zona Litorânea" -> eficiencia+=4.0
            "Zona Nerítica" -> eficiencia+=2.9
            "Zona Abatial"   -> eficiencia+=3.7
            "Zona Abissal" -> eficiencia+=6.8
            else -> eficiencia+=2
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

