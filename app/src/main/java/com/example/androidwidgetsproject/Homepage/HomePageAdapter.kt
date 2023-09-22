package com.example.androidwidgetsproject.Homepage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.Toast
import com.example.androidwidgetsproject.R


class HomePageAdapter(val context: Context, val widgetdatalist: List<Homepagewidgetdata>) :
    BaseAdapter() {
    override fun getCount(): Int {
        return widgetdatalist.size
    }

    override fun getItem(p0: Int): Any {
        return widgetdatalist[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var myview = p1

        if (myview == null) {
            myview = LayoutInflater.from(context)
                .inflate(R.layout.activity_home_page_conent_view_manager, p2, false)
        }

        val Widgetbutton : Button? = myview?.findViewById(R.id.listviewbutton)

        Widgetbutton!!.text = widgetdatalist[p0].widgetname

        Widgetbutton.setOnClickListener { //click aaya chalse 1 min sir

            // aiya nay chale?
            Toast.makeText(context,widgetdatalist[p0].widgetname + " Clicked",Toast.LENGTH_SHORT).show()
        }
    
        return myview!!
    }

}

// na aama ny thy because aa activity nathi only class chhe so startactivity only activity ma chalse so
//and aa tu je try kr chho e apde fragment chalse aema thase i think ohk
// aani pela na project ma app j crash thai 6e Enu shu??kr to op