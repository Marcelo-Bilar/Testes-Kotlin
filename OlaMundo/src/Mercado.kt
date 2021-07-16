import java.util.*

fun main(argumentos: Array<String>) {

    if(argumentos.isEmpty()){
        println("Favor informar sua lista de produtos para " +
                "verificarmos a disponibilidade")
        return
    }

    val produtosDisponiveis = arrayOf("PÃO", "BOLACHA", "QUEIJO", "ARROZ", "FEIJÃO",
            "OVO", "FRANGO", "AZEITE", "OLEO")

    val produtoRequisitadosDisponiveis = argumentos.filter {
    produtoRequisitado -> produtosDisponiveis.contains(produtoRequisitado.uppercase(Locale.getDefault()))
    }

    for(produtoRequisitadoDisponiveis in produtoRequisitadosDisponiveis){
        println("Este produto nós temos ${produtoRequisitadoDisponiveis.uppercase(Locale.getDefault())}")
    }
    val produtosRequisitadosNaoDisponivel = argumentos.filter {
        produtoRequisitado -> !produtosDisponiveis.contains(produtoRequisitado.uppercase(Locale.getDefault()))
    }

    produtosRequisitadosNaoDisponivel.forEach{ produtoNaoDisponives -> println("Este produto nós" +
            " não temos infelizmente ${produtoNaoDisponives.uppercase(Locale.getDefault())}")
    }

    val produtosOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponível: $produto") }
}





