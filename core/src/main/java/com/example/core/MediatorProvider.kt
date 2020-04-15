package com.example.core

import com.example.core.mediator.FourthScreenMediator
import com.example.core.mediator.SecondScreenMediator
import com.example.core.mediator.ThirdScreenMediator

class MediatorProvider {
    companion object {
        var secondScreenMediator: SecondScreenMediator? = null
        var thirdScreenMediator: ThirdScreenMediator? = null
        var fourthScreenMediator: FourthScreenMediator? = null
    }
}