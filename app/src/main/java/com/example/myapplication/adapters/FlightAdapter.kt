package com.example.myapplication.adapters

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.R
import com.example.myapplication.inflate
import com.example.myapplication.listeners.RecyclerFlightListener
import com.example.myapplication.loadByResource
import com.example.myapplication.models.Flight
import kotlinx.android.synthetic.main.recycler_flight.view.*

class FlightAdapter(private val flights: List<Flight>, private val listener: RecyclerFlightListener)
    : RecyclerView.Adapter<FlightAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(parent.inflate(R.layout.recycler_flight))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(flights[position], listener)

    override fun getItemCount(): Int = flights.size

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(flight: Flight, listener: RecyclerFlightListener) = with(itemView){
            textViewCity.text = flight.city
            imageViewBg.loadByResource(flight.imgResource)

            setOnClickListener {
                listener.onClick(flight, adapterPosition)
            }

            buttonDelete.setOnClickListener { listener.onDelete(flight, adapterPosition) }
        }
    }
}