/**
 * Course: MAD302
 * Assignment: 1
 * Name: Khushi Patel
 * Student ID: A00198843
 * Date: 2026-03-27
 * Description: Displays details of selected course.
 */
package com.example.assignment_1_sem_2
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val code = intent.getStringExtra("code")
        val name = intent.getStringExtra("name")
        val desc = intent.getStringExtra("desc")

        findViewById<TextView>(R.id.txtCode).text = code
        findViewById<TextView>(R.id.txtName).text = name
        findViewById<TextView>(R.id.txtDesc).text = desc
    }
}