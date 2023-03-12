package uz.itschool.myapplication

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import uz.itschool.myapplication.databinding.ActivityShoppingBinding
import java.util.*


class ShoppingActivity : AppCompatActivity() {
    private lateinit var context: Context
    lateinit var spinner:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding= ActivityShoppingBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        spinner = findViewById(R.id.spinner)
        var languages = mutableListOf<String>("Uzb", "Ru")
        languages.add(0, "Eng");

        val adapter_spinner = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, languages)
        spinner.adapter = adapter_spinner
        fun setLocal(activity:Activity, langCode:String){
            var locale = Locale(langCode)
            Locale.setDefault(locale)
            var resources = activity.resources
            var configuration = resources.configuration
            configuration.setLocale(locale)
            resources.updateConfiguration(configuration, resources.displayMetrics)
        }
        spinner.setSelection(0)
        spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (languages.get(p2) === "Ru"){
                    setLocal(this@ShoppingActivity, "ru")
                    finish()
                    startActivity(getIntent())
                } else if (languages.get(p2)==="Uzb"){
                    setLocal(this@ShoppingActivity, "uz")
                    finish()
                    startActivity(getIntent())
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                setLocal(this@ShoppingActivity, "eng")
                finish()
                startActivity(getIntent())
            }

        }

        var sharedPreferences = getSharedPreferences("pincode_name", Context.MODE_PRIVATE)
        var name = sharedPreferences.getString("username", "").toString()
        findViewById<TextView>(R.id.title_n).setText(R.string.app_name)
        var product_list = mutableListOf<Product>()
        product_list.add(Product(R.string.toner, 2000, R.string.toner_desc, R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#FFEF92"), null, "horizontal"))
        product_list.add(Product(R.string.cream, 2000, R.string.toner_desc, R.drawable.oip__1__removebg_preview, Color.parseColor("#F5CAC3"), null, "horizontal"))
        product_list.add(Product(R.string.peeling,2000, R.string.peeling_desc, R.drawable.oip__2__removebg_preview, Color.parseColor("#B6D7CF"), null, "horizontal"))
        product_list.add(Product(R.string.scrub, 2000, R.string.scrub_desc, R.drawable.r_removebg_preview, Color.parseColor("#A9D7DA"), null, "horizontal"))
        product_list.add(Product(R.string.serum, 2000, R.string.serum_desc, R.drawable.r__1__removebg_preview, Color.parseColor("#FFEF92"), null, "horizontal"))
        product_list.add(Product(R.string.toner, 2000, R.string.toner_desc, R.drawable.oip__2__removebg_preview, Color.parseColor("#F5CAC3"), null, "horizontal"))
        product_list.add(Product(R.string.peeling, 2000, R.string.peeling_desc, R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#B6D7CF"), null, "horizontal"))
        product_list.add(Product(R.string.cream, 2000, R.string.cream_desc, R.drawable.oip_removebg_preview, Color.parseColor("#A9D7DA"), null, "horizontal"))
        var product_list_v = mutableListOf<Product>()
        product_list_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#FFEF92"), "70%", "vertical"))
        product_list_v.add(Product(R.string.peeling, 2540, R.string.peeling_desc, R.drawable.oip__1__removebg_preview, Color.parseColor("#F5CAC3"), "50%", "vertical"))
        product_list_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.oip__2__removebg_preview, Color.parseColor("#B6D7CF"), "30%", "vertical"))
        product_list_v.add(Product(R.string.scrub, 2540, R.string.scrub_desc, R.drawable.r_removebg_preview, Color.parseColor("#A9D7DA"), "50%", "vertical"))
        product_list_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.r__1__removebg_preview, Color.parseColor("#FFEF92"), "30%", "vertical"))
        product_list_v.add(Product(R.string.serum, 2540, R.string.serum_desc, R.drawable.oip__2__removebg_preview, Color.parseColor("#F5CAC3"),"70%", "vertical"))
        product_list_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#B6D7CF"), "60%", "vertical"))
        product_list_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.oip_removebg_preview, Color.parseColor("#A9D7DA"), "30%", "vertical"))
        var adapter = ProductAdapter(product_list)
        var product_list2_v = mutableListOf<Product>()
        product_list2_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#FFEF92"), null, "vertical"))
        product_list2_v.add(Product(R.string.scrub, 2540, R.string.scrub_desc, R.drawable.oip__1__removebg_preview, Color.parseColor("#F5CAC3"), "50%", "vertical"))
        product_list2_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.oip__2__removebg_preview, Color.parseColor("#B6D7CF"), "30%", "vertical"))
        product_list2_v.add(Product(R.string.peeling, 2540, R.string.peeling_desc, R.drawable.r_removebg_preview, Color.parseColor("#A9D7DA"), "50%", "vertical"))
        product_list2_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.r__1__removebg_preview, Color.parseColor("#FFEF92"), null, "vertical"))
        product_list2_v.add(Product(R.string.scrub, 2540, R.string.scrub_desc, R.drawable.oip__2__removebg_preview, Color.parseColor("#F5CAC3"),null, "vertical"))
        product_list2_v.add(Product(R.string.toner, 2540, R.string.toner_desc, R.drawable.brightening_white_essence_1_768x912_removebg_preview, Color.parseColor("#B6D7CF"), "60%", "vertical"))
        product_list2_v.add(Product(R.string.serum, 2540, R.string.serum_desc, R.drawable.oip_removebg_preview, Color.parseColor("#A9D7DA"), "30%", "vertical"))
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

    fun UserProfile(view: View) {
        val intent = Intent(this@ShoppingActivity, UserProfileActivity::class.java)
        startActivity(intent)
    }
}

