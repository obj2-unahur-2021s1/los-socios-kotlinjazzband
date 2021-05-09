package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val jose = Cliente(260, EstaEnojado,100,BarrioVerde)
    val julian = Cliente(3000, EsIndiferente,20, LasTorres)
    val fer = Cliente(260, EstaResfiado,100,LasLauchas)
    val beto = Cliente(1000, EstaFeliz,100,BarrioVerde)
    val claudia = Cliente(1500, EstaResfiado,37, LasLauchas)
    val liliana = Cliente(780, EstaResfiado, 23,LasRosas)

    // Test para propinas
    describe("Calculo propina para liliana por estado De Animo: EstaResfriado") {
      it("calculo Propina solo Por Estado De Animo de liliana") {
        liliana.calculoPropinaPorEstadoDeAnimo().shouldBe(780)
      }
    }
    describe("Propina con animo EstaResfriado y vive las Rosas") {
      it("claudia deja Propina si vive en BarrioVerde (suma $ 50)") {
        liliana.valorDePropinaSiViveEn().shouldBe(830)
      }
    }

    describe("Calculo propina por Estado De Animo: EstaResfriado") {
      it("calculo Propina solo Por Estado De Animo de Claudia") {
        claudia.calculoPropinaPorEstadoDeAnimo().shouldBe(1500)
      }
    }
    describe("Propina con animo EstaResfriado y vive las lauchas") {
      it("claudia deja Propina si vive en BarrioVerde (supera minimo)") {
        claudia.valorDePropinaSiViveEn().shouldBe(750)
      }
    }

    describe("Calculo Propina Por Estado De Animo: EstaEnojado") {
      it("calculo Propina solo Por Estado De Animo de jose") {
        jose.calculoPropinaPorEstadoDeAnimo().shouldBe(0)
      }
    }
    describe("Propina con animo EstaEnojado y vive BarrioVerde") {
      it("jose deja Propina si vive en BarrioVerde (minimo)") {
        jose.valorDePropinaSiViveEn().shouldBe(200)
      }
    }

    describe("Calculo Propina Por Estado De Animo: EsIndiferente") {
      it("calculo Propina solo Por Estado De Animo de julian") {
        julian.calculoPropinaPorEstadoDeAnimo().shouldBe(20)
      }
    }
    describe("Propina con animo EstaEnojado y vive Las Torres") {
      it("julian deja Propina si vive en BarrioVerde (minimo)") {
        julian.valorDePropinaSiViveEn().shouldBe(20)
      }
    }

    describe("Calculo Propina Por Estado De Animo: EstaResfiado") {
      it("calculo Propina solo Por Estado De Animo de fer") {
        fer.calculoPropinaPorEstadoDeAnimo().shouldBe(260)
      }
    }
    describe("Propina con animo EstaEnojado y vive LasLauchas") {
      it("fer deja Propina si vive en las lauchas Divide x 2") {
        fer.valorDePropinaSiViveEn().shouldBe(130)
      }
    }

    describe("Calculo Propina Por Estado De Animo: EstaFeliz") {
        it("calculo Propina solo Por Estado De Animo de beto") {
          beto.calculoPropinaPorEstadoDeAnimo().shouldBe(250)
        }
      }
    describe("Propina con animo EstaFeliz y BarrioVerde") {
      it("beto deja Propina de beto ") {
        beto.valorDePropinaSiViveEn().shouldBe(250)
      }
    }

  }
})
