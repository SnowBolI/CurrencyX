package com.android.currencyx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    lateinit var newsFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        viewPager.adapter =

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.news -> {
//                    replaceFragment(NewsFragment())
                    viewPager.currentItem = 0
                    return@setOnNavigationItemSelectedListener true
                }
                // Add more cases for other menu items if needed
                else -> false
            }
        }

        // Show the initial fragment (you may want to show a default fragment)
    }

//    private fun replaceFragment(fragment: Fragment) {
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.bottomNavigationView, fragment)
//            .commit()
//    }
}
