package pl.mrozok.daggerarchitecture.injection.common

import dagger.Module
import dagger.Provides
import pl.mrozok.daggerarchitecture.random.RandomContent
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    @Provides
    fun provideRandomContent(): RandomContent =
            RandomContent()
}