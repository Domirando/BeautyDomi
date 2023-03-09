package uz.itschool.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.annotation.ColorLong
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import uz.itschool.myapplication.databinding.ActivityShoppingBinding
import java.util.*
import kotlin.system.exitProcess


class ShoppingActivity : AppCompatActivity() {
    lateinit var spinner: Spinner
    lateinit var locale: Locale
    private var currentLanguage = "en"
    private var currentLang: String? = null
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
        currentLanguage = intent.getStringExtra(currentLang).toString()
        spinner = findViewById(R.id.spinner)
        val list = ArrayList<String>()
        list.add("Select Language")
        list.add("English")
        list.add("Español")
        list.add("Français")
        list.add("Hindi")

        val adapter2 = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter2
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                when (position) {
                    0 -> {
                    }
                    1 -> setLocale("en")
                    2 -> setLocale("es")
                    3 -> setLocale("fr")
                    4 -> setLocale("hi")
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>) {}

        private fun setLocale(localeName: String) {
            if (localeName != currentLanguage) {
                locale = Locale(localeName)
                val res = resources
                val dm = res.displayMetrics
                val conf = res.configuration
                conf.locale = locale
                res.updateConfiguration(conf, dm)
                val refresh = Intent(
                    this,
                    MainActivity::class.java
                )
                refresh.putExtra(currentLang, localeName)
                startActivity(refresh)
            } else {
                Toast.makeText(
                    this@ShoppingActivity, "Language, , already, , selected)!", Toast.LENGTH_SHORT).show();
            }
        }
        override fun onBackPressed() {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.addCategory(Intent.CATEGORY_HOME)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
            finish()
            exitProcess(0)
        }
}}}