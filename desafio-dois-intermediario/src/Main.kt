import java.util.Scanner

enum class TipoAmbiente {
    LITORANEA,
    NERITICA,
    ABATIAL,
    ABISSAL
}

// Classe base para conservação marinha
open class ConservacaoMarinha(
    val tipoAmbiente: TipoAmbiente,
    val areaProtegidaEmKm2: Double,
    val possuirProgramaMonitoramento: Boolean
) {
    lateinit var detalhes: String

    init {
        detalhes = "Ambiente: $tipoAmbiente, " +
                "Área protegida: $areaProtegidaEmKm2 km², " +
                "Programa de monitoramento: ${if (possuirProgramaMonitoramento) "Sim" else "Não"}"
    }

    open fun mostrarDetalhes() {
        println(detalhes)
    }
}

class ReservaMarinha(
    tipoAmbiente: TipoAmbiente,
    areaProtegidaEmKm2: Double,
    possuirProgramaMonitoramento: Boolean
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuirProgramaMonitoramento) {

    lateinit var tipoReserva: String

    fun definirTipoReserva(opcao: Int) {
        tipoReserva = when (opcao) {
            1 -> "Estações Ecológicas"
            2 -> "Reservas Biológicas"
            3 -> "Parques Nacionais"
            4 -> "Monumentos Naturais"
            5 -> "Refúgios da Vida Silvestre"
            else -> "Opção inválida"
        }
    }

    override fun mostrarDetalhes() {
        with(detalhes) {
            println("$this, Tipo de Reserva: $tipoReserva")
        }
    }
}


fun main() {
    val scanner = Scanner(System.`in`)

    println("Qual o tipo de ambiente?")
    for(p in TipoAmbiente.values()){
        println("$p")
    }
    print("\n")

    println("Qual o tipo da reserva marinha?")
    println("1. Estações Ecológicas")
    println("2. Reservas Biológicas")
    println("3. Parques Nacionais")
    println("4. Monumentos Naturais")
    println("5. Refúgios da Vida Silvestre")
    print("Escolha uma das opções: ")

    val opcao = scanner.nextInt()

    print("Qual o tamanho da área protegida? ")
    val areaProtegida = readLine()?.toDoubleOrNull() ?: 0.0

    print("\n")

    print("O local possui programa de monitoramento ? (S/N)")
    val possuiMonitoramento = readLine()?.lowercase()
    val isValidMonitoramento = possuiMonitoramento == "s"

    val reservaMarinha = ReservaMarinha(TipoAmbiente.LITORANEA, areaProtegida, isValidMonitoramento)

    // Define o tipo de reserva com base na escolha do usuário
    reservaMarinha.definirTipoReserva(opcao)

    // Exibe os detalhes da reserva marinha
    reservaMarinha.mostrarDetalhes()
}