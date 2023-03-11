package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        var product = intent.getParcelableExtra<Product>("product")
        if(product !== null){
            var textView = findViewById<TextView>(R.id.desc)
            var image = findViewById<ImageView>(R.id.product_image)
            var btn = findViewById<Button>(R.id.buy)
            textView.text = product.desc
            btn.text = "${btn.text} it for ${product.price.toString()}$"
            image.setImageResource(product.img)
        }
    }
}