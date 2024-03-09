package com.example.assignment_5_week_4.problem_1.helper

class Validation {
    companion object {
        fun foodPreferencesValidation(
            favouriteCuisine: String,
            oftenEat: String,
            spicyFood: String,
            vegetarianFood: String,
            seaFood: String
        ) : String{

            if (favouriteCuisine.isEmpty()){
                return "Please Select Favorite Cuisine"
            }else if (oftenEat.isEmpty()){
                return "Please Select How Often Do you eat"
            } else  if (spicyFood.isEmpty()) {
                return "Please Select spicy Food"
            }else  if (vegetarianFood.isEmpty()) {
                return "Please vegetarian Food"
            }else  if (seaFood.isEmpty()) {
                return "Please seaFood Food"
            }
            return "NotEmptu"
        }

        fun dietaryHabitsValidation(
            vegetarian: String,
            organicFood: String,
            dairyProduct: String,
            fastFood: String,
            foodAllergies: String
        ) : String{
            if (vegetarian.isEmpty()){
                return "Please Select vegetarian"
            }else if (organicFood.isEmpty()){
                return "Please organic food"
            } else  if (dairyProduct.isEmpty()) {
                return "Please Select dairy product"
            }else  if (fastFood.isEmpty()) {
                return "Please fast Food"
            }else  if (foodAllergies.isEmpty()) {
                return "Please food allergies"
            }
            return "NotEmptu"
        }
    }
}