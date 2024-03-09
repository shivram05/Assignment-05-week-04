package com.example.assignment_5_week_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment_5_week_4.databinding.ActivityMainBinding
import com.example.assignment_5_week_4.problem_1.ProblemOneMainActivity
import com.example.assignment_5_week_4.problem_2.ProblemTwoElectronicGadgetActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.foodPreferences.setOnClickListener {
            startActivity(Intent(this, ProblemOneMainActivity::class.java))
        }

        binding.electronicGadgets.setOnClickListener {
            startActivity(Intent(this,ProblemTwoElectronicGadgetActivity::class.java))
        }
    }
}