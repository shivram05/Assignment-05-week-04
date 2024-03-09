package com.example.assignment_5_week_4.problem_1.helper

import android.widget.RadioButton

class FoodPreferencesHelper {

    companion object {

        fun favouriteCuisine(
            chinese: RadioButton, french: RadioButton, italian: RadioButton, indian: RadioButton,
            japanese: RadioButton, thai: RadioButton, turkish: RadioButton
        ): String {
            if (chinese.isChecked) {
                return chinese.text.toString()
            }

            if (french.isChecked) {
                return french.text.toString()
            }
            if (italian.isChecked) {
                return italian.text.toString()
            }
            if (french.isChecked) {
                return french.text.toString()
            }
            if (indian.isChecked) {
                return indian.text.toString()
            }
            if (japanese.isChecked) {
                return japanese.text.toString()
            }
            if (thai.isChecked) {
                return thai.text.toString()
            }
            if (turkish.isChecked) {
                return turkish.text.toString()
            }

            return ""
        }

        fun oftenEat(
            never: RadioButton, rarely: RadioButton, sometimes: RadioButton, frequently: RadioButton
        ): String {
            if (never.isChecked) {
                return never.text.toString()
            }
            if (rarely.isChecked) {
                return rarely.text.toString()
            }
            if (sometimes.isChecked) {
                return sometimes.text.toString()
            }
            if (frequently.isChecked) {
                return frequently.text.toString()
            }
            return ""
        }

        fun spicyFood(
            yes: RadioButton, no: RadioButton
        ): String {
            if (yes.isChecked) {
                return yes.text.toString()
            }
            if (no.isChecked) {
                return no.text.toString()
            }
            return ""
        }

        fun vegetarianFood(
            yes: RadioButton, no: RadioButton
        ): String {
            if (yes.isChecked) {
                return yes.text.toString()
            }
            if (no.isChecked) {
                return no.text.toString()
            }
            return ""
        }

        fun seaFood(
            yes: RadioButton, no: RadioButton
        ): String {
            if (yes.isChecked) {
                return yes.text.toString()
            }
            if (no.isChecked) {
                return no.text.toString()
            }
            return ""
        }
    }
}