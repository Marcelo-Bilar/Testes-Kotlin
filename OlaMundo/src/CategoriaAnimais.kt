import classes.Ave
import classes.Mamifero
import classes.Peixe
import classes.Reptil

/*
    Escrever um programa
    Que receba um nome de animal vertebrado
    Identifica a qual dos grupos ele pertence (mamifero, peixe, ave, reptil)
    Exibir dados genericos e especificos de cada grupo animal
*/
fun main() {
    print("Favor informar um animal vertebrado para anilise: ")
    val animalInformado = readLine()
    if(animalInformado.isNullOrEmpty() || animalInformado.isNullOrBlank()){
        print("Favor informar o animal vertebrado que deseja identificar! ")
        return
    }

    val listaDeAnimaisBancoDados = arrayOf(
        Peixe(nome="Tubarão", qtdNadadeiras= 2),
        Mamifero(nome="Leão",qtdMamas = 4),
        Ave(nome = "Gavião", qtdPenas = 500, consegueFazerMigracao = true),
        Reptil(nome = "Cobra", temperaturaCorporal = 8.0)
    )

    val animalSelecionado = listaDeAnimaisBancoDados.find { it.nome.equals(animalInformado, ignoreCase = true)}
    if (animalSelecionado == null){
        println("Animal informado não está na nossa base, tente novamente.")
        return
    }
    when(animalSelecionado){
        is Mamifero -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Mamifero e tem as seguintes caracteristicas: " +
                               "É aquatico: ${animalSelecionado.isMamiferoAquatico}, tem ${animalSelecionado.qtdMamas} Mamas e consegue botar ovo: ${animalSelecionado.consegueBotarOvo}")

        is Reptil -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Reptil e tem as seguintes caracteristicas: " +
                             "A temperatura corporal é: ${animalSelecionado.temperaturaCorporal}, é terrestre: ${animalSelecionado.isReptilTerrestre} " +
                             "e tem ${animalSelecionado.qtdPatas} patas")

        is Peixe -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Peixe e tem as seguintes caracteristicas: " +
                "É de água salgada: ${animalSelecionado.isPeixeAguaSalgada}, tem ${animalSelecionado.qtdNadadeiras} nadadeiras e é carnivoro: ${animalSelecionado.isCarnivoro}")

        is Ave -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é uma ave e tem as seguintes caracteristicas: " +
                "Consegue voar: ${animalSelecionado.consegueVoar}, tem ${animalSelecionado.qtdPenas} Penas e consegue fazer migração: ${animalSelecionado.consegueFazerMigracao}")
        else -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um animal não identificado")
    }

}