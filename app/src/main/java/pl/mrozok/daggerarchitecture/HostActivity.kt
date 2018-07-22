package pl.mrozok.daggerarchitecture

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class HostActivity : AppCompatActivity() {

    private val navigator = Navigator(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)

        navigator.openAwesomeFragment()
    }
}
