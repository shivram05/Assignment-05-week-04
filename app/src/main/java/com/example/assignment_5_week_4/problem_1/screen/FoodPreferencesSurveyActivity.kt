package com.example.assignment_5_week_4.problem_1.screen

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assignment_5_week_4.R
import com.example.assignment_5_week_4.databinding.ActivityFoodPreferencesBinding
import com.example.assignment_5_week_4.problem_1.helper.FoodPreferencesHelper
import com.example.assignment_5_week_4.problem_1.helper.Validation

class FoodPreferencesActivity : AppCompatActivity() {

    companion object{
        const val TAG = "FoodPreferencesActivity"
    }

    lateinit var binding: ActivityFoodPreferencesBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodPreferencesBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.submit.setOnClickListener {
            val chinese = binding.chinese
            val french = binding.french
            val italian = binding.italian
            val indian = binding.indian
            val japanese = binding.japanese
            val thai = binding.thai
            val turkish = binding.turkish
            val never = binding.never
            val rarely = binding.rarely
            val sometimes = binding.sometimes
            val frequently = binding.frequently
            val yesSpicyFood = binding.yes
            val noSpicyFood = binding.no
            val yesVegetarian = binding.yesVegetarian
            val noVegetarain = binding.noVegetarian
            val yesSeaFood = binding.yesSeaFood
            val noSeaFood = binding.noSeaFood

            val favouriteCuisine = FoodPreferencesHelper.favouriteCuisine(chinese,french,italian,indian,japanese,thai,turkish)
            val oftenEat = FoodPreferencesHelper.oftenEat(never,rarely,sometimes,frequently)
            val spicyFood = FoodPreferencesHelper.spicyFood(yesSpicyFood,noSpicyFood)
            val vegetarianFood = FoodPreferencesHelper.vegetarianFood(yesVegetarian,noVegetarain)
            val seaFood = FoodPreferencesHelper.seaFood(yesSeaFood,noSeaFood)

            val validation = Validation.foodPreferencesValidation(favouriteCuisine,oftenEat,spicyFood,vegetarianFood,seaFood)
            if (validation == "NotEmptu") {
                binding.firstQuestion.text =
                    "${getString(R.string.what_is_your_favorite_cuisine)} : $favouriteCuisine"
                binding.secondQuestion.text =
                    "${getString(R.string.how_often_do_you_eat_out)} : $oftenEat"
                binding.thirdQuestion.text =
                    "${getString(R.string.do_you_prefer_spicy_food)} : $spicyFood"
                binding.fourthQuestion.text =
                    "${getString(R.string.do_you_prefer_vegetarian_food)} : $vegetarianFood"
                binding.fifthQuestion.text = "${getString(R.string.do_you_like_seafood)} : $seaFood"
            }else{
                Toast.makeText(this, validation, Toast.LENGTH_SHORT).show()
            }
        }
    }
}