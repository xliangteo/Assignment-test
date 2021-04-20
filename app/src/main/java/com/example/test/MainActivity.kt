package com.example.test

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

public class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roomNumber = intent.getSerializableExtra("roomNumber").toString()


        val tv = findViewById<TextView>(R.id.tv)
        val button = findViewById<Button>(R.id.button)

        val tvDate = findViewById<EditText>(R.id.tvDate)
        val tvRoom = findViewById<EditText>(R.id.tvRoom)

        tv.text = roomNumber

        button.setOnClickListener{
            var date = tvDate.text.toString()
            var room = tvRoom.text.toString()

            //change activity
            val intent = Intent(this, Room::class.java)
            intent.putExtra("Date", date)
            intent.putExtra("Room", room)
            startActivity(intent)
        }
        /*

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

       button.setOnClickListener {
           val c= Calendar.getInstance()
           val year= c.get(Calendar.YEAR)
           val month = c.get(Calendar.MONTH)
           val day = c.get(Calendar.DAY_OF_MONTH)
           var dpd = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, mYear,mMonth , mDay ->
               val mmMonth = mMonth+1
               val date = "$mDay/$mmMonth/$mYear"
               tv.setText(date)
           },year,month,day)
           dpd.show()
       }*/
    }


}