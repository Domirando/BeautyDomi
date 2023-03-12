package uz.itschool.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class UserProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        var sharedPreferences = getSharedPreferences("pincode_name", Context.MODE_PRIVATE)
        var name = sharedPreferences.getString("username", "").toString()
        var surname = sharedPreferences.getString("surname", "").toString()
        var pincode = sharedPreferences.getString("pincode", "").toString()
        var number = sharedPreferences.getString("phone", "").toString()
        var product = sharedPreferences.getInt("product_name", 0)
        var cost = sharedPreferences.getString("cost", "").toString()
        Log.d("cost", cost)
        findViewById<TextView>(R.id.name).text = name
        findViewById<TextView>(R.id.surname).text = surname
        findViewById<TextView>(R.id.pincode).text = pincode
        findViewById<TextView>(R.id.phone).text = number
        findViewById<TextView>(R.id.purchase).setText(product)
        findViewById<TextView>(R.id.cost).text = cost+"$"
    }
}