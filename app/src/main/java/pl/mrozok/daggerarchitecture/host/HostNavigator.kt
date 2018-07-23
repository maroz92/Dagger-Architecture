package pl.mrozok.daggerarchitecture.host

import android.app.Activity
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import pl.mrozok.daggerarchitecture.R
import pl.mrozok.daggerarchitecture.random.RandomActivity

class HostNavigator(private val activity: Activity,
                    private val fragmentManager: FragmentManager) {

    fun openAwesomeFragment() {
        changeFragment(AwesomeFragment())
    }

    fun openNotSoAwesomeFragment() {
        changeFragment(NotSoAwesomeFragment())
    }

    private fun changeFragment(fragment: Fragment) {
        fragmentManager.beginTransaction()
                .replace(R.id.host_content_container, fragment)
                .commit()
    }

    fun openRandomActivity() {
        Intent(activity, RandomActivity::class.java).run {
            activity.startActivity(this)
        }
        activity.finish()
    }
}