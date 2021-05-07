package ar.edu.unahur.obj2.socios

class Cliente(var pedido: Int, val estadoDeAnimo: EstadoDeAnimo, var dineroQueTengo: Int, val barrioEnQueVive: Barrio ) {

    fun calculoPropinaPorEstadoDeAnimo(): Int {
        return when (estadoDeAnimo) {
            EstaFeliz -> pedido / 4
            EsIndiferente -> dineroQueTengo
            EstaResfiado -> pedido
            //enojado no da propina
            else -> 0
        }
    }

    fun maximoValor(valor1: Int, valor2:Int ): Int {
        var maximo = valor1
        if (valor2 >= valor1){ maximo = valor2 }
        return maximo
    }

    fun valorDePropinaSiViveEn(): Int {
        return when (barrioEnQueVive) {
            LasRosas -> this.calculoPropinaPorEstadoDeAnimo() + 50
            LasLauchas -> this.calculoPropinaPorEstadoDeAnimo() / 2
            BarrioVerde -> this.maximoValor(this.calculoPropinaPorEstadoDeAnimo(), 200)
            else -> this.calculoPropinaPorEstadoDeAnimo()
        }
    }
}