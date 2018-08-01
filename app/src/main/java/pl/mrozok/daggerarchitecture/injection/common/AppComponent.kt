package pl.mrozok.daggerarchitecture.injection.common

import dagger.Component
import pl.mrozok.daggerarchitecture.common.Logger
import pl.mrozok.daggerarchitecture.random.RandomContent
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilModule::class, DataModule::class])
interface AppComponent {

    fun provideLogger(): Logger
    fun provideRandomContent(): RandomContent
}