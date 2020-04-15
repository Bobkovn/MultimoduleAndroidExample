package com.example.featurefourth

import androidx.fragment.app.FragmentManager
import com.example.core.mediator.FourthScreenMediator

class FourthScreenMediatorImpl(private val containerId: Int, private val fragmentManager: FragmentManager) :
    FourthScreenMediator {

    override fun startFourthFragment() {
        fragmentManager.beginTransaction()
            .replace(containerId, FourthFragment())
            .commit()
    }
}