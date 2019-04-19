package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var _toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbarToLoad(toolbar as Toolbar)
    }

    private fun toolbarToLoad(toolbar: Toolbar?){
        this._toolbar = toolbar
        this._toolbar?.let { setSupportActionBar(this._toolbar) }
    }

    private fun enableHomeDisplay(value: Boolean){
        supportActionBar?.setDisplayHomeAsUpEnabled(value)
    }
}
