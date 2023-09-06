package com.android.fragmentproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.android.fragmentproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply{
            binding.button.setOnClickListener{
                setFragment(DetailFragment())
            }
            binding.button2.setOnClickListener{
                setFragment(NewsFragment())
            }
        }
    }
    private fun setFragment(frag: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, frag)
            .setReorderingAllowed(true)
            .addToBackStack(null)
            .commit()
    }
}