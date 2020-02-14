package com.canh.base;

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.canh.base.ui.base.MainViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
val viewModel :  MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
viewModel.saveString()

    }

    override fun onResume() {
        super.onResume()
        Log.d(">>>", "${viewModel.getString()}")

    }

    override fun onStop() {
        super.onStop()
        viewModel.clear()
    }
}
