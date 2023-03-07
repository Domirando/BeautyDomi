package uz.itschool.myapplication

import android.graphics.Color
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(val product_list: MutableList<Product>):RecyclerView.Adapter<ProductAdapter.MyHolder>() {
    class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var product_name:TextView = itemView.findViewById<TextView>(R.id.title)
        var img: ImageView = itemView.findViewById<ImageView>(R.id.image)
        var container: ConstraintLayout = itemView.findViewById(R.id.container)
//        var price: TextView = itemView.findViewById<TextView>(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var myHolder = MyHolder(LayoutInflater.from(parent.context).inflate( R.layout.carusel_item, parent, false))
        return myHolder
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var product = product_list.get(position)
        holder.product_name.text = product.product_name
//        holder.price.text = product.price.toString()
        holder.img.setImageResource(product.img)
        holder.container.setBackgroundColor(product.bg_color)
//        holder.container.setBackgroundResource(R.drawable.box_corner)
    }

    override fun getItemCount(): Int {
        return product_list.size
    }
}