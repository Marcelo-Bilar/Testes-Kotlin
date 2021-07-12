fun main() {

    print("Favor informar o nome do convidado: ")
    val nome = readLine()

    if (nome.isNullOrEmpty() || nome.isNullOrBlank()) {
        println("Nome informado não é válido")
        return
    }

    print("Favor informar a idade do convidado: ")
    val idade = readLine()?.toIntOrNull()

    if (idade == null || idade <= 0) {
        println("Favor informar uma idade válida")
        return
    }

    var estaconvidado = false
    when(nome){
        "Marcelo" -> estaconvidado = true
        "Victor" -> estaconvidado = true
        "Wallison" -> estaconvidado = true
        "Rayane" -> estaconvidado = true
        "Ryan" -> estaconvidado = true
         else -> estaconvidado = false
    }

    if(estaconvidado && idade >= 18) {
        println("Bem vindo a festa!")
    }else if (!estaconvidado) {
        println("você não está na lista de convidados, verifique com a pessoa que te chamou")
    }else {
        println("você não tem idade para entrar na festa")
    }
}