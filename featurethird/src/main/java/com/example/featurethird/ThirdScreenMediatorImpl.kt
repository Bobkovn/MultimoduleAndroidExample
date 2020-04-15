package com.example.featurethird

import androidx.fragment.app.FragmentManager
import com.example.core.mediator.ThirdScreenMediator

class ThirdScreenMediatorImpl(private val containerId: Int, private val fragmentManager: FragmentManager) :
    ThirdScreenMediator {

    override fun startThirdFragment() {
        fragmentManager.beginTransaction()
            .replace(containerId, ThirdFragment())
            .commit()
    }
}