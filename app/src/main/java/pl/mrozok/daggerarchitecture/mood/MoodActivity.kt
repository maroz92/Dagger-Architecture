package pl.mrozok.daggerarchitecture.mood

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import pl.mrozok.daggerarchitecture.R
import pl.mrozok.daggerarchitecture.common.Logger
import pl.mrozok.daggerarchitecture.common.MyApplication
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.mood.MoodSubcomponent
import javax.inject.Inject

class MoodActivity : AppCompatActivity() {

    @Inject
    lateinit var logger: Logger
    @Inject
    lateinit var navigator: MoodNavigator

    lateinit var moodSubcomponent: MoodSubcomponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mood)
        moodSubcomponent = getMyApplication().appComponent.moodSubcomponent()
                .activityModule(ActivityModule(this))
                .build()
        moodSubcomponent.inject(this)
        setContentView(R.layout.activity_mood)

        navigator.openHappyFragment()
    }

    private fun getMyApplication(): MyApplication = application as MyApplication

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
