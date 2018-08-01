package pl.mrozok.daggerarchitecture.injection.random

import dagger.Component
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.common.AppComponent
import pl.mrozok.daggerarchitecture.injection.common.ForActivity
import pl.mrozok.daggerarchitecture.random.RandomActivity

@ForActivity
@Component(modules = [ActivityModule::class, RandomModule::class],
        dependencies = [AppComponent::class])
interface RandomComponent {

    fun inject(activity: RandomActivity)
}