package pl.mrozok.daggerarchitecture.injection.common

import dagger.Component
import pl.mrozok.daggerarchitecture.injection.host.HostSubcomponent
import pl.mrozok.daggerarchitecture.injection.random.RandomSubcomponent
import javax.inject.Singleton

@Singleton
@Component(modules = [UtilModule::class])
interface AppComponent {

    fun hostSubcomponent(): HostSubcomponent.Builder
    fun randomSubcomponent(): RandomSubcomponent.Builder
}