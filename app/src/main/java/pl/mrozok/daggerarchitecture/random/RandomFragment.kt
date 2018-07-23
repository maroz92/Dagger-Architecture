package pl.mrozok.daggerarchitecture.random

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_random.*
import pl.mrozok.daggerarchitecture.R

class RandomFragment : Fragment() {

    companion object {
        private const val EXTRA_EMOJI = "RandomFragment.Emoji"

        fun create(emoji: String): RandomFragment {
            val bundle = Bundle().apply {
                putString(EXTRA_EMOJI, emoji)
            }
            return RandomFragment().apply {
                arguments = bundle
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_random, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.getString(EXTRA_EMOJI)?.run {
            random_emoji.text = this
        }
    }
}