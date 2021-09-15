package br.com.h2capps.bottomexample2.ui.home3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Home3ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is browse fragment"
    }
    val text: LiveData<String> = _text
}