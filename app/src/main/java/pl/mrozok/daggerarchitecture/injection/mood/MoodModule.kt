package pl.mrozok.daggerarchitecture.injection.mood

import android.app.Activity
import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides
import pl.mrozok.daggerarchitecture.injection.common.ForActivity
import pl.mrozok.daggerarchitecture.mood.MoodNavigator

@Module
class MoodModule {

    @ForActivity
    @Provides
    fun provideMoodNavigator(activity: Activity,
                             fragmentManager: FragmentManager): MoodNavigator =
            MoodNavigator(activity,
                    fragmentManager)
}