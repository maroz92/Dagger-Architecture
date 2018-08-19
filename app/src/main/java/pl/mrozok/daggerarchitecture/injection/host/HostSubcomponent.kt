package pl.mrozok.daggerarchitecture.injection.host

import dagger.Subcomponent
import pl.mrozok.daggerarchitecture.host.AwesomeFragment
import pl.mrozok.daggerarchitecture.host.HostActivity
import pl.mrozok.daggerarchitecture.host.NotSoAwesomeFragment
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.common.ForActivity

@ForActivity
@Subcomponent
(modules = [ActivityModule::class, HostModule::class])
interface HostSubcomponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): HostSubcomponent

        fun activityModule(module: ActivityModule): Builder
    }

    fun inject(activity: HostActivity)

    fun inject(fragment: AwesomeFragment)
    fun inject(fragment: NotSoAwesomeFragment)
}