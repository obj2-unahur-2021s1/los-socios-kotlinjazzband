package ar.edu.unahur.obj2.socios

//Dato pedido.valor a modo ejemplo
object pedido{
 fun valor()= 1000
 }

class Cliente(val estadoDeAnimo: EstadoDeAnimo, val plataEnBolsillo: Int, val barrioEnQueVive: Barrio ) {

    fun calculoPropinaPorEstadoDeAnimo(estadoDeAnimo: EstadoDeAnimo): Int {
        return when (estadoDeAnimo){
            estaFeliz -> pedido.valor()/4
            esIndiferente -> plataEnBolsillo
            estaResfiado -> pedido.valor()
            //enojado no da propina
            else -> 0
        }
    }

    fun dejaPropina(): Int{
        return when (barrioEnQueVive) {
            lasRosas -> this.calculoPropinaPorEstadoDeAnimo(estadoDeAnimo) + 50
            lasLauchas -> this.calculoPropinaPorEstadoDeAnimo(estadoDeAnimo)/2
            //barrioVerde tiene que dar 200 para arriba de propina
            barrioVerde -> this.calculoPropinaPorEstadoDeAnimo(estadoDeAnimo)
            //Las torres no modifica su propina
            else -> this.calculoPropinaPorEstadoDeAnimo(estadoDeAnimo)
        }
    }
}