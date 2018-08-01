package pl.mrozok.daggerarchitecture.common

import android.app.Application
import pl.mrozok.daggerarchitecture.injection.common.AppComponent
import pl.mrozok.daggerarchitecture.injection.common.DaggerAppComponent

class MyApplication : Application() {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }
}