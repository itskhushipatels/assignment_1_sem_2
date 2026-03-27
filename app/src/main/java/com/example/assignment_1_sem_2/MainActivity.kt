/**
 * Course: MAD302
 * Assignment: 1
 * Name: Khushi Patel
 * Student ID: A00198843
 * Date: 2026-03-27
 * Description: Displays a list of courses using RecyclerView.
 */
package com.example.assignment_1_sem_2
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // List of courses
        val courseList = listOf(
            Course("MAD307", "Graphics and Animation", "Learn about graphics and animation"),
            Course("MAD402", "iOS Development", "Learn iOS development"),
            Course("MAD411", "Mobile App Testing and QA", "Learn testing and QA"),
            Course("MAD407", "Mobile app store Opt and market", "Learn about app store optimization"),
            Course("MAD302", "Android Development", "Learn Android development"),
            Course("MAD317", "Mobile App Project Develoment", "Learn project development"),

        )

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = CourseAdapter(courseList) { course ->
            // Open DetailActivity
            val intent = Intent(this, DetailActivity::class.java)

            // Pass data
            intent.putExtra("code", course.code)
            intent.putExtra("name", course.name)
            intent.putExtra("desc", course.description)

            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }
}