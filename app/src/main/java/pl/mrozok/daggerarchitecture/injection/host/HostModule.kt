package pl.mrozok.daggerarchitecture.injection.host

import android.app.Activity
import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides
import pl.mrozok.daggerarchitecture.host.HostNavigator
import pl.mrozok.daggerarchitecture.injection.common.ForActivity

@Module
class HostModule {

    @ForActivity
    @Provides
    fun provideHostNavigator(activity: Activity,
                             fragmentManager: FragmentManager): HostNavigator =
            HostNavigator(activity,
                    fragmentManager)
}