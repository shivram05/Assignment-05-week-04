package com.example.assignment_5_week_4.problem_2

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.assignment_5_week_4.databinding.ActivityProductDetailsBinding
import com.example.assignment_5_week_4.problem_2.model.Product

@Suppress("DEPRECATION")
class ProductDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductDetailsBinding
    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val product = intent.getSerializableExtra("product") as Product

        binding.detailsTitle.text = product.pName
        binding.detailsDescription.text = product.pDescription
        binding.detailsCost.text = "$ ${product.pCost}"
        binding.detailsImage.setImageDrawable(resources.getDrawable(product.pImage))

        binding.home.setOnClickListener {
            finish()
        }

    }
}