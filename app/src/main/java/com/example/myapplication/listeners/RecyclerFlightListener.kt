package com.example.myapplication.listeners

import com.example.myapplication.models.Flight

interface RecyclerFlightListener {

    fun onClick(flight: Flight, position: Int)
    fun onDelete(flight: Flight, position: Int)
}