package ar.edu.unahur.obj2.socios

//Dato pedido.valor a modo ejemplo
object Pedido { fun valor()= 1000  }
//object dineroEnElBolsillo { fun dineroQueTengo()= 15 }
//val beto = Cliente(EstaFeliz,100,BarrioVerde)
class Cliente(val estadoDeAnimo: EstadoDeAnimo, var dineroQueTengo: Int, val barrioEnQueVive: Barrio ) {

    fun calculoPropinaPorEstadoDeAnimo(): Int {
        return when (estadoDeAnimo) {
            EstaFeliz -> Pedido.valor() / 4
            EsIndiferente -> dineroQueTengo
            EstaResfiado -> Pedido.valor()
            //enojado no da propina
            else -> 0
        }
    }
    fun maximoValor(valor1: Int, valor2:Int ): Int {
        var maximo = valor1
        if (valor2 >= valor1){ maximo = valor2 }
        return maximo
    }

    fun dejaPropina(): Int {
        return when (barrioEnQueVive) {
            LasRosas -> this.calculoPropinaPorEstadoDeAnimo() + 50
            LasLauchas -> this.calculoPropinaPorEstadoDeAnimo() / 2
            //barrioVerde tiene que dar 200 para arriba de propina
            BarrioVerde -> this.maximoValor(this.calculoPropinaPorEstadoDeAnimo(), 200)
            //Las torres no modifica su propina
            else -> this.calculoPropinaPorEstadoDeAnimo()
        }
    }
}
