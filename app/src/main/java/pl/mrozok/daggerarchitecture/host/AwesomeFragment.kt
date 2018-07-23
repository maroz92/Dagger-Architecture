package pl.mrozok.daggerarchitecture.host

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content.*
import pl.mrozok.daggerarchitecture.Logger
import pl.mrozok.daggerarchitecture.R

class AwesomeFragment : Fragment() {

    private val logger = Logger()
    private lateinit var navigator: HostNavigator

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_content, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigator = HostNavigator(activity!!, activity!!.supportFragmentManager)
        fragment_button.setText(R.string.bad_day)
        fragment_button.setOnClickListener { onChangeFragmentClick() }
        fragment_emoji.setText(R.string.smile)
    }

    private fun onChangeFragmentClick() {
        navigator.openNotSoAwesomeFragment()
    }
}