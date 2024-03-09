package com.example.assignment_5_week_4.problem_1.screen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assignment_5_week_4.R
import com.example.assignment_5_week_4.databinding.ActivityDietaryHabitsBinding
import com.example.assignment_5_week_4.problem_1.helper.DietaryHabitsHelper
import com.example.assignment_5_week_4.problem_1.helper.Validation

class DietaryHabitsSurveyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDietaryHabitsBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDietaryHabitsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.submit.setOnClickListener {
            val yesVegetarian = binding.yes
            val noVegetarian = binding.no
            val yesOrganicFood = binding.yesOrganic
            val noOrganicFood = binding.noOrganic
            val yesDairyProduct = binding.yesDairyProduct
            val noDairyProduct = binding.noDairyProduct
            val yesFastFood = binding.yesFastFood
            val noFastFood = binding.noFastFood
            val yesFoodAllergies = binding.yesFoodAllergies
            val noFoodAllergies = binding.noFoodAllergies

            val vegetarian = DietaryHabitsHelper.vegetarian(yesVegetarian,noVegetarian)
            val organicFood = DietaryHabitsHelper.organicFood(yesOrganicFood,noOrganicFood)
            val dairyProduct = DietaryHabitsHelper.dairyProducts(yesDairyProduct,noDairyProduct)
            val fastFood = DietaryHabitsHelper.fastFood(yesFastFood,noFastFood)
            val foodAllergies = DietaryHabitsHelper.foodAllergies(yesFoodAllergies,noFoodAllergies)

            val validation = Validation.dietaryHabitsValidation(vegetarian,organicFood,dairyProduct,fastFood,foodAllergies)

            if (validation== "NotEmptu"){
                binding.firstQuestion.text =
                    "${getString(R.string.are_you_vegetarian)} : $vegetarian"
                binding.secondQuestion.text =
                    "${getString(R.string.do_you_prefer_organic_food)} : $organicFood"
                binding.thirdQuestion.text =
                    "${getString(R.string.do_you_consume_dairy_products)} : $dairyProduct"
                binding.fourthQuestion.text =
                    "${getString(R.string.do_you_eat_fast_food)} : $fastFood"
                binding.fifthQuestion.text = "${getString(R.string.do_you_have_any_food_allergies)} : $foodAllergies"
            }else{
                Toast.makeText(this, validation, Toast.LENGTH_SHORT).show()
            }

        }
    }
}