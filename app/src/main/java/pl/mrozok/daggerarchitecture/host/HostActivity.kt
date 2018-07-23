package pl.mrozok.daggerarchitecture.host

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import pl.mrozok.daggerarchitecture.Logger
import pl.mrozok.daggerarchitecture.R

class HostActivity : AppCompatActivity() {

    private val logger = Logger()
    private val navigator = HostNavigator(this, supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)

        navigator.openAwesomeFragment()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (R.id.menuSwitchActivity == item.itemId) {
            navigator.openRandomActivity()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
