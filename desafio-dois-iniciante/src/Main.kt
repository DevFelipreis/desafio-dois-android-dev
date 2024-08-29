fun main() {
    println("Informações sobre o Parque Nacional Marinho de Abrolhos:")
    println("\n")
    println("(1) Ambiente marinho")
    println("(2) Áreas de Proteção Ambiental")
    println("(3) Manutenção do serviço de monitoramento")
    println("(4) Espécies em extinção")
    println("Escolha um número para continuar: ")
    class informacoes(var userinput:Int)
    var number: Int
    val simpleArray = arrayOf("Anêmona-gigante", "Aruanã", "Baleia-franca", "Baleia-jubarte", "Budião-azul", "Careba-amarela", "Careba-dura", "Coral-de-fogo",
        "Estrela-do-mar", "Gorgônia", "Grama", "Néon", "Ouriço-satélite", "Pepino-do-mar", "Rabo-de-junco-de-bico-laranja", "Rabo-de-junco-de-bico-vermelho",
        "Tartaruga de couro", "Tartaruga-amarela", "Tartaruga-cabeçuda", "Tartaruga-de-pente", "Tartaruga-marinha", "Tartaruga-meio-pente", "Tartaruga-mestiça",
        "Tartaruga-verde", "Tubarão-baleia", "Tubarão-limão", "Tubarão-lixa", "Uruanã")
    init {
        number = if (userinput == 1) {
            println(
                "O Parque Nacional Marinho de Abrolhos (PARNAM) apresenta um complexo ecossistema marinho, com águas transparentes, relativamente"
                        println ("\n")
                "calmas e com profundidade média de 5 metros. Ele abriga uma fauna marinha diversa, com 400 espécies de peixes, bem como espécies"
                        println ("\n")
                "notáveis como baleias-jubarte, golfinhos nariz-de-garrafa, botos-cinza, baleias francas austrais, tartarugas, e inúmeras espécies"
                        println ("\n")
                "de moluscos e esponjas. Sua flora marinha conta com 215 macroalgas e 2 angiospermas marinhas. As macroalgas são representadas por"
                        println ("\n")
                "116 rodófitas, 57 clorófitas, 42 feófitas e 16 espécies de corais. As plantas desempenham um papel importante na manutenção dos"
                        println ("\n")
                "ecossistemas terrestres das ilhas, fornecendo habitat e alimento para outras formas de vida."
            )
        }else if (userinput == 2)
            println(
                "APA Ponta da Baleia/Abrolhos. \n" +
                        "A APA Ponta da Baleia/Abrolhos possui 346.535 hectares e foi criada em 1993. Está localizada nos municípios de Alcobaça e Caravelas."
            )
        }else if (userinput == 3)
        println("Os monitoramentos da biodiversidade são uma poderosa ferramenta para a gestão da área protegida em que é possível avaliar a"
                println("\n")
            "efetividade das Unidades de Conservação (UC) para a conservação da biodiversidade em especial de espécies alvo de conservação."
                    println("\n")
            "O Parque Nacional Marinho dos Abrolhos está desenvolvendo programas de monitoramento da biodiversidade, visitação e manejo de"
                    println("\n")
            "espécies exóticas. Estes programas visam monitorar e acompanhar as tendências populacionais de espécies alvo de conservação do"
                    println("\n")
            "Parque, tais como, tartarugas marinhas, recifes de coral, baleias jubarte, aves marinhas, entre outras. Os programas estão sendo"
                    println("\n")
            "desenvolvidos a partir de parceria com os Centros de Pesquisas especializados do ICMBio, em que busca-se aplicar protocolos nacionais"
                    println("\n")
            "para a coleta de dados. Além de gerar uma base de dados sólida e com rigor científico, os monitoramentos trazem outros ganhos para a UC,"
                    println("\n")
            "como a capacitação da equipe, engajamento e valorização dos voluntários, divulgação da UC em congressos e mídias sociais, além de servir"
            "de subsídio para outras pesquisas científicas.)"
            else if (userinput == 4)
        println(simpleArray.joinToString())
        }else{
        println("Entrada inválida. Por favor insira um número.")
        return
    }