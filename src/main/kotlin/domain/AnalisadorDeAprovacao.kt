package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    private lateinit var criterioDeAprovacao: CriterioDeAprovacao

    fun defineCriterio(c: CriterioDeAprovacao) {
        this.criterioDeAprovacao = c
    }

    fun fechaBoletim(b: Boletim): BoletimFechado {
        return BoletimFechado(
            b.mediaEPs,
            b.mediaMiniEPs,
            criterioDeAprovacao.mediaFinal(b),
            criterioDeAprovacao.estaAprovado(b)
        )
    }

}
