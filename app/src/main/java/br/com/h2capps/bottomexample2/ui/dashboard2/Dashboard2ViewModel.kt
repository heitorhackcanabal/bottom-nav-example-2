package br.com.h2capps.bottomexample2.ui.dashboard2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Dashboard2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is rewards fragment"
    }
    val text: LiveData<String> = _text
}