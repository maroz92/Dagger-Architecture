package pl.mrozok.daggerarchitecture.injection.common

import dagger.Module
import pl.mrozok.daggerarchitecture.random.RandomContent
import javax.inject.Singleton

@Module
class DataModule {

    @Singleton
    fun provideRandomContent(): RandomContent =
            RandomContent()
}