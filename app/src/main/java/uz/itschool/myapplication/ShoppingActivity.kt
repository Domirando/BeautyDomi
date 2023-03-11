package uz.itschool.myapplication

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import uz.itschool.myapplication.databinding.ActivityShoppingBinding


class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding= ActivityShoppingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var sharedPreferences = getSharedPreferences("pincode_name", Context.MODE_PRIVATE)
        var name = sharedPreferences.getString("username", "").toString()
        findViewById<TextView>(R.id.title_n).text = "Let's take care of your skin "+name
        var product_list = mutableListOf<Product>()
        product_list.add(Product("Face Toner", 2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#FFEF92"), null, "horizontal"))
        product_list.add(Product("Face Serum", 2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__1__removebg_preview, Color.parseColor("#F5CAC3"), null, "horizontal"))
        product_list.add(Product("Cream anti-acne",2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__2__removebg_preview, Color.parseColor("#B6D7CF"), null, "horizontal"))
        product_list.add(Product("Toner anti-aging", 2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.r_removebg_preview, Color.parseColor("#A9D7DA"), null, "horizontal"))
        product_list.add(Product("Face whitening", 2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.r__1__removebg_preview, Color.parseColor("#FFEF92"), null, "horizontal"))
        product_list.add(Product("Fce Toner", 2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__2__removebg_preview, Color.parseColor("#F5CAC3"), null, "horizontal"))
        product_list.add(Product("Eye Liner", 2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#B6D7CF"), null, "horizontal"))
        product_list.add(Product("Face Powder", 2000, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip_removebg_preview, Color.parseColor("#A9D7DA"), null, "horizontal"))
        var product_list_v = mutableListOf<Product>()
        product_list_v.add(Product("Face Toner", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#FFEF92"), "70%", "vertical"))
        product_list_v.add(Product("Face Serum", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__1__removebg_preview, Color.parseColor("#F5CAC3"), "50%", "vertical"))
        product_list_v.add(Product("Cream anti-acne", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__2__removebg_preview, Color.parseColor("#B6D7CF"), "30%", "vertical"))
        product_list_v.add(Product("Toner anti-aging", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.r_removebg_preview, Color.parseColor("#A9D7DA"), "50%", "vertical"))
        product_list_v.add(Product("Face whitening", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.r__1__removebg_preview, Color.parseColor("#FFEF92"), "30%", "vertical"))
        product_list_v.add(Product("Fce Toner", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__2__removebg_preview, Color.parseColor("#F5CAC3"),"70%", "vertical"))
        product_list_v.add(Product("Eye Liner", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#B6D7CF"), "60%", "vertical"))
        product_list_v.add(Product("Face Powder", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip_removebg_preview, Color.parseColor("#A9D7DA"), "30%", "vertical"))
        var adapter = ProductAdapter(product_list)
        var product_list2_v = mutableListOf<Product>()
        product_list2_v.add(Product("Face Toner", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#FFEF92"), null, "vertical"))
        product_list2_v.add(Product("Face Serum", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__1__removebg_preview, Color.parseColor("#F5CAC3"), "50%", "vertical"))
        product_list2_v.add(Product("Cream anti-acne", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__2__removebg_preview, Color.parseColor("#B6D7CF"), "30%", "vertical"))
        product_list2_v.add(Product("Toner anti-aging", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.r_removebg_preview, Color.parseColor("#A9D7DA"), "50%", "vertical"))
        product_list2_v.add(Product("Face whitening", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.r__1__removebg_preview, Color.parseColor("#FFEF92"), null, "vertical"))
        product_list2_v.add(Product("Fce Toner", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip__2__removebg_preview, Color.parseColor("#F5CAC3"),null, "vertical"))
        product_list2_v.add(Product("Eye Liner", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#B6D7CF"), "60%", "vertical"))
        product_list2_v.add(Product("Face Powder", 2540, "ScrollView with a match_parent height view inside. in this layout, maybe that big banner was not exists, so it's hide as you see in the other picture. a part of this layout contains a text, so I want to scroll hole contents together but I want height of the background under text fills my screen and don't effect on the scroll, so scroll", R.drawable.oip_removebg_preview, Color.parseColor("#A9D7DA"), "30%", "vertical"))
        var adapter2_v = ProductAdapter(product_list2_v)
        var adapter_v = ProductAdapter(product_list_v)
        adapter.onItemClick = {
            var intent = Intent(this, ProductActivity::class.java)
            intent.putExtra("product", it)
            startActivity(intent)
        }
        adapter2_v.onItemClick = {
            var intent = Intent(this, ProductActivity::class.java)
            intent.putExtra("product", it)
            startActivity(intent)
        }
        adapter_v.onItemClick = {
            var intent = Intent(this, ProductActivity::class.java)
            intent.putExtra("product", it)
            startActivity(intent)
        }
        binding.productListV.adapter = adapter_v
        binding.productList.adapter = adapter
        binding.productListVv.adapter = adapter2_v
        val staggeredGridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        val staggeredGridLayoutManager2 = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        val layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.productListV.setLayoutManager(staggeredGridLayoutManager)
        binding.productListVv.setLayoutManager(staggeredGridLayoutManager2)
        binding.productList.setLayoutManager(layoutManager)
    }
}