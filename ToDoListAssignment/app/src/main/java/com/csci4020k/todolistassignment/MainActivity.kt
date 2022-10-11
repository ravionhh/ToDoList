package com.csci4020k.todolistassignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var messageToDisplay: String =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton
        submitButton.setOnClickListener {
            //goes to the completed layout
            if(checkBox1.isChecked)
                messageToDisplay = checkBox1.text.toString()
            if(checkBox2.isChecked)
                messageToDisplay+= "\n" + checkBox2.text.toString()
            if(checkBox3.isChecked)
                messageToDisplay+= "\n" + checkBox3.text.toString()
            if(checkBox4.isChecked)
                messageToDisplay+= "\n" + checkBox4.text.toString()
            if(checkBox5.isChecked)
                messageToDisplay+= "\n" + checkBox5.text.toString()
            if(checkBox6.isChecked)
                messageToDisplay+= "\n" + checkBox6.text.toString()
            if(checkBox7.isChecked)
                messageToDisplay+= "\n" + checkBox7.text.toString()
            if(checkBox8.isChecked)
                messageToDisplay+= "\n" + checkBox8.text.toString()
            if(checkBox9.isChecked)
                messageToDisplay+= "\n" + checkBox9.text.toString()
            if(checkBox10.isChecked)
                messageToDisplay+= "\n" + checkBox10.text.toString()

            val updateIntent = Intent(this, CompletedTasks::class.java)

            updateIntent.putExtra("TASKS",messageToDisplay)
            startActivity(updateIntent)
        }

    }

}