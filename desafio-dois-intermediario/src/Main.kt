import java.util.Scanner

// Enumeração para os tipos de ambiente marinho
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

// Subclasse para Reserva Marinha
class ReservaMarinha(
    tipoAmbiente: TipoAmbiente,
    areaProtegidaEmKm2: Double,
    possuirProgramaMonitoramento: Boolean
) : ConservacaoMarinha(tipoAmbiente, areaProtegidaEmKm2, possuirProgramaMonitoramento) {

    // lateinit para a variável tipoReserva
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

    println("Qual o tipo da reserva marinha?")

    println("1. Estações Ecológicas")
    println("2. Reservas Biológicas")
    println("3. Parques Nacionais")
    println("4. Monumentos Naturais")
    println("5. Refúgios da Vida Silvestre")
    print("Escolha uma das opções: ")

    val opcao = scanner.nextInt()

    val reservaMarinha = ReservaMarinha(
        TipoAmbiente.LITORANEA, 500.0, true
    )

    // Define o tipo de reserva com base na escolha do usuário
    reservaMarinha.definirTipoReserva(opcao)

    // Exibe os detalhes da reserva marinha
    reservaMarinha.mostrarDetalhes()
}

/*Enumerados (ok)
Comando latenit(ok)
comando with(ok)
data class(ok)
herança e modificadores(acho que deu certo)

Verificar so esse sobre herança e modificadores, não sei se consegui usar como era pra ser.
Criar o input das demais entradas, pro ser possível digitar e ter o resultado.
Fiz so um que foi correspondente ao tipo de reserva marinha, e ai vc escolhe o número e é feito o resultado
 */