package pl.mrozok.daggerarchitecture.injection.common

import dagger.Module
import dagger.Provides
import pl.mrozok.daggerarchitecture.common.Logger

@Module
class UtilModule {

    @Provides
    fun provideLogger(): Logger = Logger()
}