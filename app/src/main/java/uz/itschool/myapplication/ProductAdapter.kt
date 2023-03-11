package uz.itschool.myapplication

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(val product_list: MutableList<Product>):RecyclerView.Adapter<ProductAdapter.MyHolder>() {
    var onItemClick: ((Product) -> Unit)? = null
    class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var product_name:TextView = itemView.findViewById<TextView>(R.id.title)
        var discount:TextView = itemView.findViewById<TextView>(R.id.discount)
        var price:TextView = itemView.findViewById<TextView>(R.id.price)
        var img: ImageView = itemView.findViewById<ImageView>(R.id.image)
        var extra:LinearLayout = itemView.findViewById(R.id.extra)
        var container: ConstraintLayout = itemView.findViewById(R.id.container)
//        var price: TextView = itemView.findViewById<TextView>(R.id.price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var myHolder = MyHolder(LayoutInflater.from(parent.context).inflate( R.layout.carusel_item, parent, false))
        return myHolder
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var product = product_list.get(position)
        holder.container.setBackgroundColor(product.bg_color)
        holder.product_name.text = product.product_name
        holder.itemView.setOnClickListener{
            onItemClick?.invoke(product)
        }
        if (product.orientation=="vertical"){
            holder.extra.visibility = View.VISIBLE
            holder.discount.text = product.discount
            holder.price.text = "$"+product.price
            holder.container.setBackgroundColor(Color.WHITE)
        }else{
            holder.container.layoutParams.width = 450
        }
        holder.img.setImageResource(product.img)
    }

    override fun getItemCount(): Int {
        return product_list.size
    }
}