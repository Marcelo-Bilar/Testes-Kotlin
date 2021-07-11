fun main(argumentos : Array<String>) {

    if(argumentos.isEmpty()) {
        println("Favor informar um argumento válido")
        return
    }

    val numero = argumentos[0].toIntOrNull()

    if(numero == null){
        println("O Valor informado não é um número valido")
    }
    println("O número digitado foi $numero")

    var soma: Int = 0
    if (numero != null) {
        soma = numero + numero
    }
    println("A soma do número + número é de $soma")
}