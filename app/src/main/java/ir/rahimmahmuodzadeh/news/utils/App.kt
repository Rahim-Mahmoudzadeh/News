package ir.rahimmahmuodzadeh.news.utils

import android.app.Application
import ir.rahimmahmuodzadeh.news.data.api.ApiServiceBuilder
import ir.rahimmahmuodzadeh.news.data.repository.getNews.GetNews
import ir.rahimmahmuodzadeh.news.data.repository.getNews.GetNewsImplantation
import ir.rahimmahmuodzadeh.news.ui.screens.home.HomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val module = module {
            single { ApiServiceBuilder.provideOkHttpClient() }
            single { ApiServiceBuilder.provideRetrofit(get()) }
            single { ApiServiceBuilder.provideApi(get()) }
            factory<GetNews> { GetNewsImplantation(get()) }
            viewModel{HomeViewModel(get())}
        }
        startKoin {
            androidContext(this@App)
            modules(module)
        }
    }
}