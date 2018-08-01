package pl.mrozok.daggerarchitecture.random

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_random.*
import pl.mrozok.daggerarchitecture.R
import pl.mrozok.daggerarchitecture.common.Logger
import pl.mrozok.daggerarchitecture.common.MyApplication
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.host.DaggerHostComponent
import pl.mrozok.daggerarchitecture.injection.random.DaggerRandomComponent
import javax.inject.Inject

class RandomActivity : AppCompatActivity() {

    @Inject
    lateinit var logger: Logger
    @Inject
    lateinit var content: RandomContent
    @Inject
    lateinit var navigator: RandomNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerRandomComponent.builder()
                .appComponent(getMyApplication().appComponent)
                .build()
                .inject(this)
        setContentView(R.layout.activity_random)

        content = RandomContent()
        navigator.openRandomFragment(content.getRandomEmoji())
        random_get_new.setOnClickListener { onRandomClick() }
    }

    private fun onRandomClick() {
        navigator.openRandomFragment(content.getRandomEmoji())
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (R.id.menuSwitchActivity == item.itemId) {
            navigator.openHostActivity()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getMyApplication(): MyApplication = application as MyApplication
}
