package pl.mrozok.daggerarchitecture

import android.util.Log

class Logger {

    fun log(tag: String, message: String) {
        Log.d(tag, message)
    }
}