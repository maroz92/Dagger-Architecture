package pl.mrozok.daggerarchitecture.host

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_content.*
import pl.mrozok.daggerarchitecture.R
import pl.mrozok.daggerarchitecture.common.Logger
import javax.inject.Inject

class NotSoAwesomeFragment : Fragment() {

    @Inject
    lateinit var logger: Logger
    @Inject
    lateinit var navigator: HostNavigator

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getHostComponent().inject(this)
    }

    private fun getHostComponent() = (activity as HostActivity).hostComponent

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_content, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragment_button.setText(R.string.good_day)
        fragment_button.setOnClickListener { onChangeFragmentClick() }
        fragment_emoji.setText(R.string.sad)
    }

    private fun onChangeFragmentClick() {
        navigator.openAwesomeFragment()
    }
}