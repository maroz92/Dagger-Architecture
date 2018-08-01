package pl.mrozok.daggerarchitecture.injection.random

import android.app.Activity
import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides
import pl.mrozok.daggerarchitecture.random.RandomNavigator

@Module
class RandomModule {

    @Provides
    fun provideRandomNavigator(activity: Activity,
                               fragmentManager: FragmentManager): RandomNavigator =
            RandomNavigator(activity,
                    fragmentManager)
}