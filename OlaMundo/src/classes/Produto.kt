package classes

class Produto (val nome : String, val preco : Double) {
    fun exibirDadosProdutos () : String {
        return "Produto nome: $nome e valor R$ $preco"
    }
}