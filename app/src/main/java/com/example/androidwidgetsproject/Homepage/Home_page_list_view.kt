package com.example.androidwidgetsproject.Homepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.androidwidgetsproject.MainActivity
import com.example.androidwidgetsproject.R

class Home_page_list_view : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page_list_view)


        val Homepagelist: ListView = findViewById(R.id.HomePage_Listview)

        val mydataList = mutableListOf<Homepagewidgetdata>()

//        mydayaList.add(Homepagewidgetdata("Constraint_layout", Constraint_layout_prac::class.java))
//        mydayaList.add(Homepagewidgetdata("Relative_layout", "Relative_layout_prac"))
//        mydayaList.add(Homepagewidgetdata("Linear_layout", "linear_layout_prac"))
//        mydayaList.add(Homepagewidgetdata("Date_Time", "Date_Time_Picker_prac"))
//        mydayaList.add(Homepagewidgetdata("Check_Box", "Checkbox_prac"))
//        mydayaList.add(Homepagewidgetdata("Radio", "Radio_prac"))
//        mydayaList.add(Homepagewidgetdata("Card_View", "Card_View_prac"))
//        mydayaList.add(Homepagewidgetdata("Spinner", "Spinner_prac"))
//        mydayaList.add(Homepagewidgetdata("Image_view", "Image_View_prac"))
//        mydayaList.add(Homepagewidgetdata("Toggle_Button", "Toggle_prac"))
//        mydayaList.add(Homepagewidgetdata("Switch_Compat", "Switch_Compat_prac"))
//        mydayaList.add(Homepagewidgetdata("Grid_view", "Grid_View_prac"))
//        mydayaList.add(Homepagewidgetdata("List_view", "List_view_prac"))

        mydataList.add(Homepagewidgetdata("Seek Bar",Intent(this,MainActivity::class.java)))

        Homepagelist.adapter = HomePageAdapter(this,mydataList)
        
        Homepagelist.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this,mydataList[i].widgetname + " Clicked",Toast.LENGTH_SHORT).show()
        }
    }
}