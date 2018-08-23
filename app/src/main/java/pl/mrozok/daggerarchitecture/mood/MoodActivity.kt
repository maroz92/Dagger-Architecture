package pl.mrozok.daggerarchitecture.mood

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import pl.mrozok.daggerarchitecture.common.Logger
import pl.mrozok.daggerarchitecture.R

class MoodActivity : AppCompatActivity() {

    private val logger = Logger()
    private val navigator = MoodNavigator(this, supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood)

        navigator.openHappyFragment()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (R.id.menuSwitchActivity == item.itemId) {
            logger.log("Mood", "openRandomActivity")
            navigator.openRandomActivity()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
