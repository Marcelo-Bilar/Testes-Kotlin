import classes.FormaDePagamento
import classes.FormaPagamentoBoleto
import classes.FormaPagamentoEnum.Boleto
import classes.FormaPagamentoEnum.Pix
import classes.FormaPagamentoPix
import classes.Produto

fun main(argumentos : Array<String>) {
    if (argumentos.isEmpty()){
        println("Favor informar os produtos a serem comprados")
        return
    }

    val produtosDisponiveis = arrayOf(
        Produto(nome="Tenis",290.0),
        Produto(nome ="Bola",220.0)
    )

    val produtosSelecionados = produtosDisponiveis.filter {
        argumentos.any { argumentos -> it.nome.equals(argumentos, ignoreCase = true)}
    }

    if(produtosSelecionados.isEmpty()){
        println("Os produtos selecionados não estão disponiveis")
        return
    }

    println("Favor informar a forma de pagamento desejada (Boleto, Pix)")
    val formaPagamentoSelecionada = readLine()

    if(formaPagamentoSelecionada.isNullOrEmpty() || formaPagamentoSelecionada.isNullOrBlank()){
        println("Favor informar uma forma de pagamento válida")
        return
    }

    val formaPagamento : FormaDePagamento = if(formaPagamentoSelecionada == Pix.toString()){
        FormaPagamentoPix()
    } else if (formaPagamentoSelecionada == Boleto.toString()){
        FormaPagamentoBoleto()
    } else {
        FormaDePagamento()
    }

    println("Seus produtos selecionados")
    produtosSelecionados.forEach { println(it.exibirDadosProdutos()) }
    formaPagamento.efetuarPagamento()
}