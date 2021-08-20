package com.ziadsyahrul.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ziadsyahrul.simpleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val home = FragmentHome()
        val profile = FragmentProfile()

        currentFragment(home)

        binding.navigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.home -> currentFragment(home)
                R.id.profile -> currentFragment(profile)
            }

            true
        }

    }

    private fun currentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.content, fragment)
            commit()
        }
    }
}