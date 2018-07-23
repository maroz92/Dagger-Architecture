package pl.mrozok.daggerarchitecture.random

import android.app.Activity
import android.content.Intent
import android.support.v4.app.FragmentManager
import pl.mrozok.daggerarchitecture.R
import pl.mrozok.daggerarchitecture.host.HostActivity

class RandomNavigator(private val activity: Activity,
                      private val fragmentManager: FragmentManager) {

    fun openRandomFragment(stringEmoji: String) {
        fragmentManager.beginTransaction()
                .replace(R.id.random_content_container, RandomFragment.create(stringEmoji))
                .commit()
    }

    fun openHostActivity() {
        Intent(activity, HostActivity::class.java).run {
            activity.startActivity(this)
        }
        activity.finish()
    }
}