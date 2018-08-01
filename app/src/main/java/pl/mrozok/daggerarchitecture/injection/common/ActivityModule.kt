package pl.mrozok.daggerarchitecture.injection.common

import android.app.Activity
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: FragmentActivity) {

    @Provides
    fun provideActivity(): Activity = activity

    @Provides
    fun provideFragmentActivity(): FragmentActivity = activity

    @Provides
    fun provideFragmentManager(activity: FragmentActivity): FragmentManager =
            activity.supportFragmentManager
}