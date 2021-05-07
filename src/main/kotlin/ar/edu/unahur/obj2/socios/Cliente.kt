package ar.edu.unahur.obj2.socios

//Dato pedido.valor a modo ejemplo
object pedido{ fun valor()= 1000  }
object DineroEnElBolsillo { fun dineroQueTengo()= 15 }

class Cliente(val estadoDeAnimo: EstadoDeAnimo, val dineroQueTengo: DineroEnElBolsillo, val barrioEnQueVive: Barrio ) {

    fun calculoPropinaPorEstadoDeAnimo(estadoDeAnimo: EstadoDeAnimo): Int {
        return when (estadoDeAnimo) {
            estaFeliz -> pedido.valor() / 4
            esIndiferente -> DineroEnElBolsillo.dineroQueTengo()
            estaResfiado -> pedido.valor()
            //enojado no da propina
            else -> 0
        }
    }
    fun maximoValor(valor1: Int, valor2:Int ): Int {
        var maximo = valor1
        if (valor2 >= valor1){ maximo = valor2 }
        return maximo
    }

    fun dejaPropina(barrioEnQueVive: Barrio): Int {
        return when (barrioEnQueVive) {
            lasRosas -> this.calculoPropinaPorEstadoDeAnimo(estadoDeAnimo) + 50
            lasLauchas -> this.calculoPropinaPorEstadoDeAnimo(estadoDeAnimo) / 2
            //barrioVerde tiene que dar 200 para arriba de propina
            barrioVerde -> this.maximoValor(calculoPropinaPorEstadoDeAnimo(estadoDeAnimo), 200)
            //Las torres no modifica su propina
            else -> this.calculoPropinaPorEstadoDeAnimo(estadoDeAnimo)
        }
    }
}