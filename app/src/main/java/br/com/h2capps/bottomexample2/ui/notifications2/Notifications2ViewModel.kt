package br.com.h2capps.bottomexample2.ui.notifications2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Notifications2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is my account fragment"
    }
    val text: LiveData<String> = _text
}