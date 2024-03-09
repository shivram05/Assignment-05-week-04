package com.example.assignment_5_week_4.problem_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment_5_week_4.databinding.ActivityProblemOneMainBinding
import com.example.assignment_5_week_4.problem_1.screen.DietaryHabitsSurveyActivity
import com.example.assignment_5_week_4.problem_1.screen.FoodPreferencesActivity

class ProblemOneMainActivity : AppCompatActivity() {

    lateinit var binding: ActivityProblemOneMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProblemOneMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.startSurvey.setOnClickListener {
            val isFoodPreferencesChecked = binding.foodPreferences.isChecked
            val dietaryHabitsChecked = binding.dietaryHabits.isChecked
            if (isFoodPreferencesChecked){
                startActivity(Intent(this, FoodPreferencesActivity::class.java))
            }
            if (dietaryHabitsChecked){
                startActivity(Intent(this, DietaryHabitsSurveyActivity::class.java))
            }
        }
    }
}