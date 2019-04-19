package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private var _toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbarToLoad(toolbar as Toolbar)
        setNavDrawer()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return true
    }

    private fun setNavDrawer(){
        val toggle = ActionBarDrawerToggle(this, drawerLayout, _toolbar, R.string.open_drawer, R.string.close_drawer)
        toggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)
    }

    private fun toolbarToLoad(toolbar: Toolbar?){
        this._toolbar = toolbar
        this._toolbar?.let { setSupportActionBar(this._toolbar) }
    }

    private fun enableHomeDisplay(value: Boolean){
        supportActionBar?.setDisplayHomeAsUpEnabled(value)
    }
}
