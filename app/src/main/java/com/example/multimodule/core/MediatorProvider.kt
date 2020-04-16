package com.example.multimodule.core

import com.example.multimodule.core.mediator.FourthScreenMediator
import com.example.multimodule.core.mediator.SecondScreenMediator
import com.example.multimodule.core.mediator.ThirdScreenMediator

class MediatorProvider {
    companion object {
        var secondScreenMediator: SecondScreenMediator? = null
        var thirdScreenMediator: ThirdScreenMediator? = null
        var fourthScreenMediator: FourthScreenMediator? = null
    }
}