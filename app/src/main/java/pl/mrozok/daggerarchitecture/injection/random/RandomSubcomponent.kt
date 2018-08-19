package pl.mrozok.daggerarchitecture.injection.random

import dagger.Subcomponent
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.common.ForActivity
import pl.mrozok.daggerarchitecture.random.RandomActivity

@ForActivity
@Subcomponent(modules = [ActivityModule::class, RandomModule::class])
interface RandomSubcomponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): RandomSubcomponent
        fun activityModule(module: ActivityModule): Builder
    }

    fun inject(activity: RandomActivity)
}