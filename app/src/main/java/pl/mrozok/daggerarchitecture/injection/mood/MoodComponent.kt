package pl.mrozok.daggerarchitecture.injection.mood

import dagger.Component
import pl.mrozok.daggerarchitecture.mood.HappyFragment
import pl.mrozok.daggerarchitecture.mood.MoodActivity
import pl.mrozok.daggerarchitecture.mood.SadFragment
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.common.AppComponent
import pl.mrozok.daggerarchitecture.injection.common.ForActivity

@ForActivity
@Component(modules = [ActivityModule::class, MoodModule::class],
        dependencies = [AppComponent::class])
interface MoodComponent {

    fun inject(activity: MoodActivity)

    fun inject(fragment: HappyFragment)
    fun inject(fragment: SadFragment)
}