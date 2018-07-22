package pl.mrozok.daggerarchitecture

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content.*

class NotSoAwesomeFragment : Fragment() {

    private lateinit var navigator: Navigator

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_content, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigator = Navigator(activity!!.supportFragmentManager)
        fragment_button.setText(R.string.good_day)
        fragment_button.setOnClickListener { onChangeFragmentClick() }
        fragment_emoji.setText(R.string.sad)
    }

    private fun onChangeFragmentClick(){
        navigator.openAwesomeFragment()
    }
}