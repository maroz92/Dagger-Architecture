package pl.mrozok.daggerarchitecture.injection.mood

import dagger.Subcomponent
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.common.ForActivity
import pl.mrozok.daggerarchitecture.mood.HappyFragment
import pl.mrozok.daggerarchitecture.mood.MoodActivity
import pl.mrozok.daggerarchitecture.mood.SadFragment

@ForActivity
@Subcomponent
(modules = [ActivityModule::class, MoodModule::class])
interface MoodSubcomponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): MoodSubcomponent

        fun activityModule(module: ActivityModule): Builder
    }

    fun inject(activity: MoodActivity)

    fun inject(fragment: HappyFragment)
    fun inject(fragment: SadFragment)
}