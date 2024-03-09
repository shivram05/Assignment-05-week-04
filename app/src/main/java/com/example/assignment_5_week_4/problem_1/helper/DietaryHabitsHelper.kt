package com.example.assignment_5_week_4.problem_1.helper

import android.widget.RadioButton

class DietaryHabitsHelper {

    companion object {

        fun vegetarian(
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

        fun organicFood(
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

        fun dairyProducts(
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

        fun fastFood(
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

        fun foodAllergies(
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