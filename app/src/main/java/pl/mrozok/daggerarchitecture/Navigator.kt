package pl.mrozok.daggerarchitecture

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager

class Navigator(private val fragmentManager: FragmentManager) {

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
}