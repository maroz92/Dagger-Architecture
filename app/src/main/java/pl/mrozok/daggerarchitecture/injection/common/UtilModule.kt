package pl.mrozok.daggerarchitecture.injection.common

import dagger.Module
import dagger.Provides
import pl.mrozok.daggerarchitecture.common.Logger
import javax.inject.Singleton

@Module
class UtilModule {

    @Singleton
    @Provides
    fun provideLogger(): Logger = Logger()
}