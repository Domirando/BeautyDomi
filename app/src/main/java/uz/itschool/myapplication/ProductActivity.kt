package uz.itschool.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        var product = intent.getParcelableExtra<Product>("product")
        if(product !== null){
            var textView = findViewById<TextView>(R.id.desc)
            var image = findViewById<ImageView>(R.id.product_image)
            var btn = findViewById<Button>(R.id.buy)
            textView.setText(product.desc)
            btn.text = "${btn.text} -> ${product.price.toString()}$"
            image.setImageResource(product.img)
        }
        findViewById<Button>(R.id.buy).setOnClickListener {
            var sharedPreferences = getSharedPreferences("pincode_name", Context.MODE_PRIVATE)
            var editor = sharedPreferences.edit()
            editor.putInt("product_name", product!!.product_name)
            editor.putString("cost", product.price.toString())
            editor.apply()
            val intent = Intent(this@ProductActivity, UserProfileActivity::class.java)
            startActivity(intent)
        }
    }
}