package uz.itschool.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.annotation.ColorLong
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import uz.itschool.myapplication.databinding.ActivityShoppingBinding


class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding= ActivityShoppingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var product_list = mutableListOf<Product>()
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__1_, Color.parseColor("#FFEF92")))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__1_, Color.parseColor("#F5CAC3")))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__1_, Color.parseColor("#B6D7CF")))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__2_, Color.parseColor("#A9D7DA")))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__1_, Color.parseColor("#FFEF92")))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__1_, Color.parseColor("#F5CAC3")))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__1_, Color.parseColor("#B6D7CF")))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12__2_, Color.parseColor("#A9D7DA")))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable.frame_12))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
//        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        var adapter = ProductAdapter(product_list)
        binding.productList.adapter = adapter
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.HORIZONTAL)
        val layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.productList.setLayoutManager(layoutManager)
    }
}