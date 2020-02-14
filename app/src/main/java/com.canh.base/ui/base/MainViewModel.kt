package com.canh.base.ui.base

import com.canh.base.data.local.prefs.AppPrefs

class MainViewModel(private val prefs: AppPrefs) : BaseViewModel(){
    fun saveString(){
        prefs.put("abc", "saved")
    }

    fun getString(): String ?{
        return prefs.get("abc", String::class.java, "")
    }

    fun clear(){
         prefs.clear()
    }
}