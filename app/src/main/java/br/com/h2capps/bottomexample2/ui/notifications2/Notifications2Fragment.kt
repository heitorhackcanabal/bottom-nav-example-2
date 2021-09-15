package br.com.h2capps.bottomexample2.ui.notifications2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.h2capps.bottomexample2.R

class Notifications2Fragment : Fragment() {

    private lateinit var notifications2ViewModel: Notifications2ViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        notifications2ViewModel =
                ViewModelProvider(this).get(Notifications2ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications_2, container, false)
        val textView: TextView = root.findViewById(R.id.text_notifications_2)
        notifications2ViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}