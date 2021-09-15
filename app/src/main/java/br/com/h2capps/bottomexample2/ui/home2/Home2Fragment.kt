package br.com.h2capps.bottomexample2.ui.home2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import br.com.h2capps.bottomexample2.R
import kotlinx.coroutines.launch

class Home2Fragment : Fragment() {

    private lateinit var home2ViewModel: Home2ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        home2ViewModel = ViewModelProvider(this).get(Home2ViewModel::class.java)
        home2ViewModel.loadText()
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home_2, container, false)

        val button: Button = root.findViewById(R.id.buttonHome2)
        button.visibility = View.INVISIBLE

        home2ViewModel.text.observe(viewLifecycleOwner) {
            lifecycleScope.launch {
                button.visibility = View.VISIBLE
            }
        }

        button.setOnClickListener {
            findNavController().navigate(R.id.goToHome3)
        }

        return root
    }
}