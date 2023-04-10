package com.example.hw_0406

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val array = arrayOf<String>(1..100)
        var array = Array(100) {i -> "$i"}
        val myListView = findViewById<ListView>(R.id.listView)

        for(index in array.indices){
            //Log.i(TAG, "for loop: $item")
            if (array[index].toInt()%3 == 0 && array[index].toInt()%5 == 0){
                array[index] = "FizzBuzz"
            }
            else if (array[index].toInt()%3 == 0){
                array[index] = "Fizz"
            }
            else if (array[index].toInt()%5 == 0){
                array[index] = "Buzz"
            }
        }

        val adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, array
        )

        myListView.adapter = adapter

        /*myListView.setOnItemClickListener { adapterView, view, position, id ->
            var selectedItem = adapterView.getItemAtPosition(position)
            Log.i(TAG, "Clicked on $selectedItem of position $position")
        }
        */

    }
}