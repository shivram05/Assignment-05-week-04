package com.example.assignment_5_week_4.problem_2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.assignment_5_week_4.R
import com.example.assignment_5_week_4.databinding.ActivityProblmeTwoElctronicGadgetBinding
import com.example.assignment_5_week_4.problem_2.adapter.ElectronicGadgetsAdapter
import com.example.assignment_5_week_4.problem_2.model.Product

@Suppress("UNUSED_EXPRESSION")
class ProblemTwoElectronicGadgetActivity : AppCompatActivity(),
    ElectronicGadgetsAdapter.OnProductItemClickListener {
    private lateinit var binding: ActivityProblmeTwoElctronicGadgetBinding
    val addedProductList = mutableListOf<Product>()
    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProblmeTwoElctronicGadgetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val products = ArrayList<Product>()
        products.add(Product("iPad", resources.getIdentifier(R.drawable.ipad_logo.toString(),null,packageName), "iPad Pro 11-inch", 400.0, resources.getIdentifier(R.drawable.ipad.toString(),null,packageName)))
        products.add(Product("MacBook M3 Pro", resources.getIdentifier(R.drawable.ipad_logo.toString(), null,packageName),"12-core CPU\n18-core GPU", 2500.00, resources.getIdentifier(R.drawable.mac_book_pro_image.toString(),null,packageName)))
        products.add(Product("Dell Inspiron",  resources.getIdentifier(R.drawable.dell_logo.toString(), null,packageName), "13th Gen Intel® CoreTM i7", 1499.00,  resources.getIdentifier(R.drawable.dell_image.toString(), null,packageName)))
        products.add(
            Product(
                "Logitech Keyboard",
                resources.getIdentifier(R.drawable.logc_tech_keyboard_image.toString(), null,packageName),
                "Logitech - PRO X\nTKL LIGHTSPEED Wireless",
                199.00,
                resources.getIdentifier(R.drawable.logc_tech_keyboard_image.toString(), null,packageName)
            )
        )
        products.add(Product("MacBook M3 Max", resources.getIdentifier(R.drawable.ipad_logo.toString(),null,packageName), "14-core CPU\n30-core GPU", 3499.00,  resources.getIdentifier(R.drawable.mac_book_pro_image.toString(),null,packageName)))

        binding.recyclerView.adapter =
            ElectronicGadgetsAdapter(this).apply {
                submitList(products)
            }

        binding.viewCartBtn.setOnClickListener {
            Toast.makeText(this, addedProductList.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    override fun productItemClick(product: Product) {
        startActivity(Intent(this, ProductDetailsActivity::class.java).putExtra("product", product))
    }

    override fun productAddToCart(product: Product) {
        Toast.makeText(this, "Item is added", Toast.LENGTH_SHORT).show()
        addedProductList.clear()
        addedProductList.add(product)
    }
}