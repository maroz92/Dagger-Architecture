package pl.mrozok.daggerarchitecture.injection.host

import dagger.Component
import pl.mrozok.daggerarchitecture.host.AwesomeFragment
import pl.mrozok.daggerarchitecture.host.HostActivity
import pl.mrozok.daggerarchitecture.host.NotSoAwesomeFragment
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.common.AppComponent
import pl.mrozok.daggerarchitecture.injection.common.ForActivity

@ForActivity
@Component(modules = [ActivityModule::class, HostModule::class],
        dependencies = [AppComponent::class])
interface HostComponent {

    fun inject(activity: HostActivity)

    fun inject(fragment: AwesomeFragment)
    fun inject(fragment: NotSoAwesomeFragment)
}