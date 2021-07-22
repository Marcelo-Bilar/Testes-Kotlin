import classes.Produto

/*
    -> Escrever um programa - Ok
    -> Receber alguns produtos como argumento - Ok
    -> validar se esse produtos estão na lista de itens disponíveis do mercado - Ok
    -> Caso Estejam, avisar o usuario quais produtos estão disponiveis - Ok
    -> e quais não estão
    -> Exibir a lista de produtos disponives ordenados por ordem alfábetica
*/
fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        print("Favor informar a lista de produtos que deseja comprar")
        return
    }

    val itensDisponiveis = arrayOf(
        Produto(nome="Arroz", 35.10),
        Produto(nome="Azeite", 16.90),
        Produto(nome="Carne", 59.69),
        Produto(nome="Açucar", 2.40),
    )

    val itensSelecionadosDisponiveis = itensDisponiveis.filter {
            produto -> argumentos.any { argumento ->
                    argumento.equals(produto.nome, ignoreCase = true)
            }
    }

    for(itenSelecionadoDisponivel in itensSelecionadosDisponiveis){
        println(itenSelecionadoDisponivel.exibirDadosProdutos())
    }

    val argumentosSelecionadosNaoDisponiveis = argumentos.filter {
            argumento -> !itensDisponiveis.any {
            produto-> produto.nome.equals(argumento, ignoreCase = true) }
    }

    argumentosSelecionadosNaoDisponiveis.forEach{
        argumento -> println("O produto: $argumento não está disponível")
    }

    itensDisponiveis.sortBy { it.nome }
    itensDisponiveis.forEach { println("Confira este produto disponivel ${it.exibirDadosProdutos()}") }
}

