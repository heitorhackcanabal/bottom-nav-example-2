package br.com.h2capps.bottomexample2.ui.home2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Home2ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    fun loadText() {
        viewModelScope.launch(Dispatchers.IO) {
            Thread.sleep(5000)

            viewModelScope.launch(Dispatchers.Main) {
                _text.value = "Service loaded"
            }
        }
    }
}