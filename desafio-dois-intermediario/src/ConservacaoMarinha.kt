class ConservacaoMarinha(
    val tipoAmbiente: TipoAmbienteMarinho,
    val areaProtegidaEmKm2: Double,
    val possuiProgramaMonitoramento: Boolean,
) {
    enum class TipoAmbienteMarinho{

    }
}