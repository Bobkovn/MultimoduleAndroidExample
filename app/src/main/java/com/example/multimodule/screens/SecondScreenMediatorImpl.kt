package com.example.multimodule.screens

import androidx.fragment.app.FragmentManager
import com.example.multimodule.core.mediator.SecondScreenMediator

class SecondScreenMediatorImpl(private val containerId: Int, private val fragmentManager: FragmentManager) : SecondScreenMediator {

    override fun startSecondFragment() {
        fragmentManager.beginTransaction()
            .replace(containerId,
                SecondFragment()
            )
            .commit()
    }
}