package br.com.h2capps.bottomexample2.ui.home3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.h2capps.bottomexample2.R

class Home3Fragment : Fragment() {

    private lateinit var home3ViewModel: Home3ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        home3ViewModel =
                ViewModelProvider(this).get(Home3ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home_3, container, false)
        val textView: TextView = root.findViewById(R.id.text_home_3)
        home3ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}