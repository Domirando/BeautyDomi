package uz.itschool.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import uz.itschool.myapplication.databinding.ActivityShoppingBinding


class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding= ActivityShoppingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var product_list = mutableListOf<Product>()
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        product_list.add(Product("Toner", 2540, "It helps to whiten you skin and keeps from lines", R.drawable._82884912))
        var adapter = ProductAdapter(product_list)
        binding.productList.adapter = adapter
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)
        binding.productList.setLayoutManager(staggeredGridLayoutManager)
    }

}