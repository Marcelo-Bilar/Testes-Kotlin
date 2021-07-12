import java.math.BigDecimal

fun calculaoperacao(primeironumero: BigDecimal, operador: String, segundonumero: BigDecimal) : BigDecimal {
    when(operador){
        "+" -> return primeironumero + segundonumero
        "-" -> return primeironumero - segundonumero
        "*" -> return primeironumero * segundonumero
        "/" -> return primeironumero / segundonumero
        "%" -> return primeironumero % segundonumero
        else -> return BigDecimal.ZERO
    }
}

fun main(){

    print("Digite um número: ")
    val primeironumero = readLine()?.toBigDecimalOrNull()

    if(primeironumero == null){
        println("Primeiro número inválido")
        return
    }

    print("Digite um operador válido (+, -, *, /, ,%): ")
    val operador = readLine()

    if(operador.isNullOrEmpty() || operador.isNullOrBlank() ||
        (operador != null && operador != "+" && operador != "-" && operador != "*"
                && operador != "/" && operador != "%")){
        print("Operador inválido")
        return
    }

    print("Digite o segundo número: ")
    val segundonumero = readLine()?.toBigDecimalOrNull()

    if(segundonumero == null){
        println("Primeiro número inválido")
        return
    }

    val resultado = calculaoperacao(primeironumero, operador, segundonumero)
    println("O resultado da operação é igual a: $resultado")
}
