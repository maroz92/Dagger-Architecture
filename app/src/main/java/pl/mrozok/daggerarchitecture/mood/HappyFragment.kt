package pl.mrozok.daggerarchitecture.mood

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content.*
import pl.mrozok.daggerarchitecture.R
import pl.mrozok.daggerarchitecture.common.Logger

class HappyFragment : Fragment() {

    private val logger = Logger()
    private lateinit var navigator: MoodNavigator

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_content, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigator = MoodNavigator(activity!!, activity!!.supportFragmentManager)
        fragment_button.setText(R.string.bad_day)
        fragment_button.setOnClickListener { onChangeFragmentClick() }
        fragment_emoji.setText(R.string.smile)
    }

    private fun onChangeFragmentClick() {
        logger.log("Mood", "openSadFragment")
        navigator.openSadFragment()
    }
}