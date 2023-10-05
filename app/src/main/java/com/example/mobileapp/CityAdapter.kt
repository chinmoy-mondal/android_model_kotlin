package com.example.mobileapp

import android.graphics.drawable.DrawableContainer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.text.FieldPosition

class CityAdapter(val cityData:Array<City>): BaseAdapter(){
    override fun getCount(): Int {
        return cityData.size
    }

    override fun getItem(position: Int): City {
        return cityData[position]
    }

    override fun getItemId(position: Int): Long {
        return cityData[position].name.hashCode().toLong()
    }

    override fun getView(position: Int, convertView: View?, container: ViewGroup?): View {
        val convertView = LayoutInflater.from(container?.context ).inflate(R.layout.city_item,container,false)


        val cityCountry:TextView = convertView.findViewById(R.id.city_country)
        val cityName:TextView = convertView.findViewById(R.id.city_name)

        cityCountry.text = getItem(position).country
        cityName.text = getItem(position).name

        return convertView
    }
}