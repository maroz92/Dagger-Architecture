package pl.mrozok.daggerarchitecture.host

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import pl.mrozok.daggerarchitecture.R
import pl.mrozok.daggerarchitecture.common.Logger
import pl.mrozok.daggerarchitecture.common.MyApplication
import pl.mrozok.daggerarchitecture.injection.common.ActivityModule
import pl.mrozok.daggerarchitecture.injection.host.DaggerHostComponent
import pl.mrozok.daggerarchitecture.injection.host.HostComponent
import javax.inject.Inject

class HostActivity : AppCompatActivity() {

    @Inject
    lateinit var logger: Logger
    @Inject
    lateinit var navigator: HostNavigator

    lateinit var hostComponent: HostComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hostComponent = DaggerHostComponent.builder()
                .appComponent(getMyApplication().appComponent)
                .activityModule(ActivityModule(this))
                .build()
        hostComponent.inject(this)
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

    private fun getMyApplication(): MyApplication = application as MyApplication
}
