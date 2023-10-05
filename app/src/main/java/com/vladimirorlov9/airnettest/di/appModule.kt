package com.vladimirorlov9.airnettest.di

import com.vladimirorlov9.airnettest.ui.requestscreen.RequestViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        RequestViewModel(

        )
    }
}