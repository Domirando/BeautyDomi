package uz.itschool.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import uz.itschool.myapplication.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    lateinit var name_f: EditText
    lateinit var pincode: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        var submit = findViewById<Button>(R.id.submit)
        var sharedPreferences = getSharedPreferences("pincode_name", Context.MODE_PRIVATE)
        var getName = sharedPreferences.getString("username", "").toString()
        var getPincode = sharedPreferences.getString("pincode", "").toString()

        if (getName !== "" && getPincode !== ""){
            findViewById<TextView>(R.id.register).text = "Your Pincode: "
            findViewById<EditText>(R.id.name).visibility = View.GONE
            findViewById<EditText>(R.id.surname).visibility = View.GONE
            findViewById<CheckBox>(R.id.checkbox).visibility = View.GONE
            findViewById<Button>(R.id.submit).visibility = View.GONE
            findViewById<Button>(R.id.login).visibility = View.VISIBLE
        }
        pincode = findViewById(R.id.pincode)
        findViewById<Button>(R.id.login).setOnClickListener {
            if (pincode.text.toString() == getPincode){
                val intent = Intent(this@RegistrationActivity, ShoppingActivity::class.java)
                startActivity(intent)
            }else {
                findViewById<TextView>(R.id.warning).visibility = View.VISIBLE
            }
        }
        submit.setOnClickListener{
            name_f = findViewById(R.id.name)
            var editor = sharedPreferences.edit()
            editor.putString("username", name_f.text.toString())
            editor.putString("pincode", pincode.text.toString())
            editor.apply()
            val intent = Intent(this@RegistrationActivity, ShoppingActivity::class.java)
            startActivity(intent)
        }
    }

}