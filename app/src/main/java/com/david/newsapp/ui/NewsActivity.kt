package com.david.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.david.newsapp.R
import com.david.newsapp.databinding.ActivityNewsBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class NewsActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment

    //private  lateinit var binding: ActivityNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val bottomNavigationview= findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        val navController=findNavController(R.id.newsNavHostFragment)

        bottomNavigationview.setupWithNavController(navController)

       //bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}