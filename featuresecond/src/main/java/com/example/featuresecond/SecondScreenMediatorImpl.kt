package com.example.featuresecond

import androidx.fragment.app.FragmentManager
import com.example.core.mediator.SecondScreenMediator

class SecondScreenMediatorImpl(private val containerId: Int, private val fragmentManager: FragmentManager) : SecondScreenMediator {

    override fun startSecondFragment() {
        fragmentManager.beginTransaction()
            .replace(containerId, SecondFragment())
            .commit()
    }
}