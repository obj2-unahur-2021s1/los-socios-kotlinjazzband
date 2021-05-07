package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    //val beto = Cliente()
    //val estadoDeAnimo=EstaFeliz
    //val dineroQueTengo=100
    //val barrioEnQueVive=BarrioVerde
    val beto = Cliente(EstaFeliz,100,BarrioVerde)
// Test para propinas


    describe("Valor de pedido") {
      it("cuanto vale el pedido") {
        Pedido.valor().shouldBe(1000)

      }
    }
    describe("Calculo Propina Por Estado De Animo: EstaFeliz") {
        it("calculo Propina Por Estado De Animo") {
          beto.calculoPropinaPorEstadoDeAnimo().shouldBe(250)

        }
      }
        describe("Propina con EstaFeliz y BarrioVerde") {
      it("deja Propina ") {
        beto.dejaPropina().shouldBe(250)

      }
    }


  }
})
