package com.csci4020k.todolistassignment

import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.widget.TextView
import androidx.fragment.app.FragmentActivity

class TaskCompleted : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_completed)

        val textToDisplay = intent.getStringExtra("TASKS")
        val messageText = null
        messageText.text = textToDisplay

        //makes the goBackButton go back to the previous layout
        goBackButton.setOnClickListener{
            finish()
            messageText.text = ""
            finish()
        }
    }

}