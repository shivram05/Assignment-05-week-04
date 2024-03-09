package com.example.assignment_5_week_4.problem_2.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment_5_week_4.databinding.ElectronicGadgetsLayoutBinding
import com.example.assignment_5_week_4.problem_2.model.Product

class ElectronicGadgetsAdapter(private val  itemClick : OnProductItemClickListener ) :
    ListAdapter<Product, ElectronicGadgetsAdapter.ViewHolder>(diffUtil){


    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Product>() {
            override fun areItemsTheSame(
                oldItem: Product,
                newItem: Product
            ): Boolean = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: Product,
                newItem: Product
            ): Boolean = oldItem == newItem

        }
    }

    inner class  ViewHolder(
        private val binding: ElectronicGadgetsLayoutBinding
    ) : RecyclerView.ViewHolder(binding.root){
        @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
        fun updateView(item: Product) {
            binding.name.text = item.pName
            binding.description.text = item.pDescription
            binding.price.text = "$ ${item.pCost}"
            binding.logo.setImageDrawable(binding.root.context.getDrawable(item.pLogo))
            binding.pImage.setImageDrawable(binding.root.context.getDrawable(item.pImage))

            binding.constraintMain.apply {
                setOnClickListener {
                    itemClick.productItemClick(item)
                }
            }

            binding.addButton.setOnClickListener {
                itemClick.productAddToCart(item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElectronicGadgetsAdapter.ViewHolder {
        return ViewHolder(
            ElectronicGadgetsLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ElectronicGadgetsAdapter.ViewHolder, position: Int) {
        holder.updateView(getItem(position))
    }

    interface OnProductItemClickListener{
        fun productItemClick(product: Product)
        fun productAddToCart(product: Product)
    }
}