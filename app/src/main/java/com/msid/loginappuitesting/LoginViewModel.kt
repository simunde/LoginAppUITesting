package com.msid.loginappuitesting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private val _loginResult = MutableLiveData<String>()
    val loginResult: LiveData<String> get() = _loginResult

    fun login(username: String, password: String) {
        if (username == "Sid" && password == "Sid123456") {
            _loginResult.value = "Login Successful!"
        } else {
            _loginResult.value = "Login Failed!"
        }
    }
}