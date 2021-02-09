package com.example.nasaspace.mvp.presenter

import com.example.nasaspace.mvp.view.MainView
import com.example.nasaspace.navigation.Screens
import moxy.MvpPresenter
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class MainPresenter() : MvpPresenter<MainView>() {
    @Inject
    lateinit var router : Router

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(Screens.ImageFragment())
    }

    fun backClicked() {
        router.exit()
    }
}