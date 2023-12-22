package com.example.bottomnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var frame: FrameLayout
    lateinit var bottom_view: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        frame = findViewById(R.id.frame)
        bottom_view = findViewById(R.id.bottom_view)

        supportFragmentManager.beginTransaction().replace(R.id.frame,MessageFragment()).commit()


        bottom_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                R.id.Home -> {

                    supportFragmentManager.beginTransaction().replace(R.id.frame,HomeFragment()).commit()


                }

                R.id.Message -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,MessageFragment()).commit()

                }

                R.id.Profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,MessageFragment()).commit()

                }

                R.id.Setting -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,SettingFragment()).commit()


                }




            }
            true

        }
    }
}




