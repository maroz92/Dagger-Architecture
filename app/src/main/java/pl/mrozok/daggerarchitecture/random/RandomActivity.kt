package pl.mrozok.daggerarchitecture.random

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_random.*
import pl.mrozok.daggerarchitecture.common.Logger
import pl.mrozok.daggerarchitecture.R

class RandomActivity : AppCompatActivity() {

    private val logger = Logger()
    private lateinit var content: RandomContent
    private val navigator = RandomNavigator(this, supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        content = RandomContent()
        navigator.openRandomFragment(content.getRandomEmoji())
        random_get_new.setOnClickListener { onRandomClick() }
    }

    private fun onRandomClick() {
        logger.log("Random", "openRandomFragment")
        navigator.openRandomFragment(content.getRandomEmoji())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (R.id.menuSwitchActivity == item.itemId) {
            logger.log("Random", "openMoodActivity")
            navigator.openMoodActivity()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
